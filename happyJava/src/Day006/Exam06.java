package Day006;

public class Exam06 {

    public static void test(Parent p){
        System.out.println(p.i);
        System.out.println(p.getI());
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.i);        //5
        System.out.println(p.getI());   //5

        Child c = new Child();
        System.out.println(c.i);        //10
        System.out.println(c.getI());   //10

        Parent pc = new Child();
        System.out.println(pc.i);       //5
        System.out.println(pc.getI());  //10

        System.out.println("=====================");
        test(p);
        System.out.println(p.i);
        System.out.println(p.getI());

        System.out.println("=====================");
        test(c);
        System.out.println(p.i);
        System.out.println(c.getI());

        System.out.println("=====================");
        test(pc);
        System.out.println(p.i);
        System.out.println(pc.getI());
    }
}
