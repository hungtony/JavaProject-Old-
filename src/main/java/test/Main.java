package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> treeMaps = new TreeMap<>();
        treeMaps.put(3001, "S");
        treeMaps.put(2133, "C");
        treeMaps.put(6531, "Q");
        treeMaps.put(1000, "W");

        String input = "34,13,89,06,33,111,07,56,321,32,1,4,76,43,764";

        Map<String, List<Integer>> maps = new HashMap<>();

        maps.put("大於50", new ArrayList<>());
        maps.put("小於50", new ArrayList<>());

        Arrays.asList(input.split(",")).stream().map(x -> Integer.parseInt(x))
                .forEach(y -> {
                    if (y >= 50) maps.get("大於50").add(y);
                    else maps.get("小於50").add(y);
                });

        Consumer<String> x = s -> System.out.println(s);

        List<Integer> as = Arrays.asList(1, 2, 3);
        String te = String.join(" 111 ");

    }

}
