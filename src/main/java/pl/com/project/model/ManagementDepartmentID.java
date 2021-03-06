package pl.com.project.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ManagementDepartmentID implements Serializable {

    @ManyToOne
    @JoinColumn(name = "dept_no", updatable = false, insertable = false, nullable = false)
    private Department departmentName;

    @ManyToOne
    @JoinColumn(name = "emp_no", nullable = false, insertable = false, updatable = false)
    private Employee employee;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManagementDepartmentID that = (ManagementDepartmentID) o;
        return Objects.equals(departmentName, that.departmentName) &&
                Objects.equals(employee, that.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, employee);
    }
}
