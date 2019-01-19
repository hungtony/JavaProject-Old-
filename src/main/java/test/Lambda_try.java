package test;

import java.util.HashMap;
import java.util.Map;

public class Lambda_try {


    public static void main(String [] args) {

        Map<Integer,String> maps = new HashMap<>();
        maps.put(1,"1");
        maps.put(2,null);
        maps.put(3,"166");
        maps.put(4,"163");
        maps.put(5,"1");
        maps.put(6,"fff");
        maps.put(7,"144");
        maps.put(8,"ooooo");

        String temp = "OPOPOP";
        temp = temp.concat("@@@");
        //System.out.println(temp);


        maps.compute(2,(k,v)->v==null? "OK":v+"TB");
        maps.putIfAbsent(9,"OLOLOL");
        maps.computeIfAbsent(10,k->k+"NB");
        maps.computeIfPresent(1,(k,v)->k+v+"TB");
        maps.merge(8,"*****",String::concat);
        //System.out.println(maps);

        Map<Integer,String> mapOne = new HashMap<>();

        mapOne.put(1,"1");
        mapOne.put(2,"14");
        mapOne.put(3,"10");
        mapOne.put(4,"99");
        mapOne.put(5,"55");
        mapOne.put(6,"091");
        mapOne.put(7,"123");

        Map<Integer,String> mapTwo = new HashMap<>(mapOne);

        mapTwo.forEach((k,v)->{
            mapOne.merge(k,v,String::concat);
        });

        System.out.println(mapOne);


    }

}
