import java.util.Scanner;
public class LongestNonRepeatingSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!result.contains(String.valueOf(c))) {
                result += c;
            }
        }
        System.out.println("Input String      : " + input);
        System.out.println("New String        : " + result);
        System.out.println("Length            : " + result.length());
    }
}