/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Komun
 */
@Entity
@Table(name = "souscategorie")
@NamedQueries({
    @NamedQuery(name = "Souscategorie.findAll", query = "SELECT s FROM Souscategorie s")})
public class Souscategorie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsouscategorie")
    private Integer idsouscategorie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nomsouscategorie")
    private String nomsouscategorie;
    @JoinColumn(name = "idcategorie", referencedColumnName = "idcategorie")
    @ManyToOne(optional = false)
    private Categorie idcategorie;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsouscategorie")
    private Collection<Article> articleCollection;

    public Souscategorie() {
    }

    public Souscategorie(Integer idsouscategorie) {
        this.idsouscategorie = idsouscategorie;
    }

    public Souscategorie(Integer idsouscategorie, String nomsouscategorie) {
        this.idsouscategorie = idsouscategorie;
        this.nomsouscategorie = nomsouscategorie;
    }

    public Integer getIdsouscategorie() {
        return idsouscategorie;
    }

    public void setIdsouscategorie(Integer idsouscategorie) {
        this.idsouscategorie = idsouscategorie;
    }

    public String getNomsouscategorie() {
        return nomsouscategorie;
    }

    public void setNomsouscategorie(String nomsouscategorie) {
        this.nomsouscategorie = nomsouscategorie;
    }

    public Categorie getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(Categorie idcategorie) {
        this.idcategorie = idcategorie;
    }

    public Collection<Article> getArticleCollection() {
        return articleCollection;
    }

    public void setArticleCollection(Collection<Article> articleCollection) {
        this.articleCollection = articleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsouscategorie != null ? idsouscategorie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Souscategorie)) {
            return false;
        }
        Souscategorie other = (Souscategorie) object;
        if ((this.idsouscategorie == null && other.idsouscategorie != null) || (this.idsouscategorie != null && !this.idsouscategorie.equals(other.idsouscategorie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zulmianah.model.Souscategorie[ idsouscategorie=" + idsouscategorie + " ]";
    }
    
}
