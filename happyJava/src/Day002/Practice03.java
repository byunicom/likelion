package Day002;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        System.out.println("Multiples of...");

        Integer num = null;
        Scanner scanner = new Scanner(System.in);

        try {
            num = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid number.");
        }

        scanner.close();
        if (num != null) {
            switch (num) {
                case 0:
                    System.out.println(0);
                    break;

                default:
                    System.out.println(
                            String.format("%d, %d, %d ...", num, num * 2, num * 3));
                    break;
            }
        }
    }
}
