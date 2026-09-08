public class SecondLargestELement{
    public static void main(String[] args){
        int[] a = {10, 40, 30, 20, 50};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++){
            if (a[i] > largest){
                second = largest;
                largest = a[i];
            } 
            else if (a[i] > second && a[i] != largest){
                second = a[i];
            }
        }
        System.out.println("The second largest element is: " + second);
    }
}
