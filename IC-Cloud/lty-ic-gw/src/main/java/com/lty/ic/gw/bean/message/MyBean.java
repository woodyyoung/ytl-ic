package com.lty.ic.gw.bean.message;

import java.io.Serializable;

public class MyBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int aa;
	private String bb;

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

	public String getBb() {
		return bb;
	}

	public void setBb(String bb) {
		this.bb = bb;
	}

}
