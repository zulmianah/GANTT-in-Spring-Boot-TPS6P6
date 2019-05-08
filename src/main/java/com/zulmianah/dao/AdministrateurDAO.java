/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.dao;

import com.zulmianah.interfaceDAO.AdministrateurInterfaceDAO;
import com.zulmianah.model.Administrateur;

/**
 *
 * @author Komun
 */
public class AdministrateurDAO implements AdministrateurInterfaceDAO{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public Administrateur seConnecter(Administrateur administrateur) {
        Administrateur v = new Administrateur();
        System.out.println("com.zulmianah.dao.AdministrateurDAO.seConnecter()");
        return v;
    }

    @Override
    public void seDeconnecter(Administrateur administrateur) {
        System.out.println("com.zulmianah.dao.AdministrateurDAO.seDeconnecter()");
    }

    @Override
    public Boolean verification(Administrateur administrateur) {
        System.out.println("com.zulmianah.dao.AdministrateurDAO.verification()");
        return true;
    }
    
}
