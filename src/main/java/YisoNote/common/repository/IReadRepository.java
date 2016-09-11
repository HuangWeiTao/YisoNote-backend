package YisoNote.common.repository;

import YisoNote.common.model.base.Entity;
import YisoNote.common.view.Pager;

import java.util.List;

/**
 * Created by Ken on 2016/9/9.
 */
public interface IReadRepository<T extends Entity>  {

    T GetById(int id);

    Pager<T> GetList(int page, int pageSize);
}
