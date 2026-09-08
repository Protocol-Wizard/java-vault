public class Sum200{
    public static void main(String[] args){
	int i = 1;
	int sum = 0;
	while (sum <= 200){
	    System.out.print(i + " ");
	    sum += i;
	    i++;
	    if (sum>200){
		break;
		}
	}
    }
}