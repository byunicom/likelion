package annotation;

import java.lang.reflect.Method;

public class HelloRun {
    public static void main(String[] args) throws NoSuchMethodException {
        Hello hello = new Hello();

        Method method = hello.getClass().getDeclaredMethod("print");

        if(method.isAnnotationPresent(Count100.class)){
            for(int i =0;i<100;i++){
                System.out.print(i+"////");
                hello.print();
            }
        }else{
            hello.print();
        }
    }
}
