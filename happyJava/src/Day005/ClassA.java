package Day005;

public class ClassA {
    public static int fieldA;   //클래스 필드

    public int fieldB;  //인스턴스 필드
    private int fieldC; //private 필드는 다른 클래스에서 접근이 불가능하다.
    protected int fieldD;   //다른 패키지라도 나의 자손은 접근 가능하다.

    public static void main(String[] args) {
        System.out.println(ClassA.fieldA);  //클래스 필드는 클래스 이름으로 직접 접근이 가능하다.


        //System.out.println(ClassA.filedB); <-- 이렇게는 불가능

        ClassA a = new ClassA();        //인스턴스 필드는 인스턴스가 생성되어야만 비로서 접근 가능.
        System.out.println(a.fieldB);
    }
}
