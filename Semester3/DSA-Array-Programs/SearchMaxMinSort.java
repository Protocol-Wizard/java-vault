import java.util.*;
public class SearchMaxMinSort{
    public static void main(String[] args){
	System.out.print("Enter size of array: ");
	Scanner s = new Scanner(System.in);
	int size = s.nextInt();
	int a[] = new int[size];
	for (int i = 0; i < size ;i++){
	    System.out.print("Enter element: ");
	    a[i] = s.nextInt();
	}
	System.out.print("Enter element to find: ");
	boolean found = false;
	int target = s.nextInt();
	for (int i = 0; i < a.length; i++){
        if (a[i] == target){
            System.out.println("Element found at position "+i+" starting from 0.");
			found = true;
        }
    }
	if (found == false){
	    System.out.println("Not found.");
	}
	int max = a[0];
	int min = a[0];
	for (int i = 0;i<a.length;i++){
	    if (a[i]>max){
		    max = a[i];
        }
	    if (a[i]<min){
		    min = a[i];
	    }
	}
	System.out.println("Max element is: "+max);
	System.out.println("Min element is: "+min);
	for (int i = 0; i < a.length - 1; i++){
        for (int j = 0; j < a.length - i - 1; j++){
            if (a[j] > a[j + 1]){
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
	System.out.print("Sorted: "+Arrays.toString(a));
    }
}
