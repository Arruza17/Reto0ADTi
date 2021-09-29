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
public class Account implements Serializable {

    private long id;
    private String description;
    private double balance;
    private double creditLane;
    private double beginBalance;
    private AccountType type;
    private LocalDateTime beginBalanceTimestamp;

    //CONSTRUCTORS
    /**
     * Empty constructor
     */
    public Account() {
    }
    //GETTERS AND SETTERS

    /**
     * Method that gets the id
     *
     * @return id the id to get
     */
    public long getId() {
        return id;
    }

    /**
     * Method that sets the id
     *
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Method that gets the description
     *
     * @return description the description to get
     */
    public String getDescription() {
        return description;
    }

    /**
     * Method that sets the description
     *
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Method that gets the balance
     *
     * @return balance the balance to get
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Method that sets the balance
     *
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Method that gets the creditLane
     *
     * @return creditLane the creditLane to get
     */
    public double getCreditLane() {
        return creditLane;
    }

    /**
     * Method that sets the creditLane
     *
     * @param creditLane the creditLane to set
     */
    public void setCreditLane(double creditLane) {
        this.creditLane = creditLane;
    }

    /**
     * Method that gets the beginBalance
     *
     * @return beginBalance the beginBalance to get
     */
    public double getBeginBalance() {
        return beginBalance;
    }

    /**
     * Method that sets the beginBalance
     *
     * @param beginBalance the beginBalance to set
     */
    public void setBeginBalance(double beginBalance) {
        this.beginBalance = beginBalance;
    }

    /**
     * Method that gets the type
     *
     * @return type the type to get
     */
    public AccountType getType() {
        return type;
    }

    /**
     * Method that sets the type
     *
     * @param type the type to set
     */
    public void setType(AccountType type) {
        this.type = type;
    }

    /**
     * Method that gets the beginBalanceTimestamp
     *
     * @return beginBalanceTimestamp the beginBalanceTimestamp to get
     */
    public LocalDateTime getBeginBalanceTimestamp() {
        return beginBalanceTimestamp;
    }

    /**
     * Method that sets the beginBalanceTimestamp
     *
     * @param beginBalanceTimestamp the beginBalanceTimestamp to set
     */
    public void setBeginBalanceTimestamp(LocalDateTime beginBalanceTimestamp) {
        this.beginBalanceTimestamp = beginBalanceTimestamp;
    }

}
