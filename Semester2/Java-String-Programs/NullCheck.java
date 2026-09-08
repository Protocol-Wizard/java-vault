public class NullCheck {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(new StringBuilder(s).reverse());
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }
    }
}
