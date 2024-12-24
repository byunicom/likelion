package Day12;

import java.io.*;

public class IOExam01 {
    public static void main(String[] args) {

        //키보드로 부터 한줄씩 입력 받기위해서...
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("입력하세요:");
            String str = br.readLine();
            System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //파일로 부터 한줄씩 입력 받기위해서...
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("install.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        InputStreamReader isr = new InputStreamReader(fis);
//        BufferedReader br2 = BufferedReader(new InputStreamReader());
        System.out.println(isr);
//        BufferedReader br2  = new BufferedReader((new FileReader(fis)));
//        System.out.println(br2);
    }
}
