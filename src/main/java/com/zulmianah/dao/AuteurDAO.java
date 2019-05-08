/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.dao;

import com.zulmianah.interfaceDAO.AuteurInterfaceDAO;
import com.zulmianah.model.Auteur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Komun
 */
public class AuteurDAO implements AuteurInterfaceDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public List<Auteur> listeAuteur(Connection c) throws Exception {
        List<Auteur> v = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "select * from AUTEUR";
            ps = c.prepareStatement(query);
            rs = ps.executeQuery();
            v = new ArrayList();
            while (rs.next()) {
                Auteur o = new Auteur();
                o.setIdauteur(rs.getInt("Idauteur"));
                o.setNomauteur(rs.getString("Nomauteur"));
                v.add(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return v;
    }

}
