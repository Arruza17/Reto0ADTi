/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Ander Arruza
 */
public class Customer {
    private Integer id;
    private String description;
    private double balance;
    private double creditLane;
    private double beginBalance;
    private Date beginBalanceTimestamp;
    private String type;
    //CONSTRUCTORS

    public Customer() {
    }
    //GETTERS AND SETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCreditLane() {
        return creditLane;
    }

    public void setCreditLane(double creditLane) {
        this.creditLane = creditLane;
    }

    public double getBeginBalance() {
        return beginBalance;
    }

    public void setBeginBalance(double beginBalance) {
        this.beginBalance = beginBalance;
    }

    public Date getBeginBalanceTimestamp() {
        return beginBalanceTimestamp;
    }

    public void setBeginBalanceTimestamp(Date beginBalanceTimestamp) {
        this.beginBalanceTimestamp = beginBalanceTimestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}