package myProject.entities;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by 1 on 26.04.2016.
 */
@Entity
@Table(name = "project")
public class ProjectEntity {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="customer_id")
    private Long customer_id;

    @Column(name="plan_id")
    private Long plan_id;

    @Temporal(TemporalType.DATE)
    @Column(name="beg_date")
    private Date beg_date;

    @Temporal(TemporalType.DATE)
    @Column(name="end_date")
    private Date end_date;

    public ProjectEntity(){

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

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Long getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(Long plan_id) {
        this.plan_id = plan_id;
    }

    public Date getBeg_date() {
        return beg_date;
    }

    public void setBeg_date(Date beg_date) {
        this.beg_date = beg_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}
