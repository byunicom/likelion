package Day005;

public class Exam5 {
    public void test(int i){

    }

    public void test (int i, int j){

    }

    public boolean test(boolean b){
        return b;
    }

    public String test(String s){
        return s;
    }

    public void test(double d){

    }

    public static void main(String[] args) {
        Exam5 e = new Exam5();
        System.out.println(e.test("10"));
        System.out.println(e.test(true));
    }
}
