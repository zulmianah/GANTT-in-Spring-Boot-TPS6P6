/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.interfaceDAO;

import com.zulmianah.model.Client;

/**
 *
 * @author Komun
 */
public interface ClientInterfaceDAO {
    Client seConnecter(Client client);//pseudo//motDePasse
    Boolean verification(Client client);//token
    void seDeconnecter(Client client);//id
    Client modifier(Client client);//*
    void effacer(Client client);//id
}
