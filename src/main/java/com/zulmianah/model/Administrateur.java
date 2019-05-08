/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Komun
 */
@Entity
@Table(name = "administrateur")
@NamedQueries({
    @NamedQuery(name = "Administrateur.findAll", query = "SELECT a FROM Administrateur a")})
public class Administrateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idadministrateur")
    private Integer idadministrateur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "hacheadministrateur")
    private String hacheadministrateur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tokenadministrateur")
    private String tokenadministrateur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "pseudoadministrateur")
    private String pseudoadministrateur;

    public Administrateur() {
    }

    public Administrateur(Integer idadministrateur) {
        this.idadministrateur = idadministrateur;
    }

    public Administrateur(Integer idadministrateur, String hacheadministrateur, String tokenadministrateur, String pseudoadministrateur) {
        this.idadministrateur = idadministrateur;
        this.hacheadministrateur = hacheadministrateur;
        this.tokenadministrateur = tokenadministrateur;
        this.pseudoadministrateur = pseudoadministrateur;
    }

    public Integer getIdadministrateur() {
        return idadministrateur;
    }

    public void setIdadministrateur(Integer idadministrateur) {
        this.idadministrateur = idadministrateur;
    }

    public String getHacheadministrateur() {
        return hacheadministrateur;
    }

    public void setHacheadministrateur(String hacheadministrateur) {
        this.hacheadministrateur = hacheadministrateur;
    }

    public String getTokenadministrateur() {
        return tokenadministrateur;
    }

    public void setTokenadministrateur(String tokenadministrateur) {
        this.tokenadministrateur = tokenadministrateur;
    }

    public String getPseudoadministrateur() {
        return pseudoadministrateur;
    }

    public void setPseudoadministrateur(String pseudoadministrateur) {
        this.pseudoadministrateur = pseudoadministrateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idadministrateur != null ? idadministrateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrateur)) {
            return false;
        }
        Administrateur other = (Administrateur) object;
        if ((this.idadministrateur == null && other.idadministrateur != null) || (this.idadministrateur != null && !this.idadministrateur.equals(other.idadministrateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zulmianah.model.Administrateur[ idadministrateur=" + idadministrateur + " ]";
    }
    
}
