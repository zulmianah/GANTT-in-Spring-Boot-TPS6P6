/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.security;

import org.springframework.security.crypto.bcrypt.BCrypt;

/**
 *
 * @author Komun
 */
public class Essai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PasswordEncoderConfig p = new PasswordEncoderConfig();
        //System.out.println(p.matches("my name", "$2a$04$7sNs7AmS5iGNRYZaJ5kTJe4s.Xxl9JW6.bZPqI/Dw.YXOy1Bgemj6"));
        //System.out.println("$2a$04$7sNs7AmS5iGNRYZaJ5kTJe4s.Xxl9JW6.bZPqI/Dw.YXOy1Bgemj6".length());
        //System.out.println(p.generateHash("root"));
        //System.out.println(p.generateToken());
    }
    
}
