/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.interfaceDAO;

import com.zulmianah.model.Auteur;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Komun
 */
public interface AuteurInterfaceDAO {
    List<Auteur>listeAuteur(Connection c) throws Exception;
}
