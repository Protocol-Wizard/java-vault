import java.util.Scanner;
public class RemoveRepeatingStrings{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the string: ");
        String input = s.nextLine();
	String result = "";
	for (int i = 0;i<input.length();i++){
	    String ch = String.valueOf(input.charAt(i));
	    if (!result.contains(ch)){
		result += ch;
		}
	    }
	System.out.println(result);
    }
}