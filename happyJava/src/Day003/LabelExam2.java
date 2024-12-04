/**
 * 라벨 테스트2
 * 0과 2에 도달하면, 다음 0과 3은 실행하지 않고 outter 라벨위치로 이동하여 계속 looping 된다. (continue)
 */
package Day003;

public class LabelExam2 {
    public static void main(String[] args){
        outter:
        for(int i = 0; i< 3; i++){
            for(int k = 0; k < 3; k++){
                if( i == 0 && k == 2)
                    continue outter;
                System.out.println(i + ", " + k);
            }
        }
    }
}

