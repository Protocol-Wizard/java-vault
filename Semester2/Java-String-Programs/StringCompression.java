public class StringCompression {
    public static String compress(String s) {
        String result = "";
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)) {
                count++;
            } else {
                result += s.charAt(i) + "" + count;
                count = 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "aaabbcc";
        System.out.println("Compressed String: " + compress(s));
    }
}
