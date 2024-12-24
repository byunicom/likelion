package P1224.P1;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PhoneBook {
    public static void main(String[] args) {
        try(
            FileWriter fw = new FileWriter("C:/temp/phone.txt");
            PrintWriter pw = new PrintWriter(fw);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String msg;
            for(int i=0;i<3;i++) {
                System.out.print("이름: ");
                msg = br.readLine();

                System.out.print("전화번호: ");
                msg = msg +" "+br.readLine();
                pw.println(msg);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
