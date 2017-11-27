package com.lty.ic.gw.bean.enums;

/**
 * 消费标志
 * 
 * @描述:
 * @作者: hgy
 * @创建时间: 2017年8月19日
 * @版本: 1.0
 */
public enum EnumMsgFlag {

	JT("交通部", 2), //
	ZJ("住建部", 1), //
	LTY("蓝泰源", 3), //
	OTHER("其他", 4);//

	private String name;
	private int code;

	private EnumMsgFlag(String name, int code) {
		this.name = name;
		this.code = code;
	}
	
	public static EnumMsgFlag getFlag(int optype){
		for (EnumMsgFlag op : values()) {
			if (op.getCode() == optype) {
				return op;
			}
		}
		return null;
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
