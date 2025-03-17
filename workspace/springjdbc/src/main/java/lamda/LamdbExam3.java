package lamda;

public class LamdbExam3 {
    public static void main(String[] args) {
        IntBinaryOperation add = (a,b) -> a + b;
        IntBinaryOperation subtract = (a,b) -> a-b;
        IntBinaryOperation multiply = (a,b) -> a*b;
        IntBinaryOperation divide = (a,b) -> a/b;


        System.out.println("10 + 5 = "+ add.apply(10,5));
        System.out.println("10 - 5 = "+ subtract.apply(10,5));
        System.out.println("10 * 5 = "+ multiply.apply(10,5));
        System.out.println("10 / 5 = "+ divide.apply(10,5));
    }
}
