import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private final String CHARS = "abcdefghijklmnopqrstuvwxyz";


    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String s = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            s += CHARS.charAt(random.nextInt(CHARS.length()));
        }
        return s;
    }
}
