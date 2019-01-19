package test;

import com.util.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

public class Lambda {

    public static void main(String [] args) {

        List<Person> personList = new ArrayList<>();
        Random random = new Random();

        for(int i=1;i<100;i++){
            personList.add(new Person("P"+i,(long)random.nextInt(100)+1,random.nextInt(2)));
        }

        //Lists.partition(personList,10).stream().map(List::stream).map(l->l.map(Person::getAge).collect(Collectors.toList())).collect(Collectors.toList()).forEach(System.out::println);
        //Lists.partition(personList,10).stream().flatMap(l->l.stream().map(Person::getAge)).collect(Collectors.toList()).forEach(System.out::println);
//        personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.groupingBy(Person::getSex))
//                .forEach((k,v)-> {
//                    System.out.println(" ");
//                    v.forEach(System.out::println);
//                });

        Map<Integer,Person> pMap = new HashMap<>();
        Map<String,Long> maps = personList.stream().filter(p->Objects.nonNull(p.getSex())).collect(Collectors.toMap(Person::getName,Person::getAge,(id1,id2)->id2));



        List<Integer> numCount = new ArrayList<>();

        for(int j=0;j<10;j++){
            numCount.add(0);
        }

        for(int k = 0; k < 100; k++){
            Integer randIndex = random.nextInt(10);
            numCount.set(randIndex,numCount.get(randIndex)+1);
        }

        numCount.forEach(n-> System.out.println(n+"%"));
    }
}
