import javafx.geometry.Pos;

import java.util.List;

/**
 * Интерфейс для работы с постами
 */
public interface Postable {

    /**
     * Возвращает пост по id в базе данных
     * @param id
     * @return
     */
    public Post getPostById(double id);

    /**
     * Возвращает посты по переданным id в базе данных
     * @param IDs
     * @return
     */
    public List<Post> getPostsByIDs(Long[] IDs);


    public void addPost(Post post);

}
