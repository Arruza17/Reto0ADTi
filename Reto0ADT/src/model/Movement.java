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
     * @return amount the total ammount of money
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Method that set the amount of money used in this transaction
     * @param amount the amount to be set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Is the balance left in the account after the transaction was made
     *
     * @return balance the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Method that sets the balance
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
     * Method that sets the description
     * @param description the descriprtion to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Method that returns the id of the movement
     * @return the id of the movement
     */
    public long getId() {
        return id;
    }

    /**
     * Method that sets the id
     * @param id the id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Method that returns the TimeStamp
     * @return the Time
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Method that sets the TimeStamp 
     * @param timestamp the time
     */
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Method that gets the Account ID
     * @return the Account id
     */
    public long getAccId() {
        return accId;
    }

    /**
     * Method that sets the Account Id
     * @param accId the Account id
     */
    public void setAccId(long accId) {
        this.accId = accId;
    }
    
    

}
