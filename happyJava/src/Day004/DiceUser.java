package Day004;

public class DiceUser {

    public static void main(String[] args) {
        Dice dice = new Dice();

        dice.face=6;

        dice.roll();

        System.out.println(dice.eye);
    }
}
