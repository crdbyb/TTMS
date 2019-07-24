package com.cwcms.util;

public class ComUtil {
	private ComUtil() {}
	
	public static boolean hasLength(String str) {
		return str!=null&&!"".equals(str.trim());
	}
	
}
