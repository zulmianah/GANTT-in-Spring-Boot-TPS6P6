/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name = "tag")
@NamedQueries({
    @NamedQuery(name = "Tag.findAll", query = "SELECT t FROM Tag t")})
public class Tag implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtag")
    private Integer idtag;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tag")
    private String tag;
    @ManyToMany(mappedBy = "tagCollection")
    private Collection<Article> articleCollection;

    public Tag() {
    }

    public Tag(Integer idtag) {
        this.idtag = idtag;
    }

    public Tag(Integer idtag, String tag) {
        this.idtag = idtag;
        this.tag = tag;
    }

    public Integer getIdtag() {
        return idtag;
    }

    public void setIdtag(Integer idtag) {
        this.idtag = idtag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
        hash += (idtag != null ? idtag.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tag)) {
            return false;
        }
        Tag other = (Tag) object;
        if ((this.idtag == null && other.idtag != null) || (this.idtag != null && !this.idtag.equals(other.idtag))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zulmianah.model.Tag[ idtag=" + idtag + " ]";
    }
    
}
