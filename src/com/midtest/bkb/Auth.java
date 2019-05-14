/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.midtest.bkb;

/**
 *
 * @author bbairagi01
 */
public class Auth {
    
    private int id;
    private String name;
    private boolean is_login; 

    public Auth() {
    }

    public Auth(int id, String name, boolean is_login) {
        this.id = id;
        this.name = name;
        this.is_login = is_login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIs_login() {
        return is_login;
    }

    public void setIs_login(boolean is_login) {
        this.is_login = is_login;
    }

    @Override
    public String toString() {
        return "Auth{" + "id=" + id + ", name=" + name + ", is_login=" + is_login + '}';
    }
    
    
    
}
