package YisoNote.note.controller;

import YisoNote.note.service.base.INoteService;
import YisoNote.note.viewModel.NoteAddModel;
import YisoNote.note.viewModel.NoteView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Ken on 2016/9/9.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private INoteService noteService;

    @RequestMapping("/add")
    public NoteView Add(NoteAddModel model) {
        return noteService.AddNote(model);
    }

    @Transactional
    @RequestMapping("list")
    public List<NoteView> List(int folderId){
        return noteService.GetNoteListInFolder(folderId);
    }
}
