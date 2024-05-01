package org.gasan.test;

import java.security.NoSuchAlgorithmException;

import org.gasan.util.AES256;

public class Sha256Test {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String pwd = "1234";
		String res = AES256.sha256(pwd);
		System.out.println("원래 비밀번호 : "+pwd);
		System.out.println("SHA256 암호화된 비밀번호 : "+res);
	}
}
