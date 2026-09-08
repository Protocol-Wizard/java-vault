import java.util.Scanner;
public class DifferentKindOfSum{
    public static void main(String[] args){
	int sum = 0;
	while (true){
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int i = s.nextInt();
	    if (i<0){
		break;
		}
	    else{
		sum += i;
		}
	}
	System.out.println("Sum: "+sum);
    }
}