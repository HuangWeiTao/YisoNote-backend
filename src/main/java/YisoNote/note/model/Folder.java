package YisoNote.note.model;

import YisoNote.common.model.base.DescriptiveEntity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Created by Ken on 2016/9/9.
 */

@Entity
@Table(name = "Folder")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Folder extends DescriptiveEntity {

    public static final int RootFolderId = -1;

    private int parentFolder = RootFolderId;

    public int getParentFolder() {
        return parentFolder;
    }

    public void setParentFolder(int parentFolder) {
        this.parentFolder = parentFolder;
    }
}
