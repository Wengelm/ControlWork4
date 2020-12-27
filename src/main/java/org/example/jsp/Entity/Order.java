package org.example.jsp.Entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name_order")
    private String nameOrder;
    @Column(name = "date_order")
    private String dateOrder;
    @Column(name = "name_customer")
    private String nameCustomer;
    @Column(name = "status")
    private String status;
    @Column(name = "cost")
    private String cost;
    @Column (name = "mobile")
    private String mobile;

    public Order() {
    }

    public Order(String nameOrder, String dateOrder, String nameCustomer, String status, String cost, String mobile) {
        this.nameOrder = nameOrder;
        this.dateOrder = dateOrder;
        this.nameCustomer = nameCustomer;
        this.status = status;
        this.cost = cost;
        this.mobile = mobile;
    }

    public Order(Long id, String nameOrder, String dateOrder, String nameCustomer, String status, String cost, String mobile) {
        this.id = id;
        this.nameOrder = nameOrder;
        this.dateOrder = dateOrder;
        this.nameCustomer = nameCustomer;
        this.status = status;
        this.cost = cost;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
