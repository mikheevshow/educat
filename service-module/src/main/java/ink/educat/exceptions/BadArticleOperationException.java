package ink.educat.exceptions;

/**
 * Исключения, возникающие при неудачных операциях со статьями
 *
 * @author Илья Михеев
 */
public class BadArticleOperationException extends RuntimeException {

    public BadArticleOperationException() {
        super();
    }

    public BadArticleOperationException(String message) {
        super(message);
    }
}
