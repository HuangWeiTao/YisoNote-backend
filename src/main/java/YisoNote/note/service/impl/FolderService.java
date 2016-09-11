package YisoNote.note.service.impl;

import YisoNote.common.helper.ModelMapperHelper;
import YisoNote.note.model.Folder;
import YisoNote.note.repository.base.BaseFolderRepository;
import YisoNote.note.service.base.IFolderService;
import YisoNote.note.viewModel.FolderAddModel;
import YisoNote.note.viewModel.FolderEditModel;
import YisoNote.note.viewModel.FolderView;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ken on 2016/9/11.
 */

@ComponentScan
@Service("folderService")
public class FolderService implements IFolderService {

    @Autowired
    private BaseFolderRepository folderRepository;

    @Override
    public List<FolderView> GetMyFolders() {
        List<Folder> folderList =  folderRepository.GetChildrenFolder(Folder.RootFolderId,true);

        ModelMapper modelMapper = ModelMapperHelper.GetMapper();
        List<FolderView> viewList =  folderList.stream().map(model->modelMapper.map(model,FolderView.class)).collect(Collectors.toList());

        return viewList;
    }

    @Override
    public int AddNewFolder(FolderAddModel model) {
        return 0;
    }

    @Override
    public void EditFolder(FolderEditModel model) {

    }

    @Override
    public FolderView GetFolder(int folderId) {
        return null;
    }
}
