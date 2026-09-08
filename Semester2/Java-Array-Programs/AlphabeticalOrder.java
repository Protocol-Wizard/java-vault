import java.util.Arrays;
import java.util.Scanner;
public class AlphabeticalOrder{
    public static void main(String[] args){
	Scanner c = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int count = c.nextInt();
        Scanner s = new Scanner(System.in);
        String[] str = new String[count];
        System.out.println("Enter the strings one by one:");
        for (int i=0;i<count;i++){
            str[i] = s.nextLine();
        }
        Arrays.sort(str);
        System.out.println("Sorted Array: " + Arrays.toString(str));
    }
}
