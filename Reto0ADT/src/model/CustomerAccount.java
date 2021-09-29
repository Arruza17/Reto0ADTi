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
     *
     */
    public CustomerAccount() {
    }

    /**
     *
     * @return
     */
    public long getIdUser() {
        return idUser;
    }

    /**
     *
     * @param idUser
     */
    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    /**
     *
     * @return
     */
    public long getIdAcc() {
        return idAcc;
    }

    /**
     *
     * @param idAcc
     */
    public void setIdAcc(long idAcc) {
        this.idAcc = idAcc;
    }

}
