package YisoNote.note.controller;

import YisoNote.note.service.base.IFolderService;
import YisoNote.note.viewModel.FolderAddModel;
import YisoNote.note.viewModel.FolderView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.*;

/**
 * Created by Ken on 2016/9/9.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/folder")
public class FolderController {

    @Autowired
    private IFolderService folderService;

    @RequestMapping("/list")
    @Transactional//只是读取操作，为什么不能去掉Transactional
    public List<FolderView> GetFolderList() {

        List<FolderView> folderViews = folderService.GetMyFolders();

        if (folderViews == null) {
            folderViews = new ArrayList<>();
        }
        return folderViews;
    }

    @RequestMapping("/add")
    public FolderView AddNewFolder(FolderAddModel model){

        int folderId = folderService.AddNewFolder(model);
        FolderView folderView = folderService.GetFolder(folderId);

        return folderView;
    }
}
