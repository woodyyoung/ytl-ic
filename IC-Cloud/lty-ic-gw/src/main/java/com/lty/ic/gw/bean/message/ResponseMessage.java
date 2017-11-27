package com.lty.ic.gw.bean.message;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ResponseMessage implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 1L;

	private MessageHeader header;
	private ResponseMessageBody body;
	
	public MessageHeader getHeader() {
		return header;
	}
	public void setHeader(MessageHeader header) {
		this.header = header;
	}
	public ResponseMessageBody getBody() {
		return body;
	}
	public void setBody(ResponseMessageBody body) {
		this.body = body;
	}
}
