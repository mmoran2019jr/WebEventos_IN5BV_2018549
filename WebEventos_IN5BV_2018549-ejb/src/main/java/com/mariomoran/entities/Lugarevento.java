/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariomoran.entities;

import java.io.Serializable;
import java.util.List;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "lugarevento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lugarevento.findAll", query = "SELECT l FROM Lugarevento l")
    , @NamedQuery(name = "Lugarevento.findByIdlugarevento", query = "SELECT l FROM Lugarevento l WHERE l.idlugarevento = :idlugarevento")
    , @NamedQuery(name = "Lugarevento.findByDescripcion", query = "SELECT l FROM Lugarevento l WHERE l.descripcion = :descripcion")})
public class Lugarevento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlugarevento")
    private Integer idlugarevento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lugarEventoidlugarEvento")
    private List<Reservacion> reservacionList;
    @JoinColumn(name = "Area_idArea", referencedColumnName = "idarea")
    @ManyToOne(optional = false)
    private Area areaidArea;

    public Lugarevento() {
    }

    public Lugarevento(Integer idlugarevento) {
        this.idlugarevento = idlugarevento;
    }

    public Lugarevento(Integer idlugarevento, String descripcion) {
        this.idlugarevento = idlugarevento;
        this.descripcion = descripcion;
    }

    public Integer getIdlugarevento() {
        return idlugarevento;
    }

    public void setIdlugarevento(Integer idlugarevento) {
        this.idlugarevento = idlugarevento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Reservacion> getReservacionList() {
        return reservacionList;
    }

    public void setReservacionList(List<Reservacion> reservacionList) {
        this.reservacionList = reservacionList;
    }

    public Area getAreaidArea() {
        return areaidArea;
    }

    public void setAreaidArea(Area areaidArea) {
        this.areaidArea = areaidArea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlugarevento != null ? idlugarevento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lugarevento)) {
            return false;
        }
        Lugarevento other = (Lugarevento) object;
        if ((this.idlugarevento == null && other.idlugarevento != null) || (this.idlugarevento != null && !this.idlugarevento.equals(other.idlugarevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mariomoran.entities.Lugarevento[ idlugarevento=" + idlugarevento + " ]";
    }
    
}
