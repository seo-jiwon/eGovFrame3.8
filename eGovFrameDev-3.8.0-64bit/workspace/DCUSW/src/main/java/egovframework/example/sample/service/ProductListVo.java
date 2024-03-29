package egovframework.example.sample.service;

import java.io.Serializable;

public class ProductListVo implements Serializable  {
	private String PRDT_CD ="";
	private String PRDT_DTL_CD ="";
	private int STORE_ID =0;
	private String CATEG_CD ="";
	private String PRDT_NM ="";
	private String MAKR_NM ="";
	private String PRDT_INFO =""; 
	private String STNDRD ="";
	private String MODEL_NM ="";
	private String SEL_PRICE ="";
	private String SALE_PRICE ="";
	private String OUT_AMT ="";
	private String OUT_UNIT="";
	private String SOLDOUT_AT="";
	private String RE_SALE_DT="";
	private String PRDT_IMG="";
	private String LEV3_CD="";
	private String LEV3_NM="";
	private String LEV4_CD="";
	private String LEV4_NM="";
	private String LEV5_CD="";
	private String LEV5_NM="";
	@Override
	public String toString() {
		return "ProductListVo [PRDT_CD=" + PRDT_CD + ", PRDT_DTL_CD=" + PRDT_DTL_CD + ", STORE_ID=" + STORE_ID
				+ ", CATEG_CD=" + CATEG_CD + ", PRDT_NM=" + PRDT_NM + ", MAKR_NM=" + MAKR_NM + ", PRDT_INFO="
				+ PRDT_INFO + ", STNDRD=" + STNDRD + ", MODEL_NM=" + MODEL_NM + ", SEL_PRICE=" + SEL_PRICE
				+ ", SALE_PRICE=" + SALE_PRICE + ", OUT_AMT=" + OUT_AMT + ", OUT_UNIT=" + OUT_UNIT + ", SOLDOUT_AT="
				+ SOLDOUT_AT + ", RE_SALE_DT=" + RE_SALE_DT + ", PRDT_IMG=" + PRDT_IMG + ", LEV3_CD=" + LEV3_CD
				+ ", LEV3_NM=" + LEV3_NM + ", LEV4_CD=" + LEV4_CD + ", LEV4_NM=" + LEV4_NM + ", LEV5_CD=" + LEV5_CD
				+ ", LEV5_NM=" + LEV5_NM + "]";
	}
	public String getPRDT_CD() {
		return PRDT_CD;
	}
	public void setPRDT_CD(String pRDT_CD) {
		PRDT_CD = pRDT_CD;
	}
	public String getPRDT_DTL_CD() {
		return PRDT_DTL_CD;
	}
	public void setPRDT_DTL_CD(String pRDT_DTL_CD) {
		PRDT_DTL_CD = pRDT_DTL_CD;
	}
	public int getSTORE_ID() {
		return STORE_ID;
	}
	public void setSTORE_ID(int sTORE_ID) {
		STORE_ID = sTORE_ID;
	}
	public String getCATEG_CD() {
		return CATEG_CD;
	}
	public void setCATEG_CD(String cATEG_CD) {
		CATEG_CD = cATEG_CD;
	}
	public String getPRDT_NM() {
		return PRDT_NM;
	}
	public void setPRDT_NM(String pRDT_NM) {
		PRDT_NM = pRDT_NM;
	}
	public String getMAKR_NM() {
		return MAKR_NM;
	}
	public void setMAKR_NM(String mAKR_NM) {
		MAKR_NM = mAKR_NM;
	}
	public String getPRDT_INFO() {
		return PRDT_INFO;
	}
	public void setPRDT_INFO(String pRDT_INFO) {
		PRDT_INFO = pRDT_INFO;
	}
	public String getSTNDRD() {
		return STNDRD;
	}
	public void setSTNDRD(String sTNDRD) {
		STNDRD = sTNDRD;
	}
	public String getMODEL_NM() {
		return MODEL_NM;
	}
	public void setMODEL_NM(String mODEL_NM) {
		MODEL_NM = mODEL_NM;
	}
	public String getSEL_PRICE() {
		return SEL_PRICE;
	}
	public void setSEL_PRICE(String sEL_PRICE) {
		SEL_PRICE = sEL_PRICE;
	}
	public String getSALE_PRICE() {
		return SALE_PRICE;
	}
	public void setSALE_PRICE(String sALE_PRICE) {
		SALE_PRICE = sALE_PRICE;
	}
	public String getOUT_AMT() {
		return OUT_AMT;
	}
	public void setOUT_AMT(String oUT_AMT) {
		OUT_AMT = oUT_AMT;
	}
	public String getOUT_UNIT() {
		return OUT_UNIT;
	}
	public void setOUT_UNIT(String oUT_UNIT) {
		OUT_UNIT = oUT_UNIT;
	}
	public String getSOLDOUT_AT() {
		return SOLDOUT_AT;
	}
	public void setSOLDOUT_AT(String sOLDOUT_AT) {
		SOLDOUT_AT = sOLDOUT_AT;
	}
	public String getRE_SALE_DT() {
		return RE_SALE_DT;
	}
	public void setRE_SALE_DT(String rE_SALE_DT) {
		RE_SALE_DT = rE_SALE_DT;
	}
	public String getPRDT_IMG() {
		return PRDT_IMG;
	}
	public void setPRDT_IMG(String pRDT_IMG) {
		PRDT_IMG = pRDT_IMG;
	}
	public String getLEV3_CD() {
		return LEV3_CD;
	}
	public void setLEV3_CD(String lEV3_CD) {
		LEV3_CD = lEV3_CD;
	}
	public String getLEV3_NM() {
		return LEV3_NM;
	}
	public void setLEV3_NM(String lEV3_NM) {
		LEV3_NM = lEV3_NM;
	}
	public String getLEV4_CD() {
		return LEV4_CD;
	}
	public void setLEV4_CD(String lEV4_CD) {
		LEV4_CD = lEV4_CD;
	}
	public String getLEV4_NM() {
		return LEV4_NM;
	}
	public void setLEV4_NM(String lEV4_NM) {
		LEV4_NM = lEV4_NM;
	}
	public String getLEV5_CD() {
		return LEV5_CD;
	}
	public void setLEV5_CD(String lEV5_CD) {
		LEV5_CD = lEV5_CD;
	}
	public String getLEV5_NM() {
		return LEV5_NM;
	}
	public void setLEV5_NM(String lEV5_NM) {
		LEV5_NM = lEV5_NM;
	}
}
