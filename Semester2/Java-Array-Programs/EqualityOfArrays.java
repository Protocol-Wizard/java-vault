import java.util.Arrays;
public class EqualityOfArrays{
    public static void main(String[] args){
        char[] arr1 = {'a','b','c','d','e'};
        char[] arr2 = {'a','b','c','d','e'};
        char[] arr3 = {'a','b','c','x','y'};
        if (Arrays.equals(arr1, arr2)){
            System.out.println("arr1 and arr2 are equal");
            }
        else{
            System.out.println("arr1 and arr2 are not equal");
            }
        if (Arrays.equals(arr1, arr3)){
            System.out.println("arr1 and arr3 are equal");
            }
        else{
            System.out.println("arr1 and arr3 are not equal");
            }
    }
}
