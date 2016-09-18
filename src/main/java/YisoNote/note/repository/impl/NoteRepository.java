package YisoNote.note.repository.impl;

import YisoNote.note.model.Note;
import YisoNote.note.repository.base.BaseNoteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Ken on 2016/9/9.
 */

@ComponentScan
@Repository("noteRepository")
public class NoteRepository extends BaseNoteRepository {
    public NoteRepository() {
        super(Note.class);
    }
}
