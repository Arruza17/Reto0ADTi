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
     * Method that sets the id
     * @param id the one you want to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Method that gets the first name
     * @return the name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method that sets the first name
     * @param firstName the one to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Method that gets the last name
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method that set the last name
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Method that returns the middle initial
     * @return the middle initial
     */
    public char getMiddleInitial() {
        return middleInitial;
    }

    /**
     * Method that set the middle initial
     * @param middleInitial the middle initial
     */
    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    /**
     * Method that returns the street
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Method that set the street
     * @param street to add
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Method that returns the city
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Method that set the city
     * @param city to add
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Method that returns the state
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Method that set the state
     * @param state to add
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Method that returns the ZIP code
     * @return the ZIP code
     */
    public Integer getZip() {
        return zip;
    }

    /**
     * Method that set the ZIP code
     * @param zip to add
     */
    public void setZip(Integer zip) {
        this.zip = zip;
    }

    /**
     * Method that returns the phone number
     * @return the phone number
     */
    public long getPhone() {
        return phone;
    }

    /**
     * Method that set the phone number
     * @param phone to set
     */
    public void setPhone(long phone) {
        this.phone = phone;
    }

    /**
     * Method that returns the email
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Method that set the email
     * @param email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
