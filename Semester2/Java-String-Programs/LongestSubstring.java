public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            for (int j = i; j < s.length(); j++) {
                if (temp.contains(s.charAt(j) + "")) break;
                temp += s.charAt(j);
                max = Math.max(max, temp.length());
            }
        }
        return max;
    }
    public static void main(String[] args){
	String s1 = "Got a man with a plan right here.";
	int result = lengthOfLongestSubstring(s1);
        System.out.println("Length of longest substring: " + result);
    }
}