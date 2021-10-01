/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Yeray
 */
public class CustomerAccount implements Serializable {

    private long idUser;
    private long idAcc;

    /**
     * Constructor of the Customer Account
     */
    public CustomerAccount() {
    }

    /**
     * Method that returns the id of the user
     * @return the id of the user
     */
    public long getIdUser() {
        return idUser;
    }

    /**
     * Method that set the id of the user
     * @param idUser the id of the user
     */
    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    /**
     * Method that returns the id of the account
     * @return the id of the account
     */
    public long getIdAcc() {
        return idAcc;
    }

    /**
     * Method that set the id account
     * @param idAcc the id of the account
     */
    public void setIdAcc(long idAcc) {
        this.idAcc = idAcc;
    }

}
