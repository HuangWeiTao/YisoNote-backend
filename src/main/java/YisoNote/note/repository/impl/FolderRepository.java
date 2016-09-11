package YisoNote.note.repository.impl;

import YisoNote.note.model.Folder;
import YisoNote.note.repository.base.BaseFolderRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Ken on 2016/9/11.
 */

@ComponentScan
@Repository("folderRepository")
@Transactional
public class FolderRepository extends BaseFolderRepository {
    public FolderRepository() {
        super(Folder.class);
    }

    @Override
    public void MoveFolder(int fromFolderId, int toFolderId) {

    }

    @Override
    public List<Folder> GetChildrenFolder(int parentFolderId, boolean isDescendant) {
        return null;
    }
}
