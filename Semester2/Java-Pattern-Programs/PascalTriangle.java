public class PascalTriangle{
	public static void main (String[] args){
		for(int i=0;i<5;i++){
			int num1 = 1;
			for(int j=0;j<=i;j++){
				System.out.print(num1+" ");
				num1 = num1*(i-j)/(j+1);
				}
			System.out.println();
		}
	}
}