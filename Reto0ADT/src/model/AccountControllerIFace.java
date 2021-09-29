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
     * @throws java.lang.Exception
     */
    public Account checkAcc(long idAcc) throws Exception;

    /**
     *
     * @param acc
     * @throws java.lang.Exception
     */
    public void createAcc(Account acc) throws Exception;

    /**
     *
     * @param cus
     * @param acc
     * @throws java.lang.Exception
     */
    public void addCustomers(long cus, long acc) throws Exception;

    /**
     *
     * @param idAcc
     * @return
     * @throws java.lang.Exception
     */
    public ArrayList<Movement> searchMovements(long idAcc) throws Exception;



}
