package Day006;

class Car{
    String name;
    int speed;

    public void onBoard(){
        System.out.println("승차를 했습니다.");
    }
}

class Bus extends Car{
    public void driveBus(){
        System.out.println("버스가 달립니다.");
    }
}

class Truck extends Car{
    public void shipping(){
        System.out.println("짐을 싣다.");
    }
}

class SeatBus extends Bus{
    public void seating(){
        System.out.println("좌석버스에 탑승했습니다.");
    }
}

public class Exam01 {
    public static void main(String[] args) {
        Car car= new Car();
        car.name = "티코";
        car.speed = 100;
        System.out.println(car.name);
        System.out.println(car.speed);
        car.onBoard();

        Bus bus = new Bus();
        bus.name = "스쿨버스";
        bus.speed=80;
        System.out.println(bus.name);
        System.out.println(bus.speed);
        bus.onBoard();
        bus.driveBus();

        Truck truck = new Truck();
        truck.name = "2톤";
        truck.speed = 80;
        System.out.println(truck.name);
        System.out.println(truck.speed);
        truck.onBoard();
        truck.shipping();

        SeatBus seatBus = new SeatBus();
        seatBus.seating();
        seatBus.driveBus();

        Car sb1 = new SeatBus();    // 할아버지로도 형변환도 가능하다.
        Bus sb2 = new SeatBus();        // 아버지로 형변환 가능하다.

        //SeatBus sb = sb1;           //오류 발생 작은그릇에 큰 그릇을 담을 순 없다. SeatBus 에 Car 를 담을 순 없다.
        SeatBus sb = (SeatBus)sb1;      //형변환으로 Car 를 SeatBus 로 바꿀 순 있다.

        System.out.println("((SeatBus) sb1).seating() 처럼 형변환해서 자식의 메서드 호출할 수 있다.");
        //sb1.setting();        //부모는 자식을 바로 사용할 수 없다.
        ((SeatBus) sb1).seating();  //그럴때 형변환을 통해서 사용할 수는 있다.
    }
}
