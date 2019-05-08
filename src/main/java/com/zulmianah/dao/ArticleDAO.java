/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.dao;

import com.zulmianah.interfaceDAO.ArticleInterfaceDAO;
import com.zulmianah.model.Article;
import com.zulmianah.model.cardinal.ArticleComplet;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Komun
 */
public class ArticleDAO implements ArticleInterfaceDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
    }

    @Override
    public List<Article> listeRecent(Connection c) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Article> listeTopMois(Article article, Connection c) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Article> recherche(Article article, Date d1, Date d2, Connection c) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ArticleComplet> listeArticle(int limit, int offset, Connection c) throws Exception {
        List<ArticleComplet> v = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT*FROM article \n"
                    + "JOIN auteur on article.IDAUTEUR=auteur.IDAUTEUR\n"
                    + "JOIN souscategorie on souscategorie.IDSOUSCATEGORIE=article.IDSOUSCATEGORIE\n"
                    + "JOIN categorie on categorie.IDCATEGORIE = souscategorie.IDCATEGORIE";
            ps = c.prepareStatement(query);
            rs = ps.executeQuery();
            v = new ArrayList();
            while (rs.next()) {
                ArticleComplet o = new ArticleComplet();
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

    @Override
    public void nouveauArticle(Article a, Connection c) throws Exception {
        PreparedStatement ps = null;
        try {
            c.setAutoCommit(false);
            String query = "insert into ARTICLE(IDARTICLE,IDAUTEUR,IDSOUSCATEGORIE,TITREARTICLE,CONTENUEARTICLE,DATEARTICLE) values (?)";
            ps = c.prepareStatement(query);
            ps.setString(1, "col");
            ps.executeUpdate();
            c.commit();
        } catch (Exception e) {
            if (c != null) {
                c.rollback();
            }
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }

}
