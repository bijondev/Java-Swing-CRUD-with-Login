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
public class Users {
    
    private int id;
    private String name;    
    private String username;
    private String email;
    private int password;

    public Users() {
    }

    public Users(int id, String name, String username, String email, int password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", password=" + password + '}';
    }

    
}
