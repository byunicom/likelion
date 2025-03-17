package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ServiceRun {
    public static void main(String[] args) {
        Service service = new Service();
        Method[] declareMethods = service.getClass().getDeclaredMethods();

        for(Method method : declareMethods){
            if(method.isAnnotationPresent(PrintAnnotation.class)){
                System.out.println("[[[[[["+method.getName()+"]]]]]]");

                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

                for(int i=0;i< printAnnotation.number();i++){
                    System.out.println(printAnnotation.value());
                }

                System.out.println();
            }

            try{
                method.invoke(service);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
