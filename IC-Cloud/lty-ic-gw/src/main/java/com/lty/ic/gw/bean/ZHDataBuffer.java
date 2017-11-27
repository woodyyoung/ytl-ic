package com.lty.ic.gw.bean;

import java.math.BigDecimal;

public class ZHDataBuffer {
	
	/**
	 * 订单编号 主键自动生成
	 */
    private Integer orderId;
    
    /**
	 * 订单类型 1 充值 、2消费 ，默认为消费
	 */
    private String recordtype;

    /**
	 * 商户编号 默认0310
	 */
    private String merchantId;

    /**
	 * 数据包
	 */
    private String dataBuffer;

    /**
	 * 错误码
	 */
    private Integer errcode;

    /**
	 * 数据源文件名
	 */
    private String inputfilename;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getRecordtype() {
        return recordtype;
    }

    public void setRecordtype(String recordtype) {
        this.recordtype = recordtype == null ? null : recordtype.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getDataBuffer() {
        return dataBuffer;
    }

    public void setDataBuffer(String dataBuffer) {
        this.dataBuffer = dataBuffer == null ? null : dataBuffer.trim();
    }

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getInputfilename() {
        return inputfilename;
    }

    public void setInputfilename(String inputfilename) {
        this.inputfilename = inputfilename == null ? null : inputfilename.trim();
    }
}