import java.util.Scanner;
public class UserInputArray{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Type the size of the array: ");
		int size = s.nextInt();
		int a[] = new int[size];
		System.out.println("Type the integer elements in separate lines.");
		for (int j = 0;j<size;j++){
			a[j] = s.nextInt();
		}
		for (int i = 0;i<a.length;i++){
			System.out.print(a[i] + " ");
		}
	}
}
