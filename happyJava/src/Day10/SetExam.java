package Day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//중복 허용하지 않음....동일한 값이 들어오면 새로 들어온 값으로 교체하는 개념이다.
public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);
        set.add("a");
        System.out.println(set);

        if (set.contains("d")) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println("set 모두 보여주기");
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("==============");
        Set<Pen> penSet = new HashSet<>();
        penSet.add(new Pen("white"));
        penSet.add(new Pen("black"));
        penSet.add(new Pen("yellow"));

        System.out.println(penSet);

        penSet.add(new Pen("white"));

        System.out.println(penSet);

        if(penSet.contains(new Pen("white"))){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
