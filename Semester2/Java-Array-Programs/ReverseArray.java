public class ReverseArray{
    public static void main(String[] args){
        int[] a = {10, 20, 30, 40, 50};
        int i = 0, j = a.length - 1;
        while (i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        for (int x : a){
            System.out.print(x + " ");
        }
    }
}
