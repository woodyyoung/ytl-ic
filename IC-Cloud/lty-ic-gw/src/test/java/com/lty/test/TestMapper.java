package com.lty.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.lty.ic.gw.GwApplication;
import com.lty.ic.gw.bean.ZHDataBuffer;
import com.lty.ic.gw.mapper.ZHDataBufferMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = GwApplication.class)
public class TestMapper {
	@Autowired
	private ZHDataBufferMapper databufferMapper;

	@Test
	public void test1() {
		List<Map<String, Object>> queryCardType = databufferMapper
				.queryCardType();
		System.out.println(JSON.toJSONString(queryCardType));
	}

	@Test
	public void insertDataBuffer() {
		List<ZHDataBuffer> list = new ArrayList<ZHDataBuffer>();
		
		for (int i = 0; i < 300; i++) {
			ZHDataBuffer buf = new ZHDataBuffer();
			buf.setRecordtype("1");
			buf.setErrcode(0);
			buf.setMerchantId("0310");
			buf.setInputfilename("ycz");
			buf.setDataBuffer("a6b39e000000004103020310540b0000640000201708190941310000000000000000000000021000000000000000000000000031003100310000000000000000");
			list.add(buf);
		}
		databufferMapper.batchInsertDatabuffer(list);
		System.out.println("success");
	}
}
