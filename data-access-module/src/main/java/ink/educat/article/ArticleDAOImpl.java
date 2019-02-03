package ink.educat.article;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class ArticleDAOImpl implements ArticleDAO {

    private static final Logger logger = LoggerFactory.getLogger(ArticleDAOImpl.class);
    private SessionFactory sessionFactory;

    @Autowired
    public ArticleDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
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
    public void publishPost(Article article) {

    }

    @Override
    public void deletePost(Article article, UserPostEditPermissions permissions) {

    }

    @Override
    public void deletePost(long id, UserPostEditPermissions permissions) {

    }

    @Override
    public Article addPost() {
        return null;
    }

    @Override
    public Article findById(long id) {

        return null;
    }

    @Override
    public Collection<Article> findByIDs(long[] ids) {

        return null;
    }

    @Override
    public void saveOrUpdate(Iterable<Article> posts) {

    }

    @Override
    public void saveOrUpdate(Article article) {

    }
}
