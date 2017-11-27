package com.lty.ic.gw.bean;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,include = JsonTypeInfo.As.PROPERTY,property = "header.msg_flag",defaultImpl=ZJOffTransData.class)
//@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
//@JsonSubTypes({@JsonSubTypes.Type(value=JTOffTransData.class,name="2"),@JsonSubTypes.Type(value=ZJOffTransData.class,name="1")})
public abstract class OffTransData {

	/**
	 * 生成数据包体
	 * 
	 * @功能： 
	 *      A6B39E000000004103020310540b0000640000201706242100150006000000000D00000C00000000004155AA05600100250603100310031000001001A0CFCD91
	 * @param context
	 *
	 * @返回：String
	 */
	public abstract String toDataBuffer();
	
	
	protected String rightPadZero(String filedValue, int filedLength) {
		if (filedValue.length() == filedLength) {
			return filedValue;
		}
		if (filedValue.length() < filedLength) {
			return filedValue
					+ String.format(
							"%1$0" + (filedLength - filedValue.length())
									+ "d", 0);
		}
		return filedValue.substring(0, filedLength);
	}

	protected String leftPadZero(String filedValue, int filedLength) {
		if (filedValue.length() == filedLength) {
			return filedValue;
		}
		if (filedValue.length() < filedLength) {
			return String.format(
					"%1$0" + (filedLength - filedValue.length()) + "d", 0)
					+ filedValue;
		}
		return filedValue.substring(0, filedLength);
	}
}
