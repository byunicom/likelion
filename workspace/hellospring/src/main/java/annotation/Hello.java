package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Hello {
    @Count100
    public void print() {
        System.out.println("헬로");
    }
}
