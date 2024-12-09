package Day006;

import java.util.Scanner;

public class TVExam {
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV(true);
        TV tv3 = new TV(true,10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("boolean flag Test.....");
        boolean flag = true;
        TV tv4 = new TV(flag);

    }
}
