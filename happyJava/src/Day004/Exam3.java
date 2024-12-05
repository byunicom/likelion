package Day004;

public class Exam3 {
    //메소드 - 기능 (행위)
    //정수값 2개를 받아서 더해두는 기능을 구현하고 싶다.
    //접근제한자 리턴타입 메소드명(매개변수들){구현부}

    //인수값 2개 짜리 메소드 생성
    public static int addInt(int value1, int value2){
        System.out.println("인수값 2개 짜리 메소드 실행");
        int sum = value1 + value2;
        return sum;     //파라메터를 받고 나면 반환값은 반드시 return 으로 명시해줘야 한다. (sum 의 데이터 형은 int 이다.)
    }

    //인수값 3개 짜리 메소드 생성
    public static int addInt(int value1, int value2, int value3){
        System.out.println("인수값 3개 짜리 메소드 실행");
        //변수에 담지 않고 바로 return 도 가능
        return value1+value2+value3;
    }

    public static int addInt(int value1, int value2, int value3, int value4){
        System.out.println("인수값 4개 짜리 메소드 실행");
        return value1+value2+value3+value4;
    }

    //배열 메소드 생성
    public static int addInt(int... values){
        System.out.println("배열 메소드 실행");
        int sum = 0;
        for(int value:values){
            sum += value;
        }

        return sum;
    }

    //main 메소드
    public static void main(String[] args) {

        //변수에 담아서 return 값 출력
        int result2 = addInt(1,5);
        System.out.println(result2);

        //직접 return 값 출력
        System.out.println(addInt(4,5));

        //인수값 3개 짜리 메소드 호출
        int result3 = addInt(1,9,3);
        System.out.println(result3);

        //인수값 4개 짜리 메소드 호출
        int result4 = addInt(1,9,3,6);
        System.out.println(result4);

        System.out.println(addInt(4,6,7,2,5,6));
    }
}
