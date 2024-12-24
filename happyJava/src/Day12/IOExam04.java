package Day12;

import java.io.*;

public class IOExam04 {
    public static void main(String[] args) throws Exception {
        try(
                FileInputStream in = new FileInputStream("happyJava/src/Day12/IOExam01.java");
                FileOutputStream out = new FileOutputStream("copyFile2.txt");
                ){
            byte[] buffer = new byte[1024];
            int c ;
            int count=0;
            while((c=in.read(buffer)) !=-1){
                out.write(buffer,0,c);
                count++;
            }

            System.out.println(count);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
