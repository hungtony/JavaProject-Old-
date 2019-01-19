package com.util;

public class StringUtils {
    public static boolean isEmpty(String s){
        return s==null || s.equals("") ? true: false;
    }

    public static void main(String[] s) {
        System.out.println(isEmpty(""));
    }
}
