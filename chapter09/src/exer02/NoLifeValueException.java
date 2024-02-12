package exer02;

public class NoLifeValueException extends RuntimeException{
    static final long serialVersionUID = -202402121154L;

    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }
}
