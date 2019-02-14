package ink.educat.exceptions;

/**
 * Исключения, возникающие при некорректных операциях с пользователями.
 *
 * @author Илья Михеев
 */
public class UserBadOperationResultException extends Exception {

    public UserBadOperationResultException() {
        super();
    }

    public UserBadOperationResultException(String message) {
        super(message);
    }
}
