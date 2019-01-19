package test;

import java.util.List;
import java.util.Map;

public class Chart {

    /*
    private List<Integer> winningNumbers;  //中獎號碼

    private String issue; //獎期

    private Integer sum;  //總和 快3

    private String combination;  //大小單雙組合  快3

    private String parity; //單雙

    private String BigSmall; //大小

    private String upDown; //上下盤

    private String threeSameNum;  //豹子

    private String threeSerialNum;  //連續3數

    private String twoSameNum;   //同2數

    private List<Integer> trend;  //走勢

    private class bigNumber{    //數字本身

        private int number;
        private String numberTemp;  //號溫
        private int freq;  //出現頻率
        private int lastAppear; //上次出現多久之前
    }

    */


    private class bigNumber{//數字本身

        private int number;
        private String numberTemp;  //號溫
        private int freq;  //出現頻率
        private int lastAppear; //上次出現多久之前
    }

    /*----------11選5------------*/

    //從0-11中挑選1-8個號碼進行投注,將會開出5個號碼
    //胆码:每組必購數字   拖码:胆码外的號碼
    //選1-選3有分前幾個號碼對獎或全部號碼對獎

    private String lotteryType; //彩種
    private String issue; //獎期
    private List<Integer> winningNumbers;  //中獎號碼
    private List<Integer> firstNumber; //第一位
    private List<Integer> secondNumber; //第二位
    private List<Integer> thirdNumber; //第三位
    private List<Integer> forthNumber; //第四位
    private List<Integer> fifthNumber; //第五位
    private List<Integer> numberMap;//號碼分佈
    private Integer median; //中位數
    private String sbRatio; //單雙比

    //http://gz.baba85.com/?post=22
}
