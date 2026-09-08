import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.print("Enter number: ");
	int i = s.nextInt();
	int k = i;
	int newnum = 0;
	while (i>0){
	    int j = i%10;
	    newnum = (newnum*10) + j;
	    i = i/10;
	}
	if (k == newnum){
	    System.out.println("Palindrome.");
	    }
	else{
	    System.out.println("Not a palindrome.");
	    }
    }
}