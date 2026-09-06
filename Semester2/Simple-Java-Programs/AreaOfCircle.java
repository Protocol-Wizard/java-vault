import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input radius of circle: ");
		float r = s.nextFloat();
		float pi = (float)(22/7);
		float area = pi*r*r;
		System.out.println("Area is: "+area+"square units.");
	}
}


