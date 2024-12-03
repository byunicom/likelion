/**
 * 삼항연산자
 * */
package Day002;

public class Opexam {
    public static void main(String[] args) {
        //삼항 연산자
        //(조건)? 식1 : 식2
        int num = 10;
        boolean b = (num > 5)?true:false;

        System.out.println(num);
        System.out.println("-----------------------");

        System.out.println(b);
        System.out.println("-----------------------");
        String result = (num > 0)?"양수":"음수";

        System.out.println(result);

    }
}