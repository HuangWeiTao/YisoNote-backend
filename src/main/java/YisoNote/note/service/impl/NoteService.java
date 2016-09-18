package YisoNote.note.service.impl;

import YisoNote.common.helper.ModelMapperHelper;
import YisoNote.note.model.Note;
import YisoNote.note.repository.base.BaseNoteRepository;
import YisoNote.note.service.base.INoteService;
import YisoNote.note.viewModel.FolderView;
import YisoNote.note.viewModel.NoteAddModel;
import YisoNote.note.viewModel.NoteEditModel;
import YisoNote.note.viewModel.NoteView;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ken on 2016/9/16.
 */
@ComponentScan
@Service("noteService")
public class NoteService implements INoteService {

    @Autowired
    private BaseNoteRepository noteRepository;

    @Override
    public NoteView AddNote(NoteAddModel model) {

        ModelMapper modelHelper = ModelMapperHelper.GetMapper();
        Note note = modelHelper.map(model,Note.class);

        note = noteRepository.Add(note);
        return modelHelper.map(note,NoteView.class);
    }

    @Override
    public NoteView EditNote(NoteEditModel model) {
        return null;
    }

    @Override
    public void DeleteNote(int noteId) {

    }

    @Override
    public NoteView MoveToFolder(int noteId, int folderId) {
        return null;
    }

    @Override
    public NoteView GetNote(int noteId) {
        return null;
    }

    @Override
    public List<NoteView> GetNoteListInFolder(int folderId) {
        List<Note> noteList = noteRepository.GetNoteListByFolderId(folderId);

        ModelMapper modelMapper = ModelMapperHelper.GetMapper();
        List<NoteView> viewList = noteList.stream().map(model -> modelMapper.map(model, NoteView.class)).collect(Collectors.toList());

        return viewList;
    }
}
