package Day007;

//Object

class Cup{
    String name;
    int price;
}

public class ObjectTest {
    public static void main(String[] args) {
        Cup cup = new Cup();
        System.out.println(cup);
        System.out.println(cup.toString());

        Pen pen = new Pen();
        System.out.println(pen);
        System.out.println(pen.toString());
    }
}
