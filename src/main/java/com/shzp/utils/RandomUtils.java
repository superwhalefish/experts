package com.shzp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class RandomUtils {
	public String getTimeRand() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String format = sdf.format(date);
		return format;
	}

	public String getTimeString() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(date);
		return format;
		
	}
	public String getTimeYMD() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(date);
		return format;
		
	}

	public String getSixCode() {
		StringBuffer code=new StringBuffer();
		int num;
		for (int i=0;i<6;i++){
			num=(int)(Math.random()*10);
			code.append(String.valueOf(num));
		}
		return code.toString();
	}
}
