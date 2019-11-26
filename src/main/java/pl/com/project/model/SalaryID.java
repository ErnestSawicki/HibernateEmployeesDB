package pl.com.project.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Embeddable
public class SalaryID implements Serializable {

    @ManyToOne
    @JoinColumn(name = "emp_no", nullable = false, insertable = false)
    private Employee employee;

    @Column(name = "from_date")
    private Date fromDate;


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalaryID salaryID = (SalaryID) o;
        return Objects.equals(employee, salaryID.employee) &&
                Objects.equals(fromDate, salaryID.fromDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, fromDate);
    }
}
