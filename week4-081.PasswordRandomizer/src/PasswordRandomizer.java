import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;
    

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String password = "";
        String symbolList = "abcdefghijklmnopqrstuvwxyz";
        
        while (i < this.length){
            password = password + symbolList.charAt(this.random.nextInt(26));
            i++;
        }
  
        
        return password;
    }
}
