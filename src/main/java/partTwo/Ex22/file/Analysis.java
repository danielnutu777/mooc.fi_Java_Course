package partTwo.Ex22.file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

    private File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws Exception{
        Scanner scanner = new Scanner(file);
        int counter = 0;
        while(scanner.hasNextLine()){
            scanner.nextLine();
            counter++;
        }
        return counter;

    }

    public int characters() throws Exception{
        Scanner scanner = new Scanner(file);
        int characters = 0;
        while(scanner.hasNextLine()){
            characters += scanner.nextLine().length() + 1;
        }
        return characters;
    }
}
