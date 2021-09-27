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

    private String idUser;
    private String idAcc;

    /**
     *
     */
    public CustomerAccount() {
    }

    /**
     *
     * @return
     */
    public String getIdUser() {
        return idUser;
    }

    /**
     *
     * @param idUser
     */
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    /**
     *
     * @return
     */
    public String getIdAcc() {
        return idAcc;
    }

    /**
     *
     * @param idAcc
     */
    public void setIdAcc(String idAcc) {
        this.idAcc = idAcc;
    }

}
