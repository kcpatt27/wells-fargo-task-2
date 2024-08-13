package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchase_date;
    
    @Column(nullable = false)
    private float purchase_price;

    @Column(nullable = false)
    private int quantity;
    
    protected Advisor() {

    }

    public Advisor(String firstName, String lastName, String category, Date purchase_date, float purchase_price, int quantity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.category = category;
        this.purchase_date = purchase_date;
        this.purchase_price = purchase_price;
        this.quantity = quantity;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPurchasePrice() {
        return purchase_price;
    }

    public void setPurchasePrice(float purchase_price) {
        this.purchase_price = purchase_price;
    }

    public Date getPurchaseDate() {
        return purchase_date;
    }

    public void setPurchaseDate(Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
