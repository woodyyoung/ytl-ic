package com.lty.ic.gw.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.lty.ic.gw.util.DateUtil;
import com.lty.ic.gw.util.HexUtil;

public class JTOffTransData extends OffTransData implements Serializable {
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
	
	@JsonProperty("issuer_code")
	private String issuerCode;
	
	@JsonProperty("dev_sn")
	private String devSn;// --设备序列号
	
	@JsonProperty("card_type")
	private Integer cardType;// --IC卡类型
	
	@JsonProperty("trans_type")
	private Integer transType;// --IC卡交易类型
	
	@JsonProperty("trans_sequence")
	private Integer transSequence;
	
	@JsonProperty("trans_status")
    private Integer transStatus;//交易状态
	
	@JsonProperty("trans_counts")
    private Integer transCounts;//交易次数
	
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

	@JsonProperty("trip")
	private Integer trip;//
	
    
	public String getIssuerCode() {
		return issuerCode;
	}

	public void setIssuerCode(String issuerCode) {
		this.issuerCode = issuerCode;
	}

	public Integer getTransSequence() {
		return transSequence;
	}

	public void setTransSequence(Integer transSequence) {
		this.transSequence = transSequence;
	}

	public Integer getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(Integer transStatus) {
		this.transStatus = transStatus;
	}

	public GPSData getGpsDate() {
		return gpsDate;
	}

	public void setGpsDate(GPSData gpsDate) {
		this.gpsDate = gpsDate;
	}

	public Integer getTrip() {
		return trip;
	}

	public void setTrip(Integer trip) {
		this.trip = trip;
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
	 * 生成交通部数据包体
	 * 
	 * @功能： 
	 *      DB179D000001543600020000502D0000A00000201707171554320000FFFFFFFFA99700000059EB5F776200000000452D837A01680000000001009B0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000BBBBBBBB
	 * @param context
	 *
	 * @返回：String
	 */
	public String toDataBuffer() {
		StringBuffer sb = new StringBuffer();
		sb.append(leftPadZero(userICCard, 20));// IC卡号--20    20
		sb.append(leftPadZero(cardType.toString(), 2));//卡应用类型   2 小端     22
		sb.append(leftPadZero(cardFlag.toString(), 2));//卡物理类型   2 小端     24
		sb.append(leftPadZero(transSequence.toString(),8));// PSam卡交易序号 8   32
		sb.append(leftPadZero(ICCardId,12));// PSam卡卡号 12   44
		sb.append(leftPadZero(vehicleId, 8));// 交易点自编号（车牌号）8  52
		sb.append(leftPadZero(transType.toString(), 2));// 交易类型 2  54
		sb.append(rightPadZero(HexUtil.intToLittleEndianHexString(transAmount.intValue()), 4));//票价 4 小端      58
		sb.append(rightPadZero(HexUtil.intToLittleEndianHexString(transCounts.intValue()), 4));//钱包累计交易次数 4 小端    62
		sb.append(rightPadZero(HexUtil.intToLittleEndianHexString(transAmount.intValue()), 6));// 交易金额 6   68
		sb.append(rightPadZero(HexUtil.intToLittleEndianHexString(cardBalance.intValue()), 8));// 余额 8   76
		sb.append(DateUtil.getDateStr(transTime));// -- --交易日期 20170520 8   84
		sb.append(DateUtil.getTimeStr(transTime));// -- --交易时间 182500 6   90
		sb.append(leftPadZero(tacCode,8));// -- --交易认证码TAC 8   98
		sb.append(leftPadZero(driverId, 8));// 司机编号 8   106
		sb.append(leftPadZero(lineId, 6));// 交易区域代码（线路号） 6   112
		sb.append(leftPadZero(busStationCode.toString(),2));// 站点编号 2   114
		sb.append(leftPadZero(HexUtil.intToLittleEndianHexString(gpsDate.getDirection()), 2));// 方向 2  116
		sb.append(leftPadZero(issuerCode,16));// 组织机构代码 16   132
		sb.append(leftPadZero(cityCode,4));//城市代码 4  136
		sb.append("00");//记录标识 2  138
		sb.append(DateUtil.getDateStr(transTime));// 上行交易日期 20170520 8   146
		sb.append(DateUtil.getTimeStr(transTime));// 上行交易时间 182500 6  152
		sb.append(leftPadZero(vehicleId, 12));// 上行交易点自编号（车牌号）12  164
		sb.append(leftPadZero(driverId, 8));// 司机编号 8  172
		sb.append(leftPadZero(lineId, 6));// 上行交易区域代码（线路号） 6  178
		sb.append(leftPadZero(busStationCode.toString(),2));// 上行站点编号 2  180
		sb.append(leftPadZero(cityCode,4));//上行城市代码 4   184
		sb.append(leftPadZero(issuerCode,16));// 上行组织机构代码 16   200
		sb.append(leftPadZero("0",20));//补0 20位       220
		sb.append(leftPadZero(operator.toString(),8));//员工编号（站务员） 8  228
//		sb.append("0000");//程序版本信息4
		sb.append(leftPadZero(trip.toString(), 4));//趟次4   232
		sb.append(transStatus.intValue());//终端交易状态1    233
//		sb.append(leftPadZero("0",15));//补0 15位      248
		sb.append("000000000009B00");//补0 15位      248
		sb.append("AAAAAAAA");//交通部消费处理标识符     256
		return sb.toString().toUpperCase();
	}
}
