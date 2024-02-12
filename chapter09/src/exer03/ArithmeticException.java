package exer03;

public class ArithmeticException extends RuntimeException{

    static final long serialVersionUID = -202402121211L;

    public ArithmeticException() {
    }

    public ArithmeticException(String message) {
        super(message);
    }
}
