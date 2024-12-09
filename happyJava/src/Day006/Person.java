package Day006;

public class Person {
    public String name;

    public Person(String name){
        this.name=name;
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person person = new Person("park");
    }
}
