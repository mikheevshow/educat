package ink.educat.services.ArticleService;

import ink.educat.article.Article;
import ink.educat.article.ArticleDAO;
import ink.educat.article.AccountArticleEditRole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Сервис для работы с публикациями в системе
 * Подробное описание методов смотрите в {@link ink.educat.services.ArticleService.ArticleService}
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    private static final Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);
    private ArticleDAO articleDAO;

    @Autowired
    public ArticleServiceImpl(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }

    @Override
    public void publishArticle(Article article) {

    }

    @Override
    public void blockTheArticle(Article article) {

    }

    @Override
    public String sendArticleToModeration(Article article) {

        return null;
    }

    @Override
    public String sendArticleToModeration(Long id) {

        return null;
    }

    @Override
    public void deleteArticle(Article article, AccountArticleEditRole permissions) {

    }

    @Override
    public void deleteArticle(long id, AccountArticleEditRole permissions) {

    }

    @Override
    public Article addArticle() {

        return null;
    }
}
