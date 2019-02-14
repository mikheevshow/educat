package ink.educat.exceptions;

/**
 * Выбрасывается, если у пользователя, совершающего операцию не хватает прав
 *
 * @author Илья Михеев
 */
public class NoEnoughPermissionsException extends RuntimeException {

    public NoEnoughPermissionsException() {
        super();
    }

    public NoEnoughPermissionsException(String message) {
        super(message);
    }
}
