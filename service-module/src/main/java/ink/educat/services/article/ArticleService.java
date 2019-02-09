package ink.educat.services.article;

import ink.educat.dao.account.Account;
import ink.educat.dao.article.Article;
import org.springframework.lang.NonNull;

/**
 * Сервис для работы с публикациями
 */
public interface ArticleService {

    /**
     * Публикует пост в ленте и присваевает ему статус "PUBLISHED"(опубликованный)
     *
     * @param article - пост
     * @throws ink.educat.exceptions.BadArticleOperationException
     */
    void publishArticle(@NonNull Account account, Article article);

    /**
     * Блокирует публикацию, [публикация] убирается из ленты и становится недоступна по ссылкам и поиску в приложении.
     * Присваивает публикации статус {@link ink.educat.dao.article.ArticleStatus#BLOCKED}
     *
     * @param account - пользователь
     * @param article - публикация
     * @throws ink.educat.exceptions.BadArticleOperationException
     */
    void blockTheArticle(@NonNull Account account, @NonNull Article article);

    /**
     * Разблокирует публикацию, действие этого метода обратное к методу {@link ArticleService#blockTheArticle(Account, Article)}
     * Присваивает публикации статус {@link ink.educat.dao.article.ArticleStatus#PUBLISHED}
     *
     * @param account - пользователь
     * @param article - публикация
     * @throws ink.educat.exceptions.BadArticleOperationException
     */
    void unblockTheArticle(@NonNull Account account, @NonNull Article article);

    /**
     * Посылает пост на модерацию и присваивает посту сатус {@link ink.educat.dao.article.ArticleStatus#MODERATION}
     *
     * @param article - пост
     * @return - сообщение об успшности/неуспешности отправки на модерацию
     * @throws ink.educat.exceptions.BadArticleOperationException
     */
    public String sendArticleToModeration(@NonNull Account account, @NonNull Article article);

    /**
     * Удаляет пост и присваивает ссылающемуся на него id в базе данных в соответстующей таблице статус
     * {@link ink.educat.dao.article.ArticleStatus#DELETED}
     *
     * @param account - пользователь
     * @param article - публикация
     * @throws ink.educat.exceptions.BadArticleOperationException
     */
    public void deleteArticle(@NonNull Account account, @NonNull Article article);


    /**
     * Добавляет новый пост в личное пространство Редактора(в данном случае в личное пространство человека,
     * котрый хочет написать пост) и присваевает посту статус "ON_EDIT"(на редактировании)
     */
    public Article addArticle();

}
