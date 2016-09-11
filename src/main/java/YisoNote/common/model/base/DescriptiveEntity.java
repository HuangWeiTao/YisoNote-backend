package YisoNote.common.model.base;

/**
 * Created by Ken on 2016/9/9.
 */
@javax.persistence.Entity
public abstract class DescriptiveEntity extends Entity {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
