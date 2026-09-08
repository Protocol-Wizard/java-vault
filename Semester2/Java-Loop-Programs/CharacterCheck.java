import java.util.Scanner;
public class CharacterCheck{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = s.next().toLowerCase().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            switch (ch){
                case 'a': System.out.println("Vowel.");break;
                case 'e': System.out.println("Vowel.");break;
                case 'i': System.out.println("Vowel.");break;
                case 'o': System.out.println("Vowel.");break;
                case 'u': System.out.println("Vowel.");break;
                default: System.out.println("Consonant.");break;
                }
            }
	else{
            System.out.println("Error: Not a letter.");
            }
    }
}