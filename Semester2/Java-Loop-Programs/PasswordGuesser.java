import java.util.Scanner;
public class PasswordGuesser{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "a1b2c3d4";
        String userInput;
        do{
            System.out.print("Enter what you think the password is: ");
            userInput = scanner.nextLine();
            if (!userInput.equals(correctPassword)){
                System.out.println("Incorrect password. Try again.");
                }
        } while (!userInput.equals(correctPassword));
        System.out.println("Correct password.");
        scanner.close();
    }
}
