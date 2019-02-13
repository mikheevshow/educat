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
    public void updateArticleStatus(Article article, ArticleStatus status) {

    }

    @Override
    public void updateArticleContent(Article article, String content) {

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
    public void deletePost(Article article, AccountArticleEditRole permissions) {

    }

    @Override
    public void deletePost(long id, AccountArticleEditRole permissions) {

    }

    @Override
    public Article addPost() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Article findById(long id) {
        final Session session = sessionFactory.openSession();
        final Article article = session.get(Article.class, id);
        session.close();

        return article;
    }

    /**
     * {@inheritDoc}
     */
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

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveOrUpdate(Iterable<Article> posts) {
        final Session session = sessionFactory.openSession();
        while (posts.iterator().hasNext()) {
            session.saveOrUpdate(posts.iterator().next());
        }
        session.close();
    }

    @Override
    public void saveOrUpdate(Article article) {
        final Session session = sessionFactory.openSession();
        session.saveOrUpdate(article);
        session.close();
    }
}
