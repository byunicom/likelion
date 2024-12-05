package Day004;

public class Dice {
    //속성 - 면, 눈
    int face;
    int eye;

    public void roll(){
        //주사위를 굴렸을 때...
        eye=(int)(Math.random()*face)+1;
    }
}
