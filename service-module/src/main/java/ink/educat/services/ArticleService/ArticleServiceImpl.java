package ink.educat.services.ArticleService;

import ink.educat.post.Article;
import ink.educat.post.ArticleDAO;
import ink.educat.post.UserPostEditPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Сервис для работы с публикациями в системе
 * Подробное описание методов смотрите в {@link ink.educat.services.ArticleService.ArticleService}
 */
@Service
public class ArticleServiceImpl implements ArticleService {

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
    public void deleteArticle(Article article, UserPostEditPermissions permissions) {

    }

    @Override
    public void deleteArticle(long id, UserPostEditPermissions permissions) {

    }

    @Override
    public Article addArticle() {

        return null;
    }
}
