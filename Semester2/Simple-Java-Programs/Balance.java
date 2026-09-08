import java.util.Scanner;
public class Balance{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter call duration in minutes: ");
		float cd = s.nextFloat();
		System.out.print("Enter total balance: ");
		float tb = s.nextFloat();
		System.out.print("Enter rate per minute for the call: ");
		float rpm = s.nextFloat();
		float cb = tb - (cd*rpm);
		System.out.println("Current balance is: "+cb);
	}
}
