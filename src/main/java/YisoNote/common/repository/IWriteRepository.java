package YisoNote.common.repository;

import YisoNote.common.model.base.Entity;

/**
 * Created by Ken on 2016/9/9.
 */
public interface IWriteRepository<T extends Entity> {

    void Add(T item);

    void Update(T item);

    void Delete(int id);
}
