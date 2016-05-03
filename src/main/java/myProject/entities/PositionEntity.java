package myProject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 1 on 26.04.2016.
 */

@Entity
@Table(name="position")
public class PositionEntity {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="min_salary")
    private Integer min_salary;

    @Column(name="max_salary")
    private Integer max_salary;

    public PositionEntity(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(Integer min_salary) {
        this.min_salary = min_salary;
    }

    public Integer getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(Integer max_salary) {
        this.max_salary = max_salary;
    }

    @Override
    public String toString(){
        return "id = " + id + ", name = " + name + ", minSalary = " + min_salary + ", maxSalary = " + max_salary + ";";
    }
}
