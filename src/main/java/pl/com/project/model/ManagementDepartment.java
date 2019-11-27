package pl.com.project.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "ManagementDepartment")
@Table(name = "dept_manager")
public class ManagementDepartment implements Serializable {

    @EmbeddedId
    ManagementDepartmentID id;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "toDate")
    private Date toDate;

    public ManagementDepartmentID getId() {
        return id;
    }

    public void setId(ManagementDepartmentID id) {
        this.id = id;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
