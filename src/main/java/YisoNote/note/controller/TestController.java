package YisoNote.note.controller;

import YisoNote.note.model.Folder;
import YisoNote.note.model.Note;
import YisoNote.note.repository.base.BaseFolderRepository;
import YisoNote.note.repository.base.BaseNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ken on 2016/9/9.
 */

@RestController
@RequestMapping("/test")

public class TestController {

    @Autowired
    private BaseNoteRepository noteRepository;

    @Autowired
    private BaseFolderRepository folderRepository;

    @RequestMapping("/hello")
    public String helloworld() {

        return "hello world!!!";
    }

    @RequestMapping("/db")
    @Transactional
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

    @RequestMapping("/addFolders")
    @Transactional
    public List<Integer> addFolders(){

        List<Integer> ids = new ArrayList<>();

        for(int i=0;i<5;i++) {
            Folder folder = new Folder();
            folder.setName("笔记目录" + (i + 1));
            folder.setDescription("笔记描述" + (i + 1));

            Folder save = folderRepository.Add(folder);
            ids.add(save.getId());

           for(int j=0;j<7;j++){
               Note note = new Note();
               note.setFolderId(folder.getId());
               note.setDescription("笔记"+(i+1)+": "+(j+1));
               note.setName("笔记"+(i+1)+": "+(j+1));
               noteRepository.Add(note);

            }
       }

        return ids;
    }
}
