package oneOneFive;

import java.util.Arrays;

public class ChianErJrShiuanDanShrEvaluator {

    /**
     * 玩法:選二_前二直選_單式
     */
    public static void chianErJrShiuanDanShr(String betDetail, String drawResult){

        String temp = drawResult.substring(0,5).replace(","," ");

        System.out.println(Arrays.asList(betDetail.split(",")).stream().anyMatch(n->n.equals(temp)));

    }


    public static void main(String[] args) {
        //驗証對象：投注一組單式，與開獎的前二顆符合且順序一致，則為true
        chianErJrShiuanDanShr("01 03", "01,03,05,07,11");

        //驗証對象：投注一組單式，與開獎的前二顆符合但順序不一致，則為false
        chianErJrShiuanDanShr("03 01", "01,03,05,07,11");

        //驗証對象：投注一組單式，與開獎的前二顆不符合，則為false
        chianErJrShiuanDanShr("05 07", "01,03,05,07,11");

        //驗証對象：投注一組以上的單式，其中一組與開獎結果的前二顆符合且順序一致，則為true
        chianErJrShiuanDanShr("01 02,10 05,01 03", "01,03,05,07,11");

        //驗証對象：投注一組以上的單式，其中一組與開獎結果的前二顆符合順序不一致，則為false
        chianErJrShiuanDanShr("01 02,10 05,03 01", "01,03,05,07,11");

        //驗証對象：投注一組以上的單式，其中一組與開獎結果的前二顆不符合，則為false
        chianErJrShiuanDanShr("01 02,10 05,03 02", "01,03,05,07,11");
    }
}
