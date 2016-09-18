package YisoNote.note.repository.base;

import YisoNote.common.repository.BaseRepository;
import YisoNote.common.repository.IReadRepository;
import YisoNote.common.repository.IWriteRepository;
import YisoNote.note.model.Note;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Criterion;
import org.hibernate.engine.spi.TypedValue;
import org.hibernate.transform.Transformers;

import java.util.List;
import java.util.Queue;

/**
 * Created by Ken on 2016/9/9.
 */
public abstract class BaseNoteRepository extends BaseRepository<Note> {
    public BaseNoteRepository(Class cls) {
        super(cls);
    }

    public List<Note> GetNoteListByFolderId(int folderId){

        Query query = GetCurrentSession().createSQLQuery("select * from note where folderId = :folderId").addEntity(Note.class);
        query.setParameter("folderId",folderId);

        return query.list();
    }
}
