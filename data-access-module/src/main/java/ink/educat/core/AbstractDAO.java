package ink.educat.core;

import org.springframework.lang.Nullable;

import java.util.Collection;
import java.util.Optional;

/**
 * Абстрактный интерфейс DAO, все остальные интерфейсы DAO наследуются от него
 *
 * @param <Entity>
 */
public interface AbstractDAO<Entity> {

    /**
     * Ищет сущность по переданному id
     *
     * @param id - id сущности
     * @return - сущность
     * сущность, так и нет
     */
    @Nullable
    Entity findById(final long id);

    /**
     * Ищет сущности по переданным ids, не гарантирует, что количество найденных
     * сущностей будет совпадать с количеством переданных id.
     *
     * @param ids - ids сущностей
     * @return - коллекцию найденных сущностей
     */
    Collection<Entity> findByIDs(final Iterable<Long> ids);

    /**
     * Выполняет батчевое сохранение сущностей, лежащих в коллекции
     *
     * @param entities - коллекция сущностей
     */
    void saveOrUpdate(final Iterable<Entity> entities);

    /**
     * Выполняет сохранение/обновление сущности
     *
     * @param entity - сущность
     */
    void saveOrUpdate(final Entity entity);

    /**
     * Выполняет удаление сущности
     *
     * @param entity - сущность
     */
    void delete(final Entity entity);

}
