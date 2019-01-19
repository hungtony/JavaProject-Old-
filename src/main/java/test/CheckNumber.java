package test;

import com.util.JsonUtil;
import com.util.StringUtils;

import java.util.*;

public class CheckNumber {

    /*
    public static String isOdd(Integer num1,Integer num2,Integer num3){
        Integer sum=num1+num2+num3;
        return (sum>=10?"大":"小")+(sum%2==0?"偶":"奇");
    }


    public static String isOddV2(List<Integer> numbers){

        Integer sum = numbers.stream().mapToInt(s->s.intValue()).sum();

        return (sum>=10?"大":"小")+(sum%2==0?"偶":"奇");
    }

    public static String isSerial(List<Integer> numbers){

        Collections.sort(numbers);

        return (numbers.stream().distinct().count()==3?
                (numbers.get(2)-numbers.get(0)==2?"三連號":"X"):"X"
                );

    }

    public static String isSame(List<Integer> numbers){

        long countSame = numbers.stream().distinct().count();

        return countSame==3?"三不同號":(countSame==1?"三同號":"X");

    }
    */

    public static List<Integer> trend(List<Integer> numbers){

        List<Integer> trendMap = new ArrayList<Integer>(Collections.nCopies(6,0));

        //numbers.forEach(s->trendMap.get);

        return  trendMap;
    }


    public static void main(String [] agrs){

       List<Integer> nums = Arrays.asList(2,3,5);

        //走勢


        //和值

        //組合

        //號碼型態

    }



}
