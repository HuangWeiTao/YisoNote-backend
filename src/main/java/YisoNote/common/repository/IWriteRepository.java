package YisoNote.common.repository;

import YisoNote.common.model.base.Entity;

/**
 * Created by Ken on 2016/9/9.
 */
public interface IWriteRepository<T extends Entity> {

    T Add(T item);

    T Update(T item);

    void Delete(int id);
}
