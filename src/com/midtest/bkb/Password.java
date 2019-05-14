/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.midtest.bkb;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author bbairagi01
 */
public class Password {
    
    public static void main(String args[]){
        String hashed = BCrypt.hashpw("123456", BCrypt.gensalt(12));
        System.out.println(hashed);
//        String pass="123456";
//        if (BCrypt.checkpw(pass, "$2y$12$rolNMXv0athT1cf3wCx0JuJn5QrKoD43kyir7ZF/H0PaG72G1lp/2"))
//            System.out.println("It matches");
//         else
//            System.out.println("It does not match");
        
    }
}
