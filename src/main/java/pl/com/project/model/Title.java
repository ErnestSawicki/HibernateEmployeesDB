package pl.com.project.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity(name = "Title")
@Table(name = "titles")
public class Title {

    @EmbeddedId
    private TitleID id;

    @Column(name = "to_date")
    private Date toDate;

    public TitleID getId() {
        return id;
    }

    public void setId(TitleID id) {
        this.id = id;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
