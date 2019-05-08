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
@Table(name = "auteur")
@NamedQueries({
    @NamedQuery(name = "Auteur.findAll", query = "SELECT a FROM Auteur a")})
public class Auteur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idauteur")
    private Integer idauteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nomauteur")
    private String nomauteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "prenomauteur")
    private String prenomauteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "emailauteur")
    private String emailauteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "telephoneauteur")
    private String telephoneauteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "carriereauteur")
    private String carriereauteur;
    @Size(max = 2147483647)
    @Column(name = "descriptionauteur")
    private String descriptionauteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "pseudoauteur")
    private String pseudoauteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "hacheauteur")
    private String hacheauteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tokenauteur")
    private String tokenauteur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idauteur")
    private Collection<Article> articleCollection;

    public Auteur() {
    }

    public Auteur(Integer idauteur) {
        this.idauteur = idauteur;
    }

    public Auteur(Integer idauteur, String nomauteur, String prenomauteur, String emailauteur, String telephoneauteur, String carriereauteur, String pseudoauteur, String hacheauteur, String tokenauteur) {
        this.idauteur = idauteur;
        this.nomauteur = nomauteur;
        this.prenomauteur = prenomauteur;
        this.emailauteur = emailauteur;
        this.telephoneauteur = telephoneauteur;
        this.carriereauteur = carriereauteur;
        this.pseudoauteur = pseudoauteur;
        this.hacheauteur = hacheauteur;
        this.tokenauteur = tokenauteur;
    }

    public Integer getIdauteur() {
        return idauteur;
    }

    public void setIdauteur(Integer idauteur) {
        this.idauteur = idauteur;
    }

    public String getNomauteur() {
        return nomauteur;
    }

    public void setNomauteur(String nomauteur) {
        this.nomauteur = nomauteur;
    }

    public String getPrenomauteur() {
        return prenomauteur;
    }

    public void setPrenomauteur(String prenomauteur) {
        this.prenomauteur = prenomauteur;
    }

    public String getEmailauteur() {
        return emailauteur;
    }

    public void setEmailauteur(String emailauteur) {
        this.emailauteur = emailauteur;
    }

    public String getTelephoneauteur() {
        return telephoneauteur;
    }

    public void setTelephoneauteur(String telephoneauteur) {
        this.telephoneauteur = telephoneauteur;
    }

    public String getCarriereauteur() {
        return carriereauteur;
    }

    public void setCarriereauteur(String carriereauteur) {
        this.carriereauteur = carriereauteur;
    }

    public String getDescriptionauteur() {
        return descriptionauteur;
    }

    public void setDescriptionauteur(String descriptionauteur) {
        this.descriptionauteur = descriptionauteur;
    }

    public String getPseudoauteur() {
        return pseudoauteur;
    }

    public void setPseudoauteur(String pseudoauteur) {
        this.pseudoauteur = pseudoauteur;
    }

    public String getHacheauteur() {
        return hacheauteur;
    }

    public void setHacheauteur(String hacheauteur) {
        this.hacheauteur = hacheauteur;
    }

    public String getTokenauteur() {
        return tokenauteur;
    }

    public void setTokenauteur(String tokenauteur) {
        this.tokenauteur = tokenauteur;
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
        hash += (idauteur != null ? idauteur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auteur)) {
            return false;
        }
        Auteur other = (Auteur) object;
        if ((this.idauteur == null && other.idauteur != null) || (this.idauteur != null && !this.idauteur.equals(other.idauteur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zulmianah.model.Auteur[ idauteur=" + idauteur + " ]";
    }
    
}
