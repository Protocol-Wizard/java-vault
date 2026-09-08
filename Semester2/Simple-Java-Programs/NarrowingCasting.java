import java.util.Scanner;
public class NarrowingCasting {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number as a float: ");
		float num1 = s.nextFloat();
		System.out.print("Enter second number as a float: ");
		float num2 = s.nextFloat();
		int result = (int)((num1)/(num2));
		System.out.println("Result from division as an integer: "+result);
	}
}