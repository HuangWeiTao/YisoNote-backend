package YisoNote.common.model.base;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ken on 2016/9/9.
 */
@javax.persistence.Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private Date createTime = new Date();
    private Date updateTime = new Date();
    private Date deleteTime;
    private boolean isDelete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
