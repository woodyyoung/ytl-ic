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
public class MessageHeader implements Serializable {
	
	@JsonIgnore
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("msg_flag")
	private Integer flag;// 消息标志 0x01，住建部；0x02，交通部，0x03,LTY；0x04,其它；
	
	@JsonProperty("msg_sn")
	private Integer sn;// 报文序列号a UINT32_T 32位无符号整型，4字节
	
	@JsonProperty("msg_id")
	private Integer id;// 业务数据类型【指令】 32位无符号整型，4字节
	
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public Integer getSn() {
		return sn;
	}
	public void setSn(Integer sn) {
		this.sn = sn;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
