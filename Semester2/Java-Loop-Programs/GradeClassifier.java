import java.util.Scanner;
public class GradeClassifier{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade (A, B, C, D, F): ");
        char grade = sc.next().toUpperCase().charAt(0);
        switch (grade){
            case 'A':System.out.println("Excellent.");break;
            case 'B':System.out.println("Very Good.");break;
            case 'C':System.out.println("Good.");break;
            case 'D': System.out.println("Satisfactory."); break;
            case 'F':System.out.println("Fail.");break;
            default: System.out.println("Invalid Grade Entered.");
        }
    }
}