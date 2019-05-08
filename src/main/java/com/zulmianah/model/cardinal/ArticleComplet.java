/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.model.cardinal;

import com.zulmianah.model.Article;
import com.zulmianah.model.Auteur;
import com.zulmianah.model.Categorie;
import com.zulmianah.model.Image;
import com.zulmianah.model.Souscategorie;
import com.zulmianah.model.Tag;

/**
 *
 * @author Komun
 */
public class ArticleComplet extends Article {

    private Auteur auteur;
    private Categorie categorie;
    private Souscategorie souscategorie;
    private Tag tag;
    private Image image;

    public ArticleComplet() {
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Souscategorie getSouscategorie() {
        return souscategorie;
    }

    public void setSouscategorie(Souscategorie souscategorie) {
        this.souscategorie = souscategorie;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ArticleAuteurSousCategorieTagImage{" + "auteur=" + auteur + ", categorie=" + categorie + ", souscategorie=" + souscategorie + ", tag=" + tag + ", image=" + image + '}';
    }
}
