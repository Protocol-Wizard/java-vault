public class ReverseWords {
    public static String reverse(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }
        return result.trim();
    }
    public static void main(String[] args) {
        String s = "I love Java";
        System.out.println("Reversed sentence: " + reverse(s));
    }
}