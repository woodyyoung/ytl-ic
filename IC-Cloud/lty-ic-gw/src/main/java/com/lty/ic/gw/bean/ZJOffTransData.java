package com.lty.ic.gw.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.lty.ic.gw.util.DateUtil;
import com.lty.ic.gw.util.HexUtil;

public class ZJOffTransData extends OffTransData implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("settle_unit_id")
	private String settleUnitId;//--销售单位ID
	
	@JsonProperty("ic_card_id")
	private String ICCardId;// --ic卡物理卡号
	
	@JsonProperty("city_code")
	private String cityCode;// --城市编号
	
	@JsonProperty("tac_code")
	private String tacCode;//
	
	@JsonProperty("user_ic_card")
	private String userICCard;// --ic卡号
	
	@JsonProperty("dev_sn")
	private String devSn;// --设备序列号
	
	@JsonProperty("card_type")
	private Integer cardType;// --IC卡类型
	
	@JsonProperty("trans_type")
	private Integer transType;// --IC卡交易类型
	
	@JsonProperty("line_id")
	private String lineId;// --线路编号
	
	@JsonProperty("driver_id")
	private String driverId;// --司机编号
	
	@JsonProperty("vehicle_id")
	private String vehicleId;// --车辆编号
	
	@JsonProperty("bus_seq")
	private Integer busSeq;   //
	
	@JsonProperty("bus_station_code")
	private Integer busStationCode;
	
	@JsonProperty("bus_station_no")
	private Integer busStationNo;
	
	@JsonProperty("gps_data")
	private GPSData gpsDate;
	
	@JsonProperty("trans_b_amount")
	private Integer transBAmount;// --交易前余值
	
	@JsonProperty("trans_amount")
	private Integer transAmount;// --交易金额
	
	@JsonProperty("trans_time")	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date transTime;// --交易时间
	
	@JsonProperty("trans_wallet_type")
	private Integer transWalletType;// 交易钱包类型,
	
	@JsonProperty("card_balance")
	private Integer cardBalance;// --卡余额,
	
	@JsonProperty("onbus_flag")
	private Integer onBusFlag;//
	
	@JsonProperty("ondirection_flag")
	private Integer onDirectionFlag; //
	
	@JsonProperty("operator")
	private Integer operator;//
	
	@JsonProperty("card_flag")
	private Integer cardFlag;// --卡物理类型 0.M1卡;1.PBOC2.0标准CPU卡;2:PBOC3.0标准CPU卡,
	
	@JsonProperty("trans_mode")
	private Integer transMode;// --交易方式 定额:0 自由:1 分段:2 计时:3

	@JsonProperty("trans_counts")
    private Integer transCounts;//交易次数
    
	@JsonProperty("transfer_flag")
    private Integer transferFlag;//换乘优惠标识  0未换乘   1换乘
	
	@JsonProperty("merchant_id")
    private String merchantId;//商户ID
	
	public GPSData getGpsDate() {
		return gpsDate;
	}

	public void setGpsDate(GPSData gpsDate) {
		this.gpsDate = gpsDate;
	}

	public Integer getTransferFlag() {
		return transferFlag;
	}

	public void setTransferFlag(Integer transferFlag) {
		this.transferFlag = transferFlag;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public void setTransCounts(Integer transCounts) {
		this.transCounts = transCounts;
	}
	
	public String getSettleUnitId() {
		return settleUnitId;
	}

	public void setSettleUnitId(String settleUnitId) {
		this.settleUnitId = settleUnitId;
	}

	public String getICCardId() {
		return ICCardId;
	}

	public void setICCardId(String iCCardId) {
		ICCardId = iCCardId;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getTacCode() {
		return tacCode;
	}

	public void setTacCode(String tacCode) {
		this.tacCode = tacCode;
	}

	public String getUserICCard() {
		return userICCard;
	}

	public void setUserICCard(String userICCard) {
		this.userICCard = userICCard;
	}

	public String getDevSn() {
		return devSn;
	}

	public void setDevSn(String devSn) {
		this.devSn = devSn;
	}

	public Integer getCardType() {
		return cardType;
	}

	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}

	public Integer getTransType() {
		return transType;
	}

	public void setTransType(Integer transType) {
		this.transType = transType;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Integer getBusSeq() {
		return busSeq;
	}

	public void setBusSeq(Integer busSeq) {
		this.busSeq = busSeq;
	}

	public Integer getBusStationCode() {
		return busStationCode;
	}

	public void setBusStationCode(Integer busStationCode) {
		this.busStationCode = busStationCode;
	}

	public Integer getBusStationNo() {
		return busStationNo;
	}

	public void setBusStationNo(Integer busStationNo) {
		this.busStationNo = busStationNo;
	}

	public Integer getTransBAmount() {
		return transBAmount;
	}

	public void setTransBAmount(Integer transBAmount) {
		this.transBAmount = transBAmount;
	}

	public Integer getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(Integer transAmount) {
		this.transAmount = transAmount;
	}

	public Date getTransTime() {
		return transTime;
	}

	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}

	public Integer getTransWalletType() {
		return transWalletType;
	}

	public void setTransWalletType(Integer transWalletType) {
		this.transWalletType = transWalletType;
	}

	public Integer getCardBalance() {
		return cardBalance;
	}

	public void setCardBalance(Integer cardBalance) {
		this.cardBalance = cardBalance;
	}

	public Integer getOnBusFlag() {
		return onBusFlag;
	}

	public void setOnBusFlag(Integer onBusFlag) {
		this.onBusFlag = onBusFlag;
	}

	public Integer getOnDirectionFlag() {
		return onDirectionFlag;
	}

	public void setOnDirectionFlag(Integer onDirectionFlag) {
		this.onDirectionFlag = onDirectionFlag;
	}

	public Integer getOperator() {
		return operator;
	}

	public void setOperator(Integer operator) {
		this.operator = operator;
	}

	public Integer getCardFlag() {
		return cardFlag;
	}

	public void setCardFlag(Integer cardFlag) {
		this.cardFlag = cardFlag;
	}

	public Integer getTransMode() {
		return transMode;
	}

	public void setTransMode(Integer transMode) {
		this.transMode = transMode;
	}

	public Integer getTransCounts() {
		return transCounts;
	}

	public void setTransAcount(Integer transCounts) {
		this.transCounts = transCounts;
	}

	/**
	 * 生成住建部数据包体
	 * 
	 * @功能： 
	 *      A6B39E000000004103020310540b0000640000201706242100150006000000000D00000C00000000004155AA05600100250603100310031000001001A0CFCD91
	 * @param context
	 *
	 * @返回：String
	 */
	public String toDataBuffer() {
		StringBuffer sb = new StringBuffer();
		sb.append(rightPadZero(HexUtil.intToLittleEndianHexString(Integer.parseInt(userICCard)), 8));// IC卡号--8
		sb.append(leftPadZero(devSn, 8));// 设备编号 8
		sb.append(leftPadZero(Integer.toHexString(cardType), 2));// IC卡类型 2
		sb.append(leftPadZero(transType.toString(), 2));// 交易类型 2
		sb.append(rightPadZero(HexUtil.intToLittleEndianHexString(transCounts.intValue()), 4));// 卡消费次数4
		sb.append(rightPadZero(HexUtil.intToLittleEndianHexString(cardBalance.intValue()), 8));// 交易余值8--
		sb.append(rightPadZero(HexUtil.intToLittleEndianHexString(transAmount.intValue()), 6));// 交易金额6--
		sb.append(DateUtil.getDateStr(transTime));// -- --交易日期 20170520 8
		sb.append(DateUtil.getTimeStr(transTime));// -- --交易时间 182500 6
		sb.append(rightPadZero("0", 21));// 补零21
		sb.append(leftPadZero(lineId, 4));// 线路编号 4
		sb.append(rightPadZero("0", 24));// 补零24
		sb.append(leftPadZero(merchantId, 4));// --商户编号 4
		sb.append(leftPadZero(driverId, 8));// 司机编号 8
		sb.append("00");// 补零2
		sb.append(leftPadZero(transferFlag.toString(), 2));// 换乘优惠标识 2
		sb.append(rightPadZero("0", 11));// 补零
		return sb.toString().toUpperCase();
	}
	
}
