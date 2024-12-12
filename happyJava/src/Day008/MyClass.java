package Day008;

public class MyClass implements Myinterface {
    @Override
    public void doSomething() {
        System.out.println("MyClass에서 doSomething 구현");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.doDefault();

        myClass.doSomething();

    }
}
