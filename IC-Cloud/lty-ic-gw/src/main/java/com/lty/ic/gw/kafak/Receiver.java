package com.lty.ic.gw.kafak;

import java.io.IOException;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lty.ic.gw.bean.enums.EnumMsgFlag;
import com.lty.ic.gw.bean.enums.EnumMsgType;
import com.lty.ic.gw.bean.message.Message;
import com.lty.ic.gw.service.ZHDataBufferService;

/**
 * 消费终端设备上传的刷卡数据
 * 
 * @描述:
 * @作者: hgy
 * @创建时间: 2017年8月18日
 * @版本: 1.0
 */
@Component
public class Receiver {
	private static ObjectMapper mapper=new ObjectMapper();
	
	private static final Logger LOG = LoggerFactory.getLogger(Receiver.class);
	
	@Autowired
	ZHDataBufferService ZHDataBufferService;
	
	@Autowired
	Sender sender;
	
	@KafkaListener(topics = "LTY_TB_Req")
	public void processMessage(String content) {
		Integer result=0xE000;
		Message message = null;
		try{
			message=mapper.readValue(content, Message.class);
			if(message.getHeader()!=null){
				EnumMsgFlag Flag=EnumMsgFlag.getFlag(message.getHeader().getFlag());
				switch (Flag) {
				case ZJ:
					writeZHDataBuffer(message);
					break;
				case JT:
					writeZHDataBuffer(message);
					break;
				default:
					break;
				}
			}
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			LOG.error("Json解析失败,"+content,e);
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			LOG.error("Json映射失败,"+content,e);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			LOG.error("IO异常,"+content,e);
			e.printStackTrace();
		}
		sender.sendMessage(message, result);
	}

	public void writeZHDataBuffer(Message message){
		EnumMsgType type=EnumMsgType.getType(message.getHeader().getId());
		switch (type) {
		case ZJ_REQ:
			ZHDataBufferService.batchInsertDatabuffer(message.getBody().toZHDataBuffer());
			break;
		case JT_REQ:
			ZHDataBufferService.batchInsertDatabuffer(message.getBody().toZHDataBuffer());
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		try{
			UUID.randomUUID();
			String zjmsg="{\"header\":{\"msg_flag\":1,\"msg_sn\":7,\"msg_id\":458756},\"body\":{\"dev_id\":123,\"up_time\":1502094772,\"trans_cnt\":1,\"off_trans_data\":[{\"settle_unit_id\":100,\"ic_card_id\":1234,\"city_code\":23,\"tac_code\":1234,\"user_ic_card\":\"1023456789\",\"dev_sn\":1234,\"card_type\":1,\"trans_type\":6,\"line_id\":2,\"driver_id\":\"1023456789\",\"vehicle_id\":12345,\"bus_seq\":0,\"bus_station_code\":1,\"bus_station_no\":2,\"gps_data\":{\"date\":\"20170807\",\"time\":\"123456\",\"lan\":123.123441,\"lat\":23.123424,\"vec1\":0,\"vec2\":0,\"vec3\":0,\"direction\":0,\"altitude\":0},\"trans_b_amount\":200,\"trans_amount\":200,\"trans_time\":1502094772,\"trans_wallet_type\":0,\"card_balance\":0,\"onbus_flag\":0,\"ondirection_flag\":0,\"operator\":20,\"card_flag\":0,\"trans_mode\":0,\"trans_counts\":8,\"transfer_flag\":0,\"merchant_id\":\"1023456789\"}]}}";
			String jtmsg="{\"header\":{\"msg_flag\":4,\"msg_sn\":8,\"msg_id\":458756},\"body\":{\"dev_id\":123,\"up_time\":1502094772,\"trans_cnt\":1,\"off_trans_data\":[{\"settle_unit_id\":100,\"ic_card_id\":1234,\"city_code\":23,\"tac_code\":1234,\"user_ic_card\":\"1023456789\",\"issuer_code\":\"12345678\",\"dev_sn\":1234,\"card_type\":1,\"trans_type\":6,\"trans_sequence\":12,\"trans_status\":1,\"trans_counts\":9,\"line_id\":2,\"driver_id\":\"1023456789\",\"vehicle_id\":12345,\"bus_seq\":0,\"bus_station_code\":1,\"bus_station_no\":2,\"gps_data\":{\"date\":\"20170807\",\"time\":\"123456\",\"lan\":123.123441,\"lat\":23.123424,\"vec1\":0,\"vec2\":0,\"vec3\":0,\"direction\":0,\"altitude\":0},\"trans_b_amount\":200,\"trans_amount\":200,\"trans_time\":1502094772,\"trans_wallet_type\":0,\"card_balance\":0,\"onbus_flag\":0,\"ondirection_flag\":0,\"operator\":20,\"card_flag\":0,\"trans_mode\":0,\"trip\":13}]}}";
			String content = "{\"header\":{\"msg_flag\":4,\"msg_sn\":7,\"msg_id\":22},\"body\":{\"dev_id\":123,\"up_time\":1502094772,\"trans_cnt\":1,\"off_trans_data\":[{\"settle_unit_id\":100,\"ic_card_id\":1234,\"city_code\":23,\"tac_code\":1234,\"user_ic_card\":\"1023456789\",\"dev_sn\":1234,\"card_type\":1,\"trans_type\":6,\"line_id\":2,\"driver_id\":\"1023456789\",\"vehicle_id\":12345,\"bus_seq\":0,\"bus_station_code\":1,\"bus_station_no\":2,\"gps_data\":{\"date\":\"20170807\",\"time\":\"123456\",\"lan\":123.123441,\"lat\":23.123424,\"vec1\":0,\"vec2\":0,\"vec3\":0,\"direction\":0,\"altitude\":0},\"trans_b_amount\":200,\"trans_amount\":200,\"trans_time\":1502094772,\"trans_wallet_type\":0,\"card_balance\":0,\"onbus_flag\":0,\"ondirection_flag\":0,\"operator\":20,\"card_flag\":0,\"trans_mode\":0}]}}";
			JSONObject parseObject = JSON.parseObject(content);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		Header header = JSON.parseObject(parseObject.get("header").toString(),
//				Header.class);
//		// 交通部消费记录
//		if (header.getMsg_flag() == MsgFlag.JT.getCode()
//				&& header.getMsg_id() == MsgType.JT_RSP.getCode()) {
//
//		}
//		// 住建部消费记录
//		if (header.getMsg_flag() == MsgFlag.ZJ.getCode()
//				&& header.getMsg_id() == MsgType.ZJ_RSP.getCode()) {
//
//		}
	}
}
