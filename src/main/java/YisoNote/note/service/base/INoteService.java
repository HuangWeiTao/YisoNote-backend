package YisoNote.note.service.base;

import YisoNote.note.viewModel.*;

import java.util.List;

/**
 * Created by Ken on 2016/9/11.
 */
public interface INoteService {

    NoteView AddNote(NoteAddModel model);

    NoteView EditNote(NoteEditModel model);

    void DeleteNote(int noteId);

    NoteView MoveToFolder(int noteId, int folderId);

    NoteView GetNote(int noteId);

    List<NoteView> GetNoteListInFolder(int folderId);
}
