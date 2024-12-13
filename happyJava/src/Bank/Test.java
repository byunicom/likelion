package Bank;

public class Test {
    ArrayTest[] arrayTest = new ArrayTest[10];

    public Test(){
        for(int i=0;i<arrayTest.length;i++){
            arrayTest[i] = new ArrayTest(i+1,"TEST");
        }
    }

    public static void main(String[] args) {

    }
}
