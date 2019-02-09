package ink.educat.core;

import java.util.Collection;

/**
 * Абстрактный интерфейс DAO, все остальные интерфейсы DAO наследуются от него
 *
 * @param <Entity>
 */
public interface AbstractDAO<Entity> {

    Entity findById(long id);

    Collection<Entity> findByIDs(long[] ids);

    void saveOrUpdate(Iterable<Entity> entities);

    void saveOrUpdate(Entity entity);

}
