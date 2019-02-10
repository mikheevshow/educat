package ink.educat.dao.article;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
public class ArticleDAOImpl implements ArticleDAO {

    private static final Logger logger = LoggerFactory.getLogger(ArticleDAOImpl.class);
    private SessionFactory sessionFactory;

    @Autowired
    public ArticleDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public ArticleDAOImpl() {
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
    public void deletePost(Article article, AccountArticleEditRole permissions) {

    }

    @Override
    public void deletePost(long id, AccountArticleEditRole permissions) {

    }

    @Override
    public Article addPost() {
        return null;
    }

    @Override
    public Article findById(long id) {
        final Session session = sessionFactory.openSession();
        final Article article = session.get(Article.class, id);
        session.close();

        return article;
    }

    @Override
    public Collection<Article> findByIDs(long[] ids) {
        final Collection<Article> articles = new ArrayList<>();
        final Session session = sessionFactory.openSession();
        for (long id : ids) {
            final Article article = session.get(Article.class, id);
            if (article != null) {
                articles.add(article);
            }
        }
        session.close();

        return articles;
    }

    @Override
    public void saveOrUpdate(Iterable<Article> posts) {

    }

    @Override
    public void saveOrUpdate(Article article) {

    }
}
