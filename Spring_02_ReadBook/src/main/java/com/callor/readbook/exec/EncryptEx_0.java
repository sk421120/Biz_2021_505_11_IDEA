package com.callor.readbook.exec;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class EncryptEx_0 {
    public static void main(String[] args) {
        StandardPBEStringEncryptor pbe = new StandardPBEStringEncryptor();

        String name = "Korea";
        String salt = "!Biz1234";
//        SHA-128   SHA-256 SHA-512 SHA-1024
        String encPolicy = "PBEWithMD5AndDES";

        pbe.setAlgorithm(encPolicy);
        pbe.setPassword(salt);
//
//        String encText = pbe.encrypt(name);
//        System.out.println(name);
//        System.out.println(encText);
//
//        String planText = pbe.decrypt(encText);
//        System.out.println(planText);

        String username = "root";
        String password = "!Biz12341234";
        // μνΈν
        String encUserName = pbe.encrypt(username);
        String encPassword = pbe.encrypt(password);

        System.out.printf("user name: %s\n", encUserName);
        System.out.printf("password: %s\n", encPassword);
    }
}
