public class VowelSkip{
    public static void main(String[] args){
        String t = "Java Programming";
        for (int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
		continue;
                }
            System.out.print(ch);
            }
    }
}