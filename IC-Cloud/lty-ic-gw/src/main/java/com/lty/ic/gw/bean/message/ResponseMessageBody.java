package com.lty.ic.gw.bean.message;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * kafka消费体消息头
 * 
 * @描述:
 * @作者: LiDu
 * @创建时间: 2017年8月22日
 * @版本: 1.0
 */
public class ResponseMessageBody implements Serializable {
	
	@JsonIgnore
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("dev_id")
	private Integer devId;// 消息标志 0x01，住建部；0x02，交通部，0x03,LTY；0x04,其它；
	
	@JsonProperty("result")
	private Integer result;// 报文序列号a UINT32_T 32位无符号整型，4字节

	public Integer getDevId() {
		return devId;
	}

	public void setDevId(Integer devId) {
		this.devId = devId;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}
	
}
