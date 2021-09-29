/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Ander Arruza
 */
public class Movement implements Serializable {

    private long id;
    private LocalDateTime timestamp;
    private double amount;
    private double balance;
    private String description;
    private long accId;

    //CONSTRUCTORS
    /**
     * Empty constructor for class movement
     */
    public Movement() {

    }

    /**
     * Amount gives you the information about the money used in this transaction
     *
     * @return amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     *
     *
     * @param amount the amount to be set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Is the balance left in the account after the transaction was made
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @param balance the balance to be set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Is the description of the movement EX: "Paying for studying fees"
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description the descriprtion to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     *
     * @param timestamp
     */
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     *
     * @return
     */
    public long getAccId() {
        return accId;
    }

    /**
     *
     * @param accId
     */
    public void setAccId(long accId) {
        this.accId = accId;
    }
    
    

}
