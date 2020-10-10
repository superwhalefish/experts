package com.shzp.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import org.apache.shiro.codec.Hex;
import org.springframework.stereotype.Component;

@Component
public class MD5Plus {
	private static String encryption(String password) {
		// 需要加密的字符串
		StringBuffer sb = new StringBuffer();
		try {
			// 加密对象，指定加密方式
			MessageDigest md5 = MessageDigest.getInstance("md5");
			// 准备要加密的数据
			byte[] b = password.getBytes();
			// 加密
			byte[] digest = md5.digest(b);
			// 十六进制的字符
			char[] chars = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E',
					'F' };

			// 处理成十六进制的字符串(通常)
			for (byte bb : digest) {
				sb.append(chars[(bb >> 4) & 15]);
				sb.append(chars[bb & 15]);
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		String pwd = sb.toString();

		return pwd;
	}
	
	public static String getPsw(String usr,String psw) {
		String encryption = encryption(psw+usr);
		String password = encryption(encryption);
		return password;
		
	};
}
