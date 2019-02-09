package ink.educat.services.article;

import ink.educat.dao.account.Account;
import ink.educat.dao.article.Article;
import ink.educat.dao.article.ArticleDAO;
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
    private ArticleDAO articleDAO;
    private AccountService accountService;

    @Autowired
    public ArticleServiceImpl(ArticleDAO articleDAO, AccountService accountService) {
        this.articleDAO = articleDAO;
        this.accountService = accountService;
    }

    public ArticleServiceImpl() {
    }

    ;

    @Override
    public void publishArticle(@NonNull final Account account, @NonNull final Article article) {

    }

    @Override
    public void blockTheArticle(@NonNull final Account account, Article article) {

    }

    @Override
    public void unblockTheArticle(@NonNull final Account account, @NonNull final Article article) {

    }

    @Override
    public String sendArticleToModeration(@NonNull final Account account, @NonNull final Article article) {
        return null;
    }

    @Override
    public void deleteArticle(Account account, Article article) {

    }

    @Override
    public Article addArticle() {
        return null;
    }

    public ArticleDAO getArticleDAO() {
        return articleDAO;
    }


}
