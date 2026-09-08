import java.util.Scanner;
public class ArmstrongMtoN{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter starting range: ");
        int m = s.nextInt();
        System.out.print("Enter ending range: ");
        int n = s.nextInt();
        int totalnums = 0;
        for (int i = m;i <= n;i++){
            int num = i;
            int sum = 0;
            int digits = String.valueOf(i).length();
            while (num > 0){
                int d = num % 10;
                int power = 1;
                for (int p = 0; p < digits; p++){
                    power = power * d;
                    }
                sum = sum + power;
                num = num/10;
                }
            if (sum == i){
                System.out.println(i + " is an Armstrong number.");
                totalnums = totalnums + 1;
                }
        }
        System.out.println("Total count: " + totalnums);
    }
}