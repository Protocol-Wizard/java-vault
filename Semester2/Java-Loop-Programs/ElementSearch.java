public class ElementSearch{
    public static void main(String[] args){
        int[] array = {10, 25, 45, 17, 88, 33};
        int num = 17;
        int index = -1;
        for (int i = 0;i < array.length;i++){
            if (array[i] == num){
                index = i;
                break;
                }
            }
        if (index != -1){
            System.out.println("Number " + num + " found at index: " + index);
            }
	else {
            System.out.println("Number " + num + " not found in the array.");
            }
    }
}