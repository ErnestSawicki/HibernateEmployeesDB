package pl.com.project.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "Salary")
@Table(name = "salaries")
public class Salary implements Serializable {

    @EmbeddedId
    private SalaryID id;

    @Column(name = "salary")
    private BigDecimal salary;

    @Column(name = "to_date")
    private Date toDate;

    public SalaryID getId() {
        return id;
    }

    public void setId(SalaryID id) {
        this.id = id;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
