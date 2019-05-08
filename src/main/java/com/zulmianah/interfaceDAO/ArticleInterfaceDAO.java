/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.interfaceDAO;

import com.zulmianah.model.Article;
import com.zulmianah.model.cardinal.ArticleComplet;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Komun
 */
public interface ArticleInterfaceDAO {
    List<Article> listeRecent(Connection c) throws Exception;
    List<Article> listeTopMois(Article article,Connection c) throws Exception;//mois
    List<Article> recherche(Article article, Date d1, Date d2,Connection c) throws Exception;
    List<ArticleComplet> listeArticle(int limit, int offset,Connection c) throws Exception;
    void nouveauArticle(Article a, Connection c)throws Exception;
}
