package com.lty.ic.gw.bean.enums;

/**
 * 消息的业务类型
 * 
 * @描述:
 * @作者: hgy
 * @创建时间: 2017年8月18日
 * @版本: 1.0
 */
public enum EnumMsgType {
	// 脱机交易记录上传响应-住建部 DN_TBP_IC_ZJOFFLINETRANS_RSP 0x080004 --524292
	// 脱机交易记录上传响应-交通部 DN_TBP_IC_JTOFFLINETRANS_RSP 0x080005 --524293
	// 脱机交易记录上传-住建部 UP_TBP_IC_ZJOFFLINETRANS_REQ 0x070004 --458756
	// 脱机交易记录上传-交通部 UP_TBP_IC_JTOFFLINETRANS_REQ 0x070005 --458757
	JT_RSP("交通部消费记录响应", 0x080004), //
	ZJ_RSP("住建部消费记录响应", 0x080005), //
	JT_REQ("交通部消费记录上传请求", 0x070004), //
	ZJ_REQ("住建部消费记录上传请求", 0x070005);//

	private String name;
	private int code;

	private EnumMsgType(String name, int code) {
		this.name = name;
		this.code = code;
	}

	public static EnumMsgType getType(int optype){
		for (EnumMsgType op : values()) {
			if (op.getCode() == optype) {
				return op;
			}
		}
		return null;
	}
	
	public static int getResponseType(int optype){
		int type=0;
		for (EnumMsgType op : values()) {
			if (op.getCode() == optype) {
				switch (op) {
				case JT_REQ:
					type=JT_RSP.getCode();
					break;
				case ZJ_REQ:
					type=ZJ_RSP.getCode();
					break;
				default:
					break;
				}
			}
		}
		return type;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
