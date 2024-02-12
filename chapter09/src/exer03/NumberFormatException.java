package exer03;

public class NumberFormatException extends RuntimeException{
    static final long serialVersionUID = -202402121209L;

    public NumberFormatException() {
    }

    public NumberFormatException(String message) {
        super(message);
    }
}
