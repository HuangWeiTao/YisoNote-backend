package YisoNote.note.service.base;

import YisoNote.note.viewModel.FolderAddModel;
import YisoNote.note.viewModel.FolderEditModel;
import YisoNote.note.viewModel.FolderView;

import java.util.List;

/**
 * Created by Ken on 2016/9/11.
 */
public interface IFolderService {

    List<FolderView> GetMyFolders();

    FolderView GetFolder(int folderId);

    int AddNewFolder(FolderAddModel model);

    void EditFolder(FolderEditModel model);
}
