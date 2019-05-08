/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.interfaceDAO;

import com.zulmianah.model.Administrateur;

/**
 *
 * @author Komun
 */
public interface AdministrateurInterfaceDAO {
    Administrateur seConnecter(Administrateur administrateur);//pseudo//motDePasse
    Boolean verification(Administrateur administrateur);//token
    void seDeconnecter(Administrateur administrateur);//id
}
