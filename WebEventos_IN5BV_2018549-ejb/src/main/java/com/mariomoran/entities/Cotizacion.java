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
@Table(name = "cotizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotizacion.findAll", query = "SELECT c FROM Cotizacion c")
    , @NamedQuery(name = "Cotizacion.findByIdcotizacion", query = "SELECT c FROM Cotizacion c WHERE c.idcotizacion = :idcotizacion")
    , @NamedQuery(name = "Cotizacion.findByNombrecotizacion", query = "SELECT c FROM Cotizacion c WHERE c.nombrecotizacion = :nombrecotizacion")})
public class Cotizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcotizacion")
    private Integer idcotizacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombrecotizacion")
    private String nombrecotizacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cotizacionIdcotizacion")
    private List<Reservacion> reservacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cotizacionIdcotizacion")
    private List<Facturacion> facturacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cotizacionIdcotizacion")
    private List<Detallecotizacion> detallecotizacionList;

    public Cotizacion() {
    }

    public Cotizacion(Integer idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public Cotizacion(Integer idcotizacion, String nombrecotizacion) {
        this.idcotizacion = idcotizacion;
        this.nombrecotizacion = nombrecotizacion;
    }

    public Integer getIdcotizacion() {
        return idcotizacion;
    }

    public void setIdcotizacion(Integer idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public String getNombrecotizacion() {
        return nombrecotizacion;
    }

    public void setNombrecotizacion(String nombrecotizacion) {
        this.nombrecotizacion = nombrecotizacion;
    }

    @XmlTransient
    public List<Reservacion> getReservacionList() {
        return reservacionList;
    }

    public void setReservacionList(List<Reservacion> reservacionList) {
        this.reservacionList = reservacionList;
    }

    @XmlTransient
    public List<Facturacion> getFacturacionList() {
        return facturacionList;
    }

    public void setFacturacionList(List<Facturacion> facturacionList) {
        this.facturacionList = facturacionList;
    }

    @XmlTransient
    public List<Detallecotizacion> getDetallecotizacionList() {
        return detallecotizacionList;
    }

    public void setDetallecotizacionList(List<Detallecotizacion> detallecotizacionList) {
        this.detallecotizacionList = detallecotizacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcotizacion != null ? idcotizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizacion)) {
            return false;
        }
        Cotizacion other = (Cotizacion) object;
        if ((this.idcotizacion == null && other.idcotizacion != null) || (this.idcotizacion != null && !this.idcotizacion.equals(other.idcotizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mariomoran.entities.Cotizacion[ idcotizacion=" + idcotizacion + " ]";
    }
    
}
