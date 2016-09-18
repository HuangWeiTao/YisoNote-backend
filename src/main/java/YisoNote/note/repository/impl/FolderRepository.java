package YisoNote.note.repository.impl;

import YisoNote.note.model.Folder;
import YisoNote.note.repository.base.BaseFolderRepository;
import org.hibernate.annotations.Proxy;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Ken on 2016/9/11.
 */

@ComponentScan
@Repository("folderRepository")
@EnableAsync(proxyTargetClass = true)
@EnableCaching
public class FolderRepository extends BaseFolderRepository {
    public FolderRepository() {
        super(Folder.class);
    }

    @Override
    public void MoveFolder(int fromFolderId, int toFolderId) {    }

    @Override
    public List<Folder> GetChildrenFolder(int parentFolderId, boolean isDescendant) {
        //有ug,暂时并没有取得子孙节点
        return GetAll();
    }
}
