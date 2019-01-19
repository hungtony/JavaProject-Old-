package oneOneFive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RenShiuanFuShrEvaluator {

    public static void renShiuanJungFuShr(String betDetail, String drawResult){

        List<String> betList = new ArrayList<>(Arrays.asList(betDetail.split(" ")));
        List<String> drawList = new ArrayList<>(Arrays.asList(drawResult.split(",")));

        drawList.retainAll(betList);
        if(betList.size()==drawList.size()||drawList.size()==5) System.out.println("True");
        else System.out.println("False");

//        betList.removeIf(drawList::contains);
//        if(betList.size()==0) System.out.println("True");
//        else System.out.println("False");
    }

    public static StringBuffer getRandomNum(){

        Random random = new Random();

        StringBuffer nums = new StringBuffer();

        Integer n = random.nextInt(11)+1;
        nums.append(n > 9 ? n.toString() : "0"+n.toString());

        return nums;
    }

    public static String getRandomBet(){

//        Set<String> set = new HashSet<>();
//
//        Random random = new Random();
//        int time = random.nextInt(5)+1;
//
//        while(set.size()!= time){
//            set.add(getRandomNum().toString());
//        }
//
//        return set.toString().replaceAll("[,\\[\\]]","");

        StringBuffer bet = new StringBuffer(getRandomNum());
        Random random = new Random();
        int time = random.nextInt(8)+1;

        for(int i = 0; i < time-1; i++){
            String temp = getRandomNum().toString();

            if(bet.indexOf(temp)!=-1) i--;
            else bet.append(" "+temp);
        }

        return bet.toString();
    }


    public static void main(String[] args) {

//        renShiuanJungFuShr("05 10", "06,11,04,02,07");
//        renShiuanJungFuShr("06 11", "06,11,04,02,07");
//        renShiuanJungFuShr("04 10 08 ", "06,11,04,02,07");
//        renShiuanJungFuShr("05 10 02 07", "06,11,04,02,07");
//        renShiuanJungFuShr("06 11 04", "06,11,04,02,07");
//        renShiuanJungFuShr("06 11 04 07 02", "06,11,04,02,07");
//        renShiuanJungFuShr("05 10 04 07", "06,11,04,02,07");
//        renShiuanJungFuShr("05 10 01", "06,11,04,02,07");
//        renShiuanJungFuShr("05 10 11", "06,11,04,02,07");
//        renShiuanJungFuShr("05 10 03", "06,11,04,02,07");
//        renShiuanJungFuShr("05", "06,11,04,02,07");
//        renShiuanJungFuShr("06", "06,11,04,02,07");
//        renShiuanJungFuShr("08 07", "06,11,04,02,07");
//        renShiuanJungFuShr("11 02", "06,11,04,02,07");
//        renShiuanJungFuShr("04 02 11", "06,11,04,02,07");

        //System.out.println(System.currentTimeMillis());
        for(int i =0; i<10; i++) {
            String temp = getRandomBet();
            System.out.println(temp);
            renShiuanJungFuShr(temp, "06,11,04,02,07");
        }
        //System.out.println(System.currentTimeMillis());
    }

}
