import java.util.Arrays;
public class CopyArray{
    public static void main(String[] args){
        char[] original = {'a','b','c','d','e'};
        char[] copy = Arrays.copyOf(original, original.length);
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Created Copy: " + Arrays.toString(copy));
    }
}
