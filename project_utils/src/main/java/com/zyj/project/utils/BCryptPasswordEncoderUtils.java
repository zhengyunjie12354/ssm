package com.zyj.project.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {
    private  static BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();

    private static String encoderPassword(String password) {
        return bCryptPasswordEncoder.encode(password);
    }

//    public static void main(String[] args) {
//        String password = "123456";
//        String s = encoderPassword(password);
//        System.out.println(s);
////        加密后
////        $2a$10$94NnYJrwFK3h8znD5nQ6yubkiivdoxFZSzwJ2R2ZO2povoBtuPW.i
//    }
}
