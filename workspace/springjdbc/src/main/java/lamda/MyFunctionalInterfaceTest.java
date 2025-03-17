package lamda;

//public int method(int x, int y); 형태의 메소드를 가진 FunctionalInterface를 하나 정의

public class MyFunctionalInterfaceTest {
//    public static void testMethod(MyFunctionalInterface f, int number){
//        f.method(number);
//    }

    public static void main(String[] args) {

//        testMethod(a-> {
//            int result = a *3;
//            System.out.println(result);
//        },6);

//        MyFunctionalInterface fi;


//        fi = new MyFunctionalInterface() {
//
//            @Override
//            public void method(int x) {
//                int result = x * 5;
//                System.out.println(result);
//            }
//        };
//
//        fi.method(5);
//
//        fi2=new MyFunctionalInterface2() {
//            @Override
//            public void method(int x, int y) {
//                int result = x+y;
//                System.out.println(result);
//            }
//        };
//
//        fi2.method(3,5);


        MyFunctionalInterface fi = (int x)-> {
          int result = x*5;
          System.out.println("DDDDD: "+result);
        };

        fi.method(5);

//        MyFunctionalInterface2 fi2 = (int x, int y)-> {
//            int result = x+y;
//            System.out.println("kkkkk: "+result);
//        };
//
//        fi2.method(5,6);

        MyFunctionalInterface2 f2;



//
//        fi =  x-> {
//            int result = x*5;
//            System.out.println(result);
//        };
    }
}
