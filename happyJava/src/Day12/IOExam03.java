package Day12;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IOExam03 {
    public static void main(String[] args) {
        //키보드로 부터 5줄 입력 받아서 콜솔에 출력
        String userDirectoryPath = System.getProperty("user.dir");
        try(
        FileWriter fw = new FileWriter(userDirectoryPath+"/test.txt");
        PrintWriter pw = new PrintWriter(fw);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            for (int i = 0; i < 5; i++) {
                String msg = br.readLine();
                System.out.println(msg);
                pw.println(msg);    //text.txt 파일에 msg를 써주세요. (이파일에 실제 쓰여지는 시점?)
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
