package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        System.out.println(fruits);
        String firstFruit = fruits.get(0);
        System.out.println(firstFruit);

        System.out.println(fruits);
        fruits.set(1,"persimmon");

        System.out.println(fruits);
        fruits.add(1,"banana");

        System.out.println(fruits);
        fruits.remove("apple");
        System.out.println("-------------");
        System.out.println(fruits);

        boolean delFlag = fruits.remove("banana");

        System.out.println("-------------");
        System.out.println(fruits);

        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(2);
        integerList.add(3);

        System.out.println(integerList);
        Collections.shuffle(integerList);
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);

    }
}
