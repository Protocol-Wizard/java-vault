import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
	System.out.print("Enter the number of terms: ");
	int i = s.nextInt();
	int a = 0;
	int b = 1;
	if (i == 1){
	    System.out.println(a);
	    }
	else{
	    if (i == 2){
	        System.out.println(a);
	        System.out.println(b);
		}
	    else{
	        while (i > 0){
	       	    System.out.print(a + " ");
		    int c = a+b;
		    a = b;
		    b = c;
		    i--;
	   	    }
	    }
	}
    }
}