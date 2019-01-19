package oneOneFive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ChiuWeiEvaluator {

    public static void chiuWeiTsaiJungWei(String betDetail, String drawResult){

        Long count = 0L;

        List<String> drawList = Arrays.asList(drawResult.split(","));
        drawList.sort(Comparator.naturalOrder());

        if(betDetail.contains(drawList.get(2))) count++;
        System.out.println(count);
    }


    public static void main(String[] args) {

        /**
         * 驗証對象:03~09選擇一個號碼，開獎內容排序後符合第三位,則為true，否則為false
         * 情境：投注内容為09，結果為true
         */
        chiuWeiTsaiJungWei("09", "09,10,11,04,01");

        /**
         * 驗証對象:03~09選擇一個號碼，開獎內容排序後符合第三位,則為true，否則為false
         * 情境：投注内容為9，結果為false
         */
        chiuWeiTsaiJungWei("9", "09,10,11,04,01");

        /**
         * 驗証對象:03~09選擇一個號碼，開獎內容排序後符合第三位,則為true，否則為false
         * 情境：投注内容為03，結果為false
         */
        chiuWeiTsaiJungWei("03", "09,10,11,04,01");

        /**
         * 驗証對象:03~09選擇多組，開獎內容排序後符合第三位,則為true，否則為false
         * 情境：投注内容為03,05,06，結果為true
         */
        chiuWeiTsaiJungWei("03,05,06", "05,02,01,11,07");

        /**
         * 驗証對象:03~09選擇多組，開獎內容排序後符合第三位,則為true，否則為false
         * 情境：投注内容為3,5,6，結果為false
         */
        chiuWeiTsaiJungWei("3,5,6", "05,02,01,11,07");

        /**
         * 驗証對象:03~09選擇多組，開獎內容排序後符合第三位,則為true，否則為false
         * 情境：投注内容為03,05,06，結果為false
         */
        chiuWeiTsaiJungWei("03,05,06", "05,02,01,04,07");

    }

}
