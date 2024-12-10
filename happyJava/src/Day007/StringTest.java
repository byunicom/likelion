package Day007;

public class StringTest {
    boolean a;
    public static void main(String[] args) {
        String greeting = "Hello World1";
        System.out.println(greeting.length());
        char firstChar = greeting.charAt(1);
        System.out.println(firstChar);

        StringTest stringTest=new StringTest();
        stringTest.test(true);
    }

    public boolean test(boolean b){
        this.a = b;
       if(a == true){
           System.out.println("일치");
       }
        return a;
    }

}
