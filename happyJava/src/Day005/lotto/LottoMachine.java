package Day005.lotto;

public class LottoMachine {
    private Ball[] lottoBalls = new Ball[45];

    //lottoBalls 배열변수에 값을 담기만 한다.
    //Ball class
    public LottoMachine(){
        //1-45번까지 숫자를 가진 볼을 로또 머신에 넣어준다.
        for(int i = 0;i<lottoBalls.length;i++){
            lottoBalls[i] = new Ball(i+1);
        }
    }

    //섞어 주세요. (랜덤하게 뽑아서 100번 배열위치를 섞어보자)
    public void mix(){
        for(int i=0;i<100;i++){
            int x = (int)(Math.random() * lottoBalls.length);
            int y = (int)(Math.random() * lottoBalls.length);

            //로또 배열에 누가 들어있나요?
            Ball temp = lottoBalls[x];
            lottoBalls[x] = lottoBalls[y];
            lottoBalls[y] = temp;
        }
    }

    //뽑아주세요
    public Ball getBall(){
        Ball ball;
        int index;
        do{
            index = (int)(Math.random()*lottoBalls.length);
            ball = lottoBalls[index];
        }while(ball == null);
        lottoBalls[index] = null;
        return ball;
    }
}
