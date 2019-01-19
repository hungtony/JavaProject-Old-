package test;

import java.util.Arrays;

public class CheckClass {

    public static int Compare(String s1,String s2){

        return s2.length() - s1.length() ;
    }



public static void main(String args[]) {

    String[] strArray = new String[]{"Tiger", "Rat", "Cat", "Lion"};

    Arrays.sort(strArray, CheckClass::Compare);
    for (String s : strArray) {
        System.out.print(s + " ");
    }



}

}
