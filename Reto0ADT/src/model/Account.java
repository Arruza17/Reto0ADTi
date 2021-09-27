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
     *
     */
    public Account() {
    }
    //GETTERS AND SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *
     * @return
     */
    public double getCreditLane() {
        return creditLane;
    }

    /**
     *
     * @param creditLane
     */
    public void setCreditLane(double creditLane) {
        this.creditLane = creditLane;
    }

    /**
     *
     * @return
     */
    public double getBeginBalance() {
        return beginBalance;
    }

    /**
     *
     * @param beginBalance
     */
    public void setBeginBalance(double beginBalance) {
        this.beginBalance = beginBalance;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    void setBeginBalanceTimestamp(LocalDateTime toLocalDateTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
