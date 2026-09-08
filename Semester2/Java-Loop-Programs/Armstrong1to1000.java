public class Armstrong1to1000{
    public static void main(String[] args){
	for(int i = 1; i<=1000;i++){
	    int dup = i;
            int sum = 0;
            while (dup > 0){
                int digit = dup % 10;
                sum = sum + (digit * digit * digit);
                dup = dup/10;
                }
            if (sum == i){
                System.out.println(i);
                }
        }
    }
}
