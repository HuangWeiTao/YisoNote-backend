package YisoNote.note.repository.base;

import YisoNote.common.repository.BaseRepository;
import YisoNote.common.repository.IReadRepository;
import YisoNote.common.repository.IWriteRepository;
import YisoNote.note.model.Note;

/**
 * Created by Ken on 2016/9/9.
 */
public abstract class BaseNoteRepository extends BaseRepository<Note> {
    public BaseNoteRepository(Class cls) {
        super(cls);
    }
}
