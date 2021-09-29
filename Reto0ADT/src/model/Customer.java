/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Ander Arruza
 */
public class Customer implements Serializable {

    private long id;
    private String firstName;
    private String lastName;
    private char middleInitial;
    private String street;
    private String city;
    private String state;
    private Integer zip;
    private long phone;
    private String email;
    //CONSTRUCTOR

    /**
     *
     */
    public Customer() {
    }

    //GETTERS AND SETTERS

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
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public char getMiddleInitial() {
        return middleInitial;
    }

    /**
     *
     * @param middleInitial
     */
    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    /**
     *
     * @return
     */
    public String getStreet() {
        return street;
    }

    /**
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @return
     */
    public Integer getZip() {
        return zip;
    }

    /**
     *
     * @param zip
     */
    public void setZip(Integer zip) {
        this.zip = zip;
    }

    /**
     *
     * @return
     */
    public long getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(long phone) {
        this.phone = phone;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
