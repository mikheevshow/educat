package ink.educat.dao.article;

import ink.educat.core.AbstractDAO;
import org.springframework.lang.NonNull;


/**
 * Основная часть получения обновления и сохранения сущностей работает через Hibernate по принципу CRUD,
 * по-этому для его реализации каждый DAO интерфейс наследуется от {@link ink.educat.core.AbstractDAO}.
 * В связи с этим все DAO интерфейсы должны содержать только те методы, которые не подчиняются принципу CRUD
 * и требуют, например, написания отдельных запросов к базе данных.
 */
public interface ArticleDAO extends AbstractDAO<Article> {


    void updateArticleStatus(@NonNull Article article, @NonNull ArticleStatus status);

    void updateArticleContent(@NonNull Article article, @NonNull String content);

    /**
     * Посылает пост на модерацию и присваивает посту сатус "ON_MODERATION"
     *
     * @param article - пост
     * @return - сообщение об успшности/неуспешности отправки на модерацию
     */
    public String sendArticleToModeration(Article article);

    /**
     * Посылает пост на модерацию и присваивает посту сатус "ON_MODERATION"(на модерации)
     *
     * @param id - уникальный номер поста в базе данных
     * @return - сообщение об успешности/неуспешности отправки на модерацию
     */
    public String sendArticleToModeration(Long id);


    /**
     * Удаляет пост и присваивает ссылающемуся на него id в базе данных в соответстующей таблице статус "DELETED"(удаленный)
     *
     * @param article     - пост
     * @param permissions - права пользователя, который потается удалить пост
     */
    public void deletePost(Article article, AccountArticleEditRole permissions);

    /**
     * Удаляет пост и присваивает ссылающемуся на него id в базе данных в соответствующей таблице статус "DELETED"
     *
     * @param id          - уникальный номер поста
     * @param permissions - права пользователя, который пытается удалить пост
     */
    public void deletePost(long id, AccountArticleEditRole permissions);

    /**
     * Добавляет новый пост в личное пространство Редактора(в данном случае в личное пространство человека,
     * котрый хочет написать пост) и присваевает посту статус "ON_EDIT"(на редактировании)
     */
    public Article addPost();

}
