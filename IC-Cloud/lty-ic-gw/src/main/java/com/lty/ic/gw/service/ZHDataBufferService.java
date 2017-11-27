package com.lty.ic.gw.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lty.ic.gw.bean.ZHDataBuffer;
import com.lty.ic.gw.mapper.ZHDataBufferMapper;

@Service
@Transactional
public class ZHDataBufferService {

	private static final Logger LOG = LoggerFactory.getLogger(ZHDataBufferService.class);
	
	@Autowired
	ZHDataBufferMapper ZHDataBufferMapper;

	public List<Map<String, Object>> queryCardType(){
		return ZHDataBufferMapper.queryCardType();
	}

	public void batchInsertDatabuffer(List<ZHDataBuffer> list){
		ZHDataBufferMapper.batchInsertDatabuffer(list);
	}
}