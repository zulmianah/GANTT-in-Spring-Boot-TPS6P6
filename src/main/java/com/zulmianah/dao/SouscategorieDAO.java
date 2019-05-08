/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.dao;

import com.zulmianah.interfaceDAO.SousCategorieInterfaceDAO;
import com.zulmianah.model.Souscategorie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Komun
 */
public class SouscategorieDAO implements SousCategorieInterfaceDAO{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{
        // TODO code application logic here
        
        HelperDAO h = new HelperDAO();
        SouscategorieDAO scDAO = new SouscategorieDAO();
        Connection c = null;
        try {
            c = h.getConnection();
            System.out.println(scDAO.listeSousCategorie(c));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }

    @Override
    public List<Souscategorie> listeSousCategorie(Connection c) throws Exception{
        List<Souscategorie> v = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "select * from SOUSCATEGORIE";
            ps = c.prepareStatement(query);
            rs = ps.executeQuery();
            v = new ArrayList();
            while (rs.next()) {
                Souscategorie o = new Souscategorie();
                o.setIdsouscategorie(rs.getInt("Idsouscategorie"));
                o.setNomsouscategorie(rs.getString("Nomsouscategorie"));
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
