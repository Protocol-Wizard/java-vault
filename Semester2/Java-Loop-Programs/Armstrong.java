import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
	  Scanner s = new Scanner(System.in);
    System.out.print("Enter number: ");
	  int num = s.nextInt();
    int dup = num;
    int sum = 0;
    while (dup > 0){
        int digit = dup % 10;
        sum = sum + (digit * digit * digit);
        dup = dup/10;
        }
        if (sum == num){
            System.out.println(num + " is an Armstrong number.");
        }
        else{
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
