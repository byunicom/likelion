/**
 * 라벨 테스트1
 * 0과 2의 순서가 도달하면 for 문을 강제 종료시킨다.
 */

package Day003;

public class LabelExam1 {
    public static void main(String[] args){
        outter:
        for(int i = 0; i< 3; i++){
            for(int k = 0; k < 3; k++){
                if( i == 0 && k == 2)
                    break outter;
                System.out.println(i + ", " + k);
            }
        }
    }
}
