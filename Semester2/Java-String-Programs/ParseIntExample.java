public class ParseIntExample {
    public static void main(String[] args) {
        String s = "123a";
        try {
            int num = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
