import java.util.Scanner;
public class CalculatorMenu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition (+)\n2. Subtraction (-)\n3. Multiplication (*)\n4. Division (/)");
        System.out.print("Select option (1-4): ");
        int choice = sc.nextInt();
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
	    System.out.print("Enter second number: ");
	    double n2 = sc.nextDouble();
        switch (choice){
            case 1: System.out.println("Result: " + (n1 + n2)); break;
            case 2: System.out.println("Result: " + (n1 - n2)); break;
            case 3: System.out.println("Result: " + (n1 * n2)); break;
            case 4:
                if (n2 != 0){
		    System.out.println("Result: " + (n1 / n2));
		    }
                else{
		    System.out.println("Error: Division by zero");
		    }
                break;
            default: System.out.println("Invalid choice");
            }
    }

}
