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
@Table(name = "Note")

public class Note extends DescriptiveEntity {
    private String storePath;
    private int folderId;

    public String getStorePath() {
        return storePath;
    }

    public void setStorePath(String storePath) {
        this.storePath = storePath;
    }

    public int getFolderId() {
        return folderId;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }
}
