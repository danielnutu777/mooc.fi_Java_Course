package partTwo.Ex1;

public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        System.out.println();
        printWithSmileys("Beerbottle");
        System.out.println();
        printWithSmileys("Interface");
        System.out.println();
    }
    private static void printWithSmileys(String characterString){
        String smiley = ":)";

        if(characterString.length() % 2 != 0){
            characterString += " ";
        }

        for (int i = 0; i < (characterString.length() / 2) + 3; i++) {
            System.out.print(smiley);
        }
        System.out.println();



        System.out.print(smiley);
        System.out.print(" ");
        System.out.print(characterString);
        System.out.print(" ");
        System.out.print(smiley);
        System.out.println();

        for (int i = 0; i < (characterString.length() / 2) + 3; i++) {
            System.out.print(smiley);
        }
        System.out.println();
    }

}
