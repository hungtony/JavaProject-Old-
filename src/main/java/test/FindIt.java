package test;

import java.util.function.Function;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindIt {


    public static void main(String[] args) {

        assertEquals(5, FindOdd(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        assertEquals(-1, FindOdd(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
        assertEquals(5, FindOdd(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
        assertEquals(10, FindOdd(new int[]{10}));
        assertEquals(10, FindOdd(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
        assertEquals(1, FindOdd(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
    }


    public static int FindOdd(int[] num) {

        String temp = IntStream.of(num).mapToObj(String::valueOf).collect(groupingBy(Function.identity(), counting()))
                .entrySet().stream().reduce((x, y) -> y.getValue() % 2 != 0 ? x = y : x).map(z -> z.getKey()).get();

        return Integer.parseInt(temp);
    }


    public static void assertEquals(int a, int b) {
        if (a == b) System.out.println("O");
        else System.out.println("X");
    }

}
