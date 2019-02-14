package ink.educat.dao.article;

import ink.educat.core.AbstractDAO;
import org.springframework.lang.NonNull;


/**
 * Основная часть получения обновления и сохранения сущностей работает через Hibernate по принципу CRUD,
 * по-этому для его реализации каждый DAO интерфейс наследуется от {@link ink.educat.core.AbstractDAO}.
 * В связи с этим все DAO интерфейсы должны содержать только те методы, которые не подчиняются принципу CRUD
 * и требуют, например, написания отдельных запросов к базе данных.
 */
public interface ArticleDAO extends AbstractDAO<Article> {

}
