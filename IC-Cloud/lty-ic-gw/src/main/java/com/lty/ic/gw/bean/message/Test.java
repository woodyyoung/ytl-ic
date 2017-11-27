package com.lty.ic.gw.bean.message;

import com.alibaba.fastjson.JSON;

public class Test {
	public static void main(String[] args) {
		Message<MyBean> s = new Message<MyBean>();
		MessageHeader header = new MessageHeader();
		header.setFlag(1);
		header.setSn(545211);
		s.setHeader(header);
		MyBean my = new MyBean();
		my.setAa(122);
		my.setBb("2544");
		s.setT(my);

		String aa = JSON.toJSONString(s);
		System.out.println(aa);

	}
}
