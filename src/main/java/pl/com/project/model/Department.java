package pl.com.project.model;


import javax.persistence.*;
import java.io.Serializable;

@Table(name = "departments")
@Entity(name = "Department")
public class Department implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "dept_no", unique = true, updatable = false, nullable = false)
    private String departmentNumber;

    @Column(name = "dept_name", nullable = false)
    private String departmentName;

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
