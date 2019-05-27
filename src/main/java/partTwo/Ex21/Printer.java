package partTwo.Ex21;

import java.io.File;
import java.util.Scanner;

public class Printer {
    private File file;
    private Scanner scanner;
    public Printer(String fileName) throws Exception{
        file =  new File(fileName);

    }

    public void printLinesWhichContain(String word) throws Exception{
        scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(word.equals("")){
                System.out.println(line);
            }else{
                if(line.contains(word)){
                    System.out.println(line);
                }
            }

        }
    }
}
