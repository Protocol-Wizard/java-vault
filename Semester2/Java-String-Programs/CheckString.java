class InvalidStringException extends Exception {
    public InvalidStringException(String msg) {
        super(msg);
    }
}

public class CheckString {
    public static void main(String[] args) {
        String s = "Java123";
        try {
            if (s.matches(".*\\d.*")) {
                throw new InvalidStringException("Contains digits!");
            }
        } catch (InvalidStringException e) {
            System.out.println(e.getMessage());
        }
    }
}