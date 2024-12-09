package Day006;

public class TV {
    private boolean power;
    private int channel;
    private int volume;

    //생성자가 다른 생성자를 호출 할 수 있다. this() -- 나의 생성자를 의미한다.
    public TV(){
        System.out.println("TV() 생성자 호출");

    }

    public TV(boolean power, int channel){
        this(power, channel, 0);
        System.out.println("TV(boolean power, int channel) 생서자 호출");
        System.out.println("티비가 처음 생성될 때 해야하는 많은 일!!");
        this.power=power;
        this.channel=channel;
    }

    public TV(boolean power){
        this(power, 0, 0);  //this 는 다른 코드 이후에 쓸 수 없고 제일 처음에 나와야 한다.
        System.out.println("TV(boolean power) 생성자 호출");
//        this.power = power;

    }

    public TV(boolean power, int channel, int volume){
        System.out.println("TV(boolean power, int channel, int volume) 생성자 호출)");
        System.out.println("티비가 처음 생성될 때 해야하는 많은 일!!");
        this.power=power;
        this.channel=channel;
        this.volume=volume;
    }
}
