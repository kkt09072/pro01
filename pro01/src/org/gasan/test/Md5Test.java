package org.gasan.test;

import java.security.NoSuchAlgorithmException;

import org.gasan.util.AES256;

public class Md5Test {
	public static void main(String[] args) throws NoSuchAlgorithmException{
		String pwd = "1234";
		String res = AES256.md5(pwd);
		System.out.println("원래 비밀번호 : "+pwd);
		System.out.println("MD5 암호화된 비밀번호 : "+res);
	}
}
