import java.util.List;

/**
 * Интерфейс для работы с постами
 */
public interface Postable {

    /**
     * Возвращает пост по id в базе данных
     * @param id - уникальный номер поста
     * @return - возвращает пост
     */
    public Post getPostById(double id);

    /**
     * Возвращает посты по переданным id в базе данных
     * @param IDs - id постов
     * @return - совокупность возвращаемых постов
     */
    public List<Post> getPostsByIDs(Long[] IDs);

    /**
     * Посылает пост на модерацию и присваивает посту сатус "ON_MODERATION"
     * @param post - пост
     * @return - сообщение об успшности/неуспешности отправки на модерацию
     */
    public String sendPostToModeration(Post post);

    /**
     * Посылает пост на модерацию и присваивает посту сатус "ON_MODERATION"(на модерации)
     * @param id - уникальный номер поста в базе данных
     * @return - сообщение об успешности/неуспешности отправки на модерацию
     */
    public String sendPostToModeration(Long id);

    /**
     * Публикует пост в ленте и присваевает ему статус "PUBLISHED"(опубликованный)
     * @param post - пост
     */
    public void publishPost(Post post);

    /**
     * Удаляет пост и присваивает ссылающемуся на него id в базе данных в соответстующей таблице статус "DELETED"(удаленный)
     * @param post - пост
     * @param permissions - права пользователя, который потается удалить пост
     */
     public void deletePost(Post post, UserPostEditPermissions permissions);

    /**
     * Удаляет пост и присваивает ссылающемуся на него id в базе данных в соответствующей таблице статус "DELETED"
     * @param id - уникальный номер поста
     * @param permissions - права пользователя, который пытается удалить пост
     */
     public void deletePost(long id, UserPostEditPermissions permissions);

     /**
     * Добавляет новый пост в личное пространство Редактора(в данном случае в личное пространство человека,
     * котрый хочет написать пост) и присваевает посту статус "ON_EDIT"(на редактировании)
     */
    public Post addPost();

}
