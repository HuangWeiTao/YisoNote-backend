package YisoNote.common.repository;


import YisoNote.common.model.base.Entity;
import YisoNote.common.view.Pager;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

/**
 * Created by Ken on 2016/9/10.
 */
public abstract class BaseRepository<T extends Entity> implements IReadRepository<T>, IWriteRepository<T> {

    private Class cls;
    public BaseRepository(Class cls){
        this.cls = cls;
    }

    @Autowired
    protected SessionFactory sessionFactory;

    protected Session GetCurrentSession(){
        Session session = sessionFactory.getCurrentSession();

        return session;
    }

    @Override
    public T GetById(int id) {
        return (T) GetCurrentSession().get(cls, id);
    }

    @Override
    public Pager<T> GetList(int page, int pageSize) {
        List<T> list = GetCurrentSession().createCriteria(cls).list().subList((page - 1) * pageSize, page * pageSize - 1);

        Pager<T> listPage = new Pager<T>();
        if (list.size() != 0) {
            listPage.setCurrentItems(list);
            listPage.setCurrentPage(page);
            listPage.setPageSize(pageSize);
        } else {
            listPage.setCurrentItems(list);
            listPage.setCurrentPage(0);
            listPage.setPageSize(pageSize);
        }

        return listPage;
    }

    @Override
    public List<T> GetAll() {

        List<T> list = GetCurrentSession().createCriteria(cls).list();
        return list;
    }

    @Override
    public T Add(T item) {

        int id = (int)GetCurrentSession().save(item);
        return GetById(id);
    }

    @Override
    public T Update(T item) {

        int id = (int)GetCurrentSession().save(item);
        return GetById(id);
    }

    @Override
    public void Delete(int id) {
        T item = (T) GetById(id);
        GetCurrentSession().delete(item);
    }
}
