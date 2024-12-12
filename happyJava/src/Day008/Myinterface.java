package Day008;

public interface Myinterface {
    // 상수 선언
    public static final int CONSTANT = 10;
    // 추상 메서드 선언 (abstract 키워드 생략 가능)
    void doSomething();
    // 자바8 이후: default 메서드 (구현체 가짐)
    default void doDefault() {
        System.out.println("기본 구현 제공");
    }
    // 자바8 이후: static 메서드 (구현체 가짐)
    static void staticMethod() {
        System.out.println("인터페이스의 static 메서드");
    }

}
