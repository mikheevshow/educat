package ink.educat.dao.article;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class ArticleDAOImpl implements ArticleDAO {

    private static final Logger logger = LoggerFactory.getLogger(ArticleDAOImpl.class);
    private SessionFactory sessionFactory;

    @Autowired
    public ArticleDAOImpl(SessionFactory sessionFactory) {

        this.sessionFactory = sessionFactory;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Nullable
    public Article findById(final long id) {

        final Session session = sessionFactory.openSession();
        final Article article = session.find(Article.class, id);
        session.close();

        return article;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<Article> findByIDs(@NonNull final Iterable<Long> ids) {

        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveOrUpdate(@NonNull final Iterable<Article> posts) {

        final Session session = sessionFactory.openSession();
        while (posts.iterator().hasNext()) {
            session.saveOrUpdate(posts.iterator().next());
        }
        session.close();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveOrUpdate(@NonNull final Article article) {

        final Session session = sessionFactory.openSession();
        session.saveOrUpdate(article);
        session.close();
    }

    @Override
    public void delete(Article article) {

    }
}
