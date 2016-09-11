package YisoNote.note.model;

import YisoNote.common.model.base.DescriptiveEntity;

/**
 * Created by Ken on 2016/9/9.
 */
public class Folder extends DescriptiveEntity {

    public static final int RootFolderId = -1;

    private int parentFolder;

    public int getParentFolder() {
        return parentFolder;
    }

    public void setParentFolder(int parentFolder) {
        this.parentFolder = parentFolder;
    }
}
