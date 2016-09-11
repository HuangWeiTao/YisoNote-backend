package YisoNote.note.controller;

import YisoNote.note.viewModel.NoteAddModel;
import YisoNote.note.viewModel.NoteView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ken on 2016/9/9.
 */
@RestController
@RequestMapping("/note")
public class NoteController {

    @RequestMapping("/add")
    public NoteView Add(NoteAddModel model) {
        return null;
    }
}
