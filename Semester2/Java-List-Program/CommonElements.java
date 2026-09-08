import java.util.Scanner;
public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of List 1: ");
        int size1 = sc.nextInt();
        int[] list1 = new int[size1];
        System.out.print("Enter elements of List 1: ");
        for (int i = 0; i < size1; i++) {
            list1[i] = sc.nextInt();
        }
        System.out.print("Enter size of List 2: ");
        int size2 = sc.nextInt();
        int[] list2 = new int[size2];
        System.out.print("Enter elements of List 2: ");
        for (int i = 0; i < size2; i++) {
            list2[i] = sc.nextInt();
        }
        int[] common = new int[Math.min(size1, size2)];
        int count = 0;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (list1[i] == list2[j]) {
                    // Check if already added to common list
                    boolean alreadyAdded = false;
                    for (int k = 0; k < count; k++) {
                        if (common[k] == list1[i]) {
                            alreadyAdded = true;
                            break;
                        }
                    }
                    if (!alreadyAdded) {
                        common[count] = list1[i];
                        count++;
                    }
                }
            }
        }
        System.out.print("Common Elements   : [ ");
        for (int i = 0; i < count; i++) {
            System.out.print(common[i]);
            if (i < count - 1){
		System.out.print(", ");
		}
        }
        System.out.println(" ]");
        System.out.println("Count: " + count);
    }
}
