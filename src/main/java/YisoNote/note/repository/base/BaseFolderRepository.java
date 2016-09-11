package YisoNote.note.repository.base;

import YisoNote.common.repository.BaseRepository;
import YisoNote.note.model.Folder;

import java.util.List;

/**
 * Created by Ken on 2016/9/11.
 */
public abstract class BaseFolderRepository extends BaseRepository<Folder> {

    public BaseFolderRepository(Class cls) {
        super(cls);
    }

    public abstract void MoveFolder(int fromFolderId, int toFolderId);

    public abstract List<Folder> GetChildrenFolder(int parentFolderId, boolean isDescendant);
}
