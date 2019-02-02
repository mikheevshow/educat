package ink.educat.article;

import java.util.Collection;

public class ArticleDAOImpl implements ArticleDAO {

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
