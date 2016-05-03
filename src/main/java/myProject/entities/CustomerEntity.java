package myProject.entities;

import javax.persistence.*;

/**
 * Created by 1 on 26.04.2016.
 */
@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="phone")
    private String phone;

    public CustomerEntity(){

    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
