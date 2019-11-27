package pl.com.project.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "EmployeeDepartment")
@Table(name = "dept_emp")
public class EmployeeDepartment implements Serializable {

    @EmbeddedId
    private EmployeeDepartmentID id;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "to_date")
    private Date toDate;

    public EmployeeDepartmentID getId() {
        return id;
    }

    public void setId(EmployeeDepartmentID id) {
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
