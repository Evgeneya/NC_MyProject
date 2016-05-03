package myProject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 1 on 27.04.2016.
 */

@Entity
@Table(name = "employment")
public class EmploymentEntity {

    @Id
    @Column(name="employee_id")
    private long employee_id;


    @Column(name="project_id")
    private long project_id;

    @Column(name="count_hour")
    private int count_hour;

    public EmploymentEntity(){

    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public long getProject_id() {
        return project_id;
    }

    public void setProject_id(long project_id) {
        this.project_id = project_id;
    }

    public int getCount_hour() {
        return count_hour;
    }

    public void setCount_hour(int count_hour) {
        this.count_hour = count_hour;
    }
}
