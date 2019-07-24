package com.cwcms.service.user;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Encryption {

	public static final String KEY_SHA = "SHA";
	private Encryption() {}
	public static String getResult(String inputStr) {
		if(inputStr==null) {
			return null;
		}
		BigInteger sha = null;
		byte[] inputData = inputStr.getBytes();
		try {
			MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA);
			messageDigest.update(inputData);
			sha = new BigInteger(messageDigest.digest());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sha.toString();
	}
	

}
