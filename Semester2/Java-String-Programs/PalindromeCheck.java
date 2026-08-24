public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "";
        try {
            if (s.isEmpty()) throw new Exception("Empty string");
            String rev = new StringBuilder(s).reverse().toString();
            System.out.println(s.equals(rev));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
