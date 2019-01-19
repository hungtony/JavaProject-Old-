package oneOneFive;

import java.util.Arrays;

/**
 * 玩法:選一_前三一碼不定位_複式
 * @author jomo.wu
*/
public class ChianSanYiMaBuDingWeiEvaluator {

    public static void chianSanYiMaBuDingWei(String betDetail, String drawResult){

        Long winCount = Arrays.asList(betDetail.split(",")).stream()
                .filter(n->drawResult.substring(0,8).contains(n)).count();

        System.out.println(winCount);

    }

    public static void main(String[] args) {

        //驗証對象：投注內容只選一顆，與開獎內容前三顆符合其中一顆，則為true
        chianSanYiMaBuDingWei("01,02,03,04,05,06,07,08,09,10,11", "07,11,05,02,06");
        //驗証對象：投注內容只選一顆，與開獎內容前三顆都不符合，則為false
        chianSanYiMaBuDingWei("11", "04,03,10,07,11");
        //驗証對象：投注內容只選一顆以上，與開獎內容前三顆符合其中一顆，則為true
        chianSanYiMaBuDingWei("02,07,10,11", "04,03,10,07,11");
        //驗証對象：投注內容只選一顆以上，與開獎內容前三顆都未符合，則為false
        chianSanYiMaBuDingWei("01,02,05,07,11", "04,03,10,07,11");

    }
}
