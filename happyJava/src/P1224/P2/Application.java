package P1224.P2;

import java.io.*;
import java.util.List;

class TextFileManager {
    private String filePath;
    private UserInputHandler userInput;

    public TextFileManager(String filePath) throws Exception {
        FileWriter fw = new FileWriter(filePath);
//        PrintWriter pw = new PrintWriter(fw);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }

    public List<String> readFromFile(){
//        PrintWriter pw = new PrintWriter(fw);
        return null;
    }

    public void writeToFile(List<String> userInput){
//        this.userInput=userInput;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public UserInputHandler getUserInput() {
        return userInput;
    }

    public void setUserInput(UserInputHandler userInput) {
        this.userInput = userInput;
    }
}

class UserInputHandler {
    public List<String> getUserInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String msg=br.readLine();
            System.out.println(msg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}

public class Application {
    public static void main(String[] args) throws Exception {
        String filePath = "C:/temp/texts.txt";
        TextFileManager fileManager = new TextFileManager(filePath);
        UserInputHandler inputHandler = new UserInputHandler();

        try {
            List<String> userInput = inputHandler.getUserInput();
            fileManager.writeToFile(userInput);

            List<String> fileContent = fileManager.readFromFile();
            System.out.println("Content of the file:");
            fileContent.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
