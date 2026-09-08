import java.util.Scanner;
public class CountingStuff{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine().toLowerCase();
        int vowels = 0;
	int consonants = 0;
	int digits = 0;
	int i = 0;
        while (i < str.length()){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                    } 
		else{
                    consonants++;
                    }
                } 
	    else if (ch >= '0' && ch <= '9'){
                digits++;
                }
            i++;
            }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
    }
}
