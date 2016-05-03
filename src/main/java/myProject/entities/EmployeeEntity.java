package myProject.entities;

import javax.persistence.*;

/**
 * Created by 1 on 26.04.2016.
 */

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="position_id")
    private Long position_id;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private String phone;

    @Column(name="age")
    private int age;

    @Column(name="status")
    private String status;

    @Column(name="experience")
    private int experience;

    @Column(name="salary")
    private long salary;

    public EmployeeEntity(){

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

    public Long getPosition_id() {
        return position_id;
    }

    public void setPosition_id(Long position_id) {
        this.position_id = position_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "id = " + id +", name = " + name + ", position_id = " + position_id + ", email = " + email +
                ", phone = " + phone + ", age = " + age + ", status = " + status +
                ", experience = " + experience + ", salary = " + salary + ";";
    }
}
