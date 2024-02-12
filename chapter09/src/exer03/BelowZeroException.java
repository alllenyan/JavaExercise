package exer03;

public class BelowZeroException extends RuntimeException{

    static final long serialVersionUID = -202402121212L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }
}
