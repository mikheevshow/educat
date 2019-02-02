package ink.educat.services.ArticleService;

import ink.educat.article.Article;
import ink.educat.article.UserPostEditPermissions;

/**
 * Сервис для работы с публикациями
 */
public interface ArticleService {

    /**
     * Публикует пост в ленте и присваевает ему статус "PUBLISHED"(опубликованный)
     * @param article - пост
     */
    void publishArticle(Article article);

    /**
     * Блокирует публикацию
     * @param article публикация
     */
    void blockTheArticle(Article article);

    /**
     * Посылает пост на модерацию и присваивает посту сатус "ON_MODERATION"
     * @param article - пост
     * @return - сообщение об успшности/неуспешности отправки на модерацию
     */
    public String sendArticleToModeration(Article article);

    /**
     * Посылает пост на модерацию и присваивает посту сатус "ON_MODERATION"(на модерации)
     * @param id - уникальный номер поста в базе данных
     * @return - сообщение об успешности/неуспешности отправки на модерацию
     */
    public String sendArticleToModeration(Long id);

    /**
     * Удаляет пост и присваивает ссылающемуся на него id в базе данных в соответстующей таблице статус "DELETED"(удаленный)
     * @param article - пост
     * @param permissions - права пользователя, который потается удалить пост
     */
    public void deleteArticle(Article article, UserPostEditPermissions permissions);

    /**
     * Удаляет пост и присваивает ссылающемуся на него id в базе данных в соответствующей таблице статус "DELETED"
     * @param id - уникальный номер поста
     * @param permissions - права пользователя, который пытается удалить пост
     */
    public void deleteArticle(long id, UserPostEditPermissions permissions);

    /**
     * Добавляет новый пост в личное пространство Редактора(в данном случае в личное пространство человека,
     * котрый хочет написать пост) и присваевает посту статус "ON_EDIT"(на редактировании)
     */
    public Article addArticle();

}
