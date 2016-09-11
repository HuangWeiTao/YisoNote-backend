package YisoNote.note.controller;

import YisoNote.note.service.base.IFolderService;
import YisoNote.note.viewModel.FolderAddModel;
import YisoNote.note.viewModel.FolderView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Ken on 2016/9/9.
 */
@RestController
@RequestMapping("/Folder")
public class FolderController {

    @Autowired
    private IFolderService folderService;

    @RequestMapping("list")
    public List<FolderView> GetFolderList(){

        return folderService.GetMyFolders();
    }

    @RequestMapping("add")
    public FolderView AddNewFolder(FolderAddModel model){

        int folderId = folderService.AddNewFolder(model);
        FolderView folderView = folderService.GetFolder(folderId);

        return folderView;
    }
}
