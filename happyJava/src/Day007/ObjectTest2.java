package Day007;

public class ObjectTest2 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.i=10;
        System.out.println(myClass);

    }

    static class MyClass {
        int i;

        @Override
        public String toString() {
            return i + "";
        }


    }
}
