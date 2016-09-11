package YisoNote.note.controller;

import YisoNote.note.model.Note;
import YisoNote.note.repository.base.BaseNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Ken on 2016/9/9.
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private BaseNoteRepository noteRepository;

    @RequestMapping("/hello")
    public String helloworld() {

        return "hello world!!!";
    }

    @RequestMapping("/db")
    public String ok(){
        Note note = new Note();
        note.setFolderId(0);
        note.setStorePath("ccccc");
        note.setCreateTime(new Date());
        note.setDelete(false);
        note.setDeleteTime(new Date());
        note.setDescription("ssdfsa");
        note.setName("sdfsfd");
        note.setUpdateTime(new Date());

        noteRepository.Add(note);
        return "ok";
    }
}
