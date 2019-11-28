package pl.com.project;

import pl.com.project.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("pl.com.project");
        EntityManager em = emf.createEntityManager();

        @SuppressWarnings("unchecked")
        List<Employee> employeeWithHighestSalary = em.createQuery("SELECT e FROM Employee e JOIN e.salaries s ORDER BY s.salary desc").setMaxResults(1).getResultList();
        System.out.println(employeeWithHighestSalary.size());
        System.out.println(employeeWithHighestSalary);

    }

}
