package Day004;

import Day005.ClassA;

public class SubClassA extends ClassA {
    public void test(){
        System.out.println(fieldD); //protected - 상속받았으므로 ClassA 의 인스턴스 필드에도 접근이 가능하다.
    }
}
