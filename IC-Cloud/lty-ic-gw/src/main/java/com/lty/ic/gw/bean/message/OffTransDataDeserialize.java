package com.lty.ic.gw.bean.message;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lty.ic.gw.bean.JTOffTransData;
import com.lty.ic.gw.bean.OffTransData;
import com.lty.ic.gw.bean.ZJOffTransData;
import com.lty.ic.gw.bean.enums.EnumMsgFlag;
import com.lty.ic.gw.bean.enums.EnumMsgType;

public class OffTransDataDeserialize extends JsonDeserializer<List> {  
	
	public OffTransDataDeserialize() {
		// TODO Auto-generated constructor stub
	}
	
    @Override  
    public List deserialize(JsonParser jp, DeserializationContext ctxt)  
            throws IOException, JsonProcessingException { 	
        try {
        	List<OffTransData> list=new ArrayList();
        	ObjectMapper mapper=(ObjectMapper) jp.getCodec();
        	Message message=(Message)jp.getParsingContext().getParent().getParent().getCurrentValue(); 
        	MessageHeader header=message.getHeader();
        	JsonNode arrayNode=mapper.readTree(jp);
        	Class type=ZJOffTransData.class;
        	if(header.getFlag()==EnumMsgFlag.JT.getCode() && header.getId()==EnumMsgType.JT_REQ.getCode()){
        		type=JTOffTransData.class;
        	}
        	for(int i=0;i<arrayNode.size();i++){
        		JsonNode dataNode=arrayNode.get(i);
        		OffTransData data=(OffTransData)mapper.readValue(dataNode.toString(), type);
	        	list.add(data);
        	}
        	return list;
        } catch (Exception e) {  
            e.printStackTrace(); 
        }  
        return null;  
    }  
} 
