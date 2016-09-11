package YisoNote.note.repository.impl;

import YisoNote.note.model.Note;
import YisoNote.note.repository.base.BaseNoteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ken on 2016/9/9.
 */


@ComponentScan
@Repository("noteRepository")
@javax.transaction.Transactional
public class NoteRepository extends BaseNoteRepository {
    public NoteRepository() {
        super(Note.class);
    }
}
