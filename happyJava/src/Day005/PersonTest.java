package Day005;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.name = "kang";
        p2.name = "kim";
        p3.name = "hong";

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.name);

        p1.count = 10;  //Person Class 의 count 값을 10 으로 update
        p2.count = 20;  //Person Class 의 count 값을 20 으로 update
        p3.count = 30;  //Person Class 의 count 값을 30 으로 update

        //int static count; <-- static 으로 되어 있으면 최종 입력된 30 값을 표현한다.
        System.out.println(p1.count);
        System.out.println(p2.count);
        System.out.println(p3.count);

    }
}
