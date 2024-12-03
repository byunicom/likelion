package Day002;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.zip.DeflaterOutputStream;

public class Exam002_05 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);      //정수 최대값
        System.out.println(Integer.MIN_VALUE);      //정수 최소값

        System.out.println(Character.MAX_VALUE);    //문자 최대값
        System.out.println(Character.MIN_VALUE);    //문자 최소값

        System.out.println(Double.MAX_VALUE);       //Double 최대값
        System.out.println(Double.MIN_VALUE);       //Double 최소값

        System.out.println("-----------------------");
        System.out.println(5/2);                    //나눈 몫
        System.out.println(5%2);                    //나머지
        System.out.println("-----------------------");

        int a = 10;
        int b = 10;

//        a++;    //증가연산자 a = a + 1;
//        ++a;    //문장 하나로 끝날때는 ++ 앞에 나오나 뒤에 나오나 차이가 없다.

        System.out.println("출력을 먼저 함 : " + a++);
        System.out.println("이후 a 에 증가 시킴 : "+ a);
        System.out.println("-----------------------");
        System.out.println("증가 후 출력 : " + ++b);
        System.out.println("먼저 증가시켜서 변화 없음 : " + b);
    }
}
