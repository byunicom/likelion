/**
 *
 * 반복문 복습
 * 날짜 : 2024.12.03
 * @Author : byunicom
 *
*/

package Day02;

public class Exam002_01 {
    public static void main(String[] args) {

        //반복문!! while
        //while(조건식){ 반복할 문장 }  //조건식의 결과가 참 일때까지 반복할 문장을 실행 (1+1) 은 조건식으로 사용 불가 - 결과가 참, 거짓만 가능
        //변수 (값을 담을 그릇이 필요하다.)
        //상수 (변하지 않는 값을 담는 그릇) ex. final int j = 20;
        //메서드 안에서 사용되는 변수는 반드시 초기값을 넣어야 함
        
        int i = 10; // "타입 변수명 = 초기값" 형태로 작성함

        System.out.println(i);
        while(i>0){
            System.out.println("****");
            i = i - 1;
        }
    }
}
