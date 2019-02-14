package ink.educat.services.article;

import ink.educat.dao.account.Account;
import ink.educat.dao.article.Article;
import ink.educat.dao.article.ArticleDAO;
import ink.educat.dao.article.ArticleStatus;
import ink.educat.services.account.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

/**
 * Сервис для работы с публикациями в системе
 * Подробное описание методов смотрите в {@link ink.educat.services.article.ArticleService}
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    private static final Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);
    private final ArticleDAO articleDAO;
    private final AccountService accountService;

    @Autowired
    public ArticleServiceImpl(ArticleDAO articleDAO, AccountService accountService) {
        this.articleDAO = articleDAO;
        this.accountService = accountService;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void publishArticle(@NonNull final Account account, @NonNull final Article article) {

        article.setArticleStatus(ArticleStatus.PUBLISHED);
        articleDAO.saveOrUpdate(article);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void blockTheArticle(@NonNull final Account account, @NonNull final Article article) {

        article.setArticleStatus(ArticleStatus.BLOCKED);
        articleDAO.saveOrUpdate(article);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unblockTheArticle(@NonNull final Account account, @NonNull final Article article) {

        article.setArticleStatus(ArticleStatus.PUBLISHED);
        articleDAO.saveOrUpdate(article);
    }

    @Override
    public String sendArticleToModeration(@NonNull final Account account, @NonNull final Article article) {

        article.setArticleStatus(ArticleStatus.MODERATION);
        articleDAO.saveOrUpdate(article);
    }

    @Override
    public void deleteArticle(@NonNull final Account account, @NonNull final Article article) {

        articleDAO
    }

    @Override
    public Article addArticle() {
        return null;
    }
}
