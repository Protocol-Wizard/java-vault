import java.util.Scanner;
public class Name {
	public static void main(String[] args) {
		System.out.print("Hi. What's your name? : ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.println("Hello "+name+".");
		}
}
