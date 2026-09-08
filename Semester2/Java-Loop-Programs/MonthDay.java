import java.util.Scanner;
public class MonthDay{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();
        switch (month){
            case 1: System.out.println("31 days");break;
            case 3: System.out.println("31 days");break;
            case 5: System.out.println("31 days");break;
            case 7: System.out.println("31 days");break;
            case 8: System.out.println("31 days");break;
            case 10: System.out.println("31 days");break;
            case 12: System.out.println("31 days");break;
            case 4: System.out.println("30 days");break;
            case 6: System.out.println("30 days");break;
            case 9: System.out.println("30 days");break;
            case 11: System.out.println("30 days");break;
            case 2: System.out.println("28 or 29 days (Leap year dependent)");break;
            default:
                System.out.println("Invalid month! Please enter 1-12.");
            }
        sc.close();
    }
}