/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.security;

/**
 *
 * @author Komun
 */
public interface PasswordEncoder {
    String encode(CharSequence rawPassword);
    String generateHash(CharSequence rawPassword);
    boolean matches(CharSequence rawPassword, String encodedPassword);
    String generateToken();
}
