package pl.com.project.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Embeddable
public class TitleID implements Serializable {

    @ManyToOne
    @JoinColumn(name = "emp_no", nullable = false, insertable = false, updatable = false)
    private Employee employeeNumber;

    @Column(name = "title")
    private String title;

    @Column(name = "from_date")
    private Date fromDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleID titleID = (TitleID) o;
        return Objects.equals(employeeNumber, titleID.employeeNumber) &&
                Objects.equals(title, titleID.title) &&
                Objects.equals(fromDate, titleID.fromDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber, title, fromDate);
    }
}
