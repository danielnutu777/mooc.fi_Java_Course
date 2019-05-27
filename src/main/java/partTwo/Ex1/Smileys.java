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
/*
Create the support method private static void printWithSmileys(String characterString) for the class Smileys which comes with the assignment
template. The method is to print the given character string surrounded with smileys. Use the character string :) as the smiley.

printWithSmileys("\\:D/");
:):):):):)
:) \:D/ :)
:):):):):)

Note, that the character string must have \\ so we can print the symbol \.
Note! if the length of the character string is an odd number, add an extra space on the right side of the given character string.

printWithSmileys("\\:D/");
printWithSmileys("87.");

:):):):):)
:) \:D/ :)
:):):):):)
:):):):):)
:) 87.  :)
:):):):):)

It's a good idea to first think how many smileys should be printed for a character string of a certain length.
The length of a character string can be found out with the method length which belongs to it.
A loop is helpful for printing the top and bottom smiley rows, the middle row can be handled with a normal print command.
You can check if a length is an odd number with the help of a remainder characterString.length() % 2 == 1.
*/