public class SumOfArrayElements{
    public static void main(String[] args){
        int[] a = {5, 10, 15, 20};
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        System.out.println("Sum = " + sum);
    }
}
