package Day006;

public class Exam07 {
    public static void test(Parent p){
        System.out.println(p.i);
        System.out.println(p.getI());

        ((Child)p).print();
    }

    public static void main(String[] args) {
        Parent p = new Parent();

        Child c = new Child();
        test(c);
        System.out.println(p.i);
        System.out.println(c.getI());

        ((Child)c).print();
        System.out.println("--------------------");
        //결과 5,10,10

        Parent pc = new Child();
        test(pc);
        System.out.println(p.i);
        System.out.println(pc.getI());

        ((Child)pc).print();
        System.out.println("--------------------");
        //결과 5,10,10


        test(p);
        System.out.println(p.i);
        System.out.println(pc.getI());

        //결과 5,5 error
    }
}
