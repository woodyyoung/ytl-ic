package com.lty.ic.gw.kafak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lty.ic.gw.bean.enums.EnumMsgType;
import com.lty.ic.gw.bean.message.Message;
import com.lty.ic.gw.bean.message.MessageHeader;
import com.lty.ic.gw.bean.message.ResponseMessage;
import com.lty.ic.gw.bean.message.ResponseMessageBody;

@Component
public class Sender {
	
	@Autowired
	private KafkaTemplate kafkaTemplate;

	private static ObjectMapper objMapper=new ObjectMapper();
	
	private static final Logger LOG = LoggerFactory.getLogger(Sender.class);
	
	public void sendMessage(String msg) {
		kafkaTemplate.send(kafkaTemplate.getDefaultTopic(), msg);
	}

	public void sendMessage(Message msg,Integer result){
		ResponseMessage responseMessage=new ResponseMessage();
		MessageHeader header=new MessageHeader();
		ResponseMessageBody responseMessageBody=new ResponseMessageBody();
		if(msg!=null){
			MessageHeader requestHeader=msg.getHeader();
			header.setFlag(requestHeader.getFlag());
			header.setSn(requestHeader.getFlag());
			header.setId(EnumMsgType.getResponseType(requestHeader.getId()));
			responseMessage.setHeader(header);
	
			responseMessageBody.setDevId(msg.getBody().getDevId());
			responseMessageBody.setResult(result);
			responseMessage.setBody(responseMessageBody);
		}
		try {
			sendMessage(objMapper.writeValueAsString(responseMessage));
		} catch (JsonProcessingException e) {
			LOG.error("Json解析错误", e);
			e.printStackTrace();
		}
	}
}
