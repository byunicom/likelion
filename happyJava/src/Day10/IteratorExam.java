package Day10;

import java.util.*;

//이터레이터
public class IteratorExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        //Array List 는 순서가 있는 자료구조이므로 이 방법 가능.
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("========================");

        //순서가 없는 자료구조에서는 ?? 이터레이터..
        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
            //iter.remove();
        }
        System.out.println("========================");

        for(String item : list){
            System.out.println(item);
        }
        System.out.println("==========set===========");
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

//        for(int i=0;i~~){ set은 순서가 없는 자료구조이므로 index가 존재하지 않아, for/while 형태로 데이터를 추출할 수 없다.
        Iterator<String> setIter = set.iterator();
        while(setIter.hasNext()){
            System.out.println(setIter.next());
        }

        for(String item : set){
            System.out.println(item);
        }


    }
}
