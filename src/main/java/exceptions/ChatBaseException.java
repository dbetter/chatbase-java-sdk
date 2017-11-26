package exceptions;

public class ChatBaseException extends RuntimeException {

    private static final long serialVersionUID = -6902435252122196816L;

    public ChatBaseException(String message) {
        super(message);
    }
}
