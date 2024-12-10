package Day007;

class MyClass{
    int i;
}

class Person{

    String name;
    int age;
    String address;

}


public class ObjectTest3 {



    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.i = 10;

        System.out.println(myClass.i);

        //Person kang = new Person("kang",20,"강남구 역삼동");

    }
}
