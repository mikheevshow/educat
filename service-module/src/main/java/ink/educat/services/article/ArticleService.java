package ink.educat.services.article;

import ink.educat.dao.account.Account;
import ink.educat.dao.article.Article;
import ink.educat.exceptions.BadArticleOperationException;
import org.springframework.lang.NonNull;

import java.util.Collection;

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
    void publishArticle(@NonNull final Account account, @NonNull final Article article);

    /**
     * Блокирует публикацию, [публикация] убирается из ленты и становится недоступна по ссылкам и поиску в приложении.
     * Присваивает публикации статус {@link ink.educat.dao.article.ArticleStatus#BLOCKED}
     *
     * @param account - пользователь
     * @param article - публикация
     * @throws ink.educat.exceptions.BadArticleOperationException
     */
    void blockTheArticle(@NonNull final Account account, @NonNull final Article article);

    /**
     * Разблокирует публикацию, действие этого метода обратное к методу {@link ArticleService#blockTheArticle(Account, Article)}
     * Присваивает публикации статус {@link ink.educat.dao.article.ArticleStatus#PUBLISHED}
     *
     * @param account - пользователь
     * @param article - публикация
     * @throws ink.educat.exceptions.BadArticleOperationException
     */
    void unblockTheArticle(@NonNull final Account account, @NonNull final Article article);

    /**
     * Посылает пост на модерацию и присваивает посту сатус {@link ink.educat.dao.article.ArticleStatus#MODERATION}
     *
     * @param article - пост
     * @return - сообщение об успшности/неуспешности отправки на модерацию
     * @throws ink.educat.exceptions.BadArticleOperationException
     */
    public String sendArticleToModeration(@NonNull final Account account, @NonNull final Article article);

    /**
     * Удаляет пост и присваивает ссылающемуся на него id в базе данных в соответстующей таблице статус
     * {@link ink.educat.dao.article.ArticleStatus#DELETED}
     *
     * @param account - пользователь
     * @param article - публикация
     * @throws ink.educat.exceptions.BadArticleOperationException
     */
    public void deleteArticle(@NonNull final Account account, @NonNull final Article article);

    /**
     * Поиск статей по тегам
     *
     * @param tags - теги
     * @return - коллекцию статей
     */
    public Collection<Article> findArticlesByTags(@NonNull final String...tags);
}
