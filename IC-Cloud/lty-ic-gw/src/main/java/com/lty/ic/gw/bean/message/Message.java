package com.lty.ic.gw.bean.message;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * kafka消费消息bean
 * 
 * @描述:
 * @作者: LiDu
 * @创建时间: 2017年8月22日
 * @版本: 1.0
 */
public class Message<T> implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 1L;

	private MessageHeader header;

	private MessageBody body;

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public MessageHeader getHeader() {
		return header;
	}

	public void setHeader(MessageHeader header) {
		this.header = header;
	}

	public MessageBody getBody() {
		return body;
	}

	public void setBody(MessageBody body) {
		this.body = body;
	}

}
