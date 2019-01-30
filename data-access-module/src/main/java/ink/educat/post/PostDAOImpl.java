package ink.educat.post;

import java.util.Collection;

public class PostDAOImpl implements PostDAO {

    @Override
    public String sendPostToModeration(Post post) {
        return null;
    }

    @Override
    public String sendPostToModeration(Long id) {
        return null;
    }

    @Override
    public void publishPost(Post post) {

    }

    @Override
    public void deletePost(Post post, UserPostEditPermissions permissions) {

    }

    @Override
    public void deletePost(long id, UserPostEditPermissions permissions) {

    }

    @Override
    public Post addPost() {
        return null;
    }

    @Override
    public Post findById(long id) {
        return null;
    }

    @Override
    public Collection<Post> findByIDs(long[] ids) {
        return null;
    }

    @Override
    public void saveOrUpdate(Iterable<Post> posts) {

    }

    @Override
    public void saveOrUpdate(Post post) {

    }
}
