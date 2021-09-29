/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Yeray
 */
public interface AccountControllerIFace {

    //ACCOUNTS
    /**
     *
     * @param idAcc
     * @return
     */
    public Account checkAcc(long idAcc) throws Exception;

    /**
     *
     * @param acc
     */
    public void createAcc(Account acc) throws Exception;

    /**
     *
     * @param cus
     */
    public void addCustomers(long cus, long acc) throws Exception;

    /**
     *
     * @param idAcc
     * @return
     */
    public ArrayList<Movement> searchMovements(String idAcc) throws Exception;

}
