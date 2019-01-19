package oneOneFive;

import java.util.Arrays;

public class ChiuWeiDingDanShuangEvaluator {

    public static void chiuWeiDingDanShuang(String betDetail, String drawResult){

        Integer evenCount = Arrays.asList(drawResult.split(",")).stream().mapToInt(Integer::parseInt)
                .reduce(0,(count,num)->{if(num%2==0)count++; return count;} );

        Integer oddCount = 5 - evenCount;

        String result = oddCount.toString()+"单"+evenCount.toString()+"双";

        if(betDetail.contains(result)) System.out.println("True!");
        else System.out.println("False!");

    }

    public static void main(String[] args) {

        /**
         * 驗証對象：投注內容5單0雙，當符合開獎內容為true，否則為false
         * 情境：投注内容為5單0雙，開獎內容五顆都為單，結果為true
         */
        chiuWeiDingDanShuang("5单0双", "01,03,05,07,11");

        /**
         * 驗証對象：投注內容5單0雙，當符合開獎內容為true，否則為false
         * 情境：投注内容為5單0雙，開獎內容4顆都為單，1顆為雙，結果為false
         */
        chiuWeiDingDanShuang("5单0双", "10,03,05,07,11");

        /**
         * 驗証對象：投注內容5單0雙，當符合開獎內容為true，否則為false
         * 情境：投注内容為5單0雙，開獎內容3顆都為單，2顆為雙，結果為false
         */
        chiuWeiDingDanShuang("5单0双", "02,10,05,07,11");

        /**
         * 驗証對象：投注內容5單0雙，當符合開獎內容為true，否則為false
         * 情境：投注内容為5單0雙，開獎內容2顆都為單，3顆為雙，結果為false
         */
        chiuWeiDingDanShuang("5单0双", "02,05,10,06,11");

        /**
         * 驗証對象：投注內容5單0雙，當符合開獎內容為true，否則為false
         * 情境：投注内容為5單0雙，開獎內容1顆都為單，4顆為雙，結果為false
         */
        chiuWeiDingDanShuang("5单0双", "02,08,10,06,11");

        /**
         * 驗証對象：投注內容5單0雙，當符合開獎內容為true，否則為false
         * 情境：投注内容為5單0雙，開獎內容0顆都為單，5顆為雙，結果為false
         */
        chiuWeiDingDanShuang("5单0双", "02,08,10,06,04");

        /**
         * 驗証對象：投注內容〔5單0雙,4單1雙,3單2雙〕當符合開獎內容為true，否則為false
         * 情境：投注内容為〔5單0雙,4單1雙,3單2雙〕，開獎內容5顆都為單，0顆為雙，結果為true
         */
        chiuWeiDingDanShuang("5单0双,4单1双,3单2双", "11,05,03,09,07");

        /**
         * 驗証對象：投注內容〔5單0雙,4單1雙,3單2雙〕當符合開獎內容為true，否則為false
         * 情境：投注内容為〔5單0雙,4單1雙,3單2雙〕，開獎內容4顆都為單，1顆為雙，結果為true
         */
        chiuWeiDingDanShuang("5单0双,4单1双,3单2双", "11,06,03,09,07");

        /**
         * 驗証對象：投注內容〔5單0雙,4單1雙,3單2雙〕當符合開獎內容為true，否則為false
         * 情境：投注内容為〔5單0雙,4單1雙,3單2雙〕，開獎內容3顆都為單，2顆為雙，結果為true
         */
        chiuWeiDingDanShuang("5单0双,4单1双,3单2双", "10,06,03,09,07");

        /**
         * 驗証對象：投注內容〔5單0雙,4單1雙,3單2雙〕當符合開獎內容為true，否則為false
         * 情境：投注内容為〔5單0雙,4單1雙,3單2雙〕，開獎內容2顆都為單，3顆為雙，結果為false
         */
        chiuWeiDingDanShuang("5单0双,4单1双,3单2双", "10,06,04,09,07");

        /**
         * 驗証對象：投注內容〔5單0雙,4單1雙,3單2雙〕當符合開獎內容為true，否則為false
         * 情境：投注内容為〔5單0雙,4單1雙,3單2雙〕，開獎內容1顆都為單，4顆為雙，結果為false
         */

        /**
         * 驗証對象：投注內容〔5單0雙,4單1雙,3單2雙〕當符合開獎內容為true，否則為false
         * 情境：投注内容為〔5單0雙,4單1雙,3單2雙〕，開獎內容0顆都為單，5顆為雙，結果為false
         */
        chiuWeiDingDanShuang("5单0双,4单1双,3单2双", "10,06,04,08,02");

    }
}
