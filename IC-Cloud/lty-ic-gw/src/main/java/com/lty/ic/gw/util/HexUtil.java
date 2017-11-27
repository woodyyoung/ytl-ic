package com.lty.ic.gw.util;

public class HexUtil {
	public static String intToLittleEndianHexString(int dec) {
		String hex = "";
		while (dec != 0) {
			String h = Integer.toString(dec & 0xff, 16);
			if ((h.length() & 0x01) == 1)
				h = '0' + h;
			hex = hex + h;
			dec = dec >> 8;
		}
		return hex;
	}
}
