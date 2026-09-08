public class PrintingArrays{
    public static void main(String[] args){
        char[] charArray =  {'H', 'e', 'l', 'l', 'o'};
	    int[] a = {1,2,3,4,5};
        for (int i=0;i<charArray.length;i++){
            System.out.print(charArray[i] + " ");
        }
        System.out.println();
        for (int c : a){
            System.out.print(c + " ");
		}
    }
}
