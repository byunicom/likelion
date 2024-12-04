/**
 * \t 는 탭이다.
 * print 는 값만 출력한다.
 * println 은 줄 바꿈이다.
 * 각 단별로 캡으로 구분시켜주는 방식이다.
 */
package Day003;

public class Gugudan2 {
    public static void main(String[] args) {
        a: for(int i =1; i <= 9; i++){
            for(int j = 2; j <= 9; j++){
                    System.out.print(j + " * "+ i + " = " + (j*i)+"\t");
            }
            System.out.println();
        }
    }
}
