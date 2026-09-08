import java.util.Scanner;
public class BreakMenu{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
	int ch;
        do{
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Print Koenigsegg Agera R");
            System.out.println("2. Print Lamborghini Sesto Elemento");
            System.out.println("3. Print Ford Mustang Shelby GT500");
	    System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = scanner.nextInt();
            switch (ch){
                case 1: System.out.println("Koenigsegg Agera R.");break;
                case 2: System.out.println("Lamborghini Sesto Elemento.");break;
                case 3: System.out.println("Ford Mustang Shelby GT500.");break;
		case 4: System.out.println("Exiting the program.");break;
                default: System.out.println("Invalid choice! Please try again.");
                }
        } while (ch != 4);
    }
}