package com.lty.ic.gw.bean.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lty.ic.gw.bean.OffTransData;
import com.lty.ic.gw.bean.ZHDataBuffer;

/**
 * kafka消费体消息头
 * 
 * @描述:
 * @作者: LiDu
 * @创建时间: 2017年8月22日
 * @版本: 1.0
 */
public class MessageBody implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("dev_id")	
	private Integer devId;// 设备编号
	
	@JsonProperty("up_time")	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date upTime;// 上传时间
	
	@JsonProperty("trans_cnt")	
	private Integer transCnt;// 上传批次
	
	@JsonProperty("off_trans_data")
	@JsonDeserialize(using=OffTransDataDeserialize.class)
	private List<OffTransData> offTransData;// 消费记录列表

	public Integer getDevId() {
		return devId;
	}

	public void setDevId(Integer devId) {
		this.devId = devId;
	}

	public Date getUpTime() {
		return upTime;
	}

	public void setUpTime(Date upTime) {
		this.upTime = upTime;
	}

	public Integer getTransCnt() {
		return transCnt;
	}

	public void setTransCnt(Integer transCnt) {
		this.transCnt = transCnt;
	}

//	public List<OffTransData> getOffTransData() {
//		return offTransData;
//	}
//
//	public void setOffTransData(List<OffTransData> offTransData) {
//		this.offTransData = offTransData;
//	}

	/**
	 * 生成入库的消费记录数据包
	 * 
	 * @功能：
	 * 
	 * @param context
	 *
	 * @返回：List<DataBuffer>
	 */
	public List<ZHDataBuffer> toZHDataBuffer() {
		if (this.offTransData == null || this.offTransData.isEmpty()) {
			return Collections.emptyList();
		}
		List<ZHDataBuffer> list = new ArrayList<ZHDataBuffer>();
		for (OffTransData offTransData : offTransData) {
			ZHDataBuffer buf = new ZHDataBuffer();
			buf.setRecordtype("1");
			buf.setMerchantId("0310");
			buf.setErrcode(0);
			buf.setInputfilename(upTime.getTime() + this.devId + ".rec");
			buf.setDataBuffer(offTransData.toDataBuffer());
			list.add(buf);
		}
		return list;
	}
	
	
}
