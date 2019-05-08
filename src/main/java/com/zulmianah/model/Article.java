/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Komun
 */
@Entity
@Table(name = "article")
@NamedQueries({
    @NamedQuery(name = "Article.findAll", query = "SELECT a FROM Article a")})
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idarticle")
    private Integer idarticle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "titrearticle")
    private String titrearticle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "contenuarticle")
    private String contenuarticle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datearticle")
    @Temporal(TemporalType.DATE)
    private Date datearticle;
    @JoinTable(name = "articletag", joinColumns = {
        @JoinColumn(name = "idarticle", referencedColumnName = "idarticle")}, inverseJoinColumns = {
        @JoinColumn(name = "idtag", referencedColumnName = "idtag")})
    @ManyToMany
    private Collection<Tag> tagCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idarticle")
    private Collection<Image> imageCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idarticle")
    private Collection<Commentaire> commentaireCollection;
    @JoinColumn(name = "idauteur", referencedColumnName = "idauteur")
    @ManyToOne(optional = false)
    private Auteur idauteur;
    @JoinColumn(name = "idsouscategorie", referencedColumnName = "idsouscategorie")
    @ManyToOne(optional = false)
    private Souscategorie idsouscategorie;

    public Article() {
    }

    public Article(Integer idarticle) {
        this.idarticle = idarticle;
    }

    public Article(Integer idarticle, String titrearticle, String contenuarticle, Date datearticle) {
        this.idarticle = idarticle;
        this.titrearticle = titrearticle;
        this.contenuarticle = contenuarticle;
        this.datearticle = datearticle;
    }

    public Integer getIdarticle() {
        return idarticle;
    }

    public void setIdarticle(Integer idarticle) {
        this.idarticle = idarticle;
    }

    public String getTitrearticle() {
        return titrearticle;
    }

    public void setTitrearticle(String titrearticle) {
        this.titrearticle = titrearticle;
    }

    public String getContenuarticle() {
        return contenuarticle;
    }

    public void setContenuarticle(String contenuarticle) {
        this.contenuarticle = contenuarticle;
    }

    public Date getDatearticle() {
        return datearticle;
    }

    public void setDatearticle(Date datearticle) {
        this.datearticle = datearticle;
    }

    public Collection<Tag> getTagCollection() {
        return tagCollection;
    }

    public void setTagCollection(Collection<Tag> tagCollection) {
        this.tagCollection = tagCollection;
    }

    public Collection<Image> getImageCollection() {
        return imageCollection;
    }

    public void setImageCollection(Collection<Image> imageCollection) {
        this.imageCollection = imageCollection;
    }

    public Collection<Commentaire> getCommentaireCollection() {
        return commentaireCollection;
    }

    public void setCommentaireCollection(Collection<Commentaire> commentaireCollection) {
        this.commentaireCollection = commentaireCollection;
    }

    public Auteur getIdauteur() {
        return idauteur;
    }

    public void setIdauteur(Auteur idauteur) {
        this.idauteur = idauteur;
    }

    public Souscategorie getIdsouscategorie() {
        return idsouscategorie;
    }

    public void setIdsouscategorie(Souscategorie idsouscategorie) {
        this.idsouscategorie = idsouscategorie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idarticle != null ? idarticle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.idarticle == null && other.idarticle != null) || (this.idarticle != null && !this.idarticle.equals(other.idarticle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zulmianah.model.Article[ idarticle=" + idarticle + " ]";
    }
    
}
