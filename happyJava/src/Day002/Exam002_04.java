package Day002;

public class Exam002_04 {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;

        flag1 = 10 > 5 && 5 < 20;
        flag2 = 10 > 5 & 5 < 20;
        flag3 = 10 >= 10 || 5 > 6;
        flag4 = 10 <= 10 | 5 > 6;
        flag5 = 10 == 10 ^ 5 == 4;
        flag6 = !flag5;

        System.out.println("flag1 : " + flag1);
        System.out.println("flag2 : " + flag2);
        System.out.println("flag3 : " + flag3);
        System.out.println("flag4 : " + flag4);
        System.out.println("flag5 : " + flag5);
        System.out.println("flag6 : " + flag6);
    }
}