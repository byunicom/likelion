package Day009;

public class ExceptionExam04 {
    public static void 심부름(){
        System.out.println("심부름 시작");

        int i=0;

        try {
            System.out.println(10 / i);
        }catch (Exception e){
            System.out.println("다른 마트로 ㄱ");
        }

        System.out.println("심부름 끝 ");
    }

    public static void 심부름2() throws Exception{
        System.out.println("심부름 시작 ");
        int i=0;
        System.out.println(10/i);
        System.out.println("심부름 끝 ");
    }
    public static void main(String[] args) throws Exception{
        심부름();
        심부름2();

        try{
            심부름2();
        }catch (Exception e){
            System.out.println("동생에게 시킴 ");
        }

    }

}
