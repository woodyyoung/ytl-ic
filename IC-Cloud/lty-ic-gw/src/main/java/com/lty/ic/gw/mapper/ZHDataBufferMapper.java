package com.lty.ic.gw.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lty.ic.gw.bean.ZHDataBuffer;
import com.lty.ic.gw.bean.ZHDataBufferExample;

@Mapper
public interface ZHDataBufferMapper {
    int countByExample(ZHDataBufferExample example);

    int deleteByExample(ZHDataBufferExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(ZHDataBuffer record);

    int insertSelective(ZHDataBuffer record);

    List<ZHDataBuffer> selectByExample(ZHDataBufferExample example);

    ZHDataBuffer selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") ZHDataBuffer record, @Param("example") ZHDataBufferExample example);

    int updateByExample(@Param("record") ZHDataBuffer record, @Param("example") ZHDataBufferExample example);

    int updateByPrimaryKeySelective(ZHDataBuffer record);

    int updateByPrimaryKey(ZHDataBuffer record);
    
    List<Map<String, Object>> queryCardType();

	void batchInsertDatabuffer(List<ZHDataBuffer> list);
}