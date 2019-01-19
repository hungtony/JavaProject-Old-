package test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {


    public static void main(String [] args) {

        int [] nums = {9,6,4,2,3,5,7,0,1};

        missingNumber(nums);

    }


    public static int missingNumber(int [] nums) {

        System.out.println(Arrays.stream(nums).sorted()
                //.reduce(0,(x,y)->x =  )
                );


        return 0;
    }

}
