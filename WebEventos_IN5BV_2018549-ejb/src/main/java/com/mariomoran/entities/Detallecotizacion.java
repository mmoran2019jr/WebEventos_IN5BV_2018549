/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariomoran.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "detallecotizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallecotizacion.findAll", query = "SELECT d FROM Detallecotizacion d")
    , @NamedQuery(name = "Detallecotizacion.findByIddetallecotizacion", query = "SELECT d FROM Detallecotizacion d WHERE d.iddetallecotizacion = :iddetallecotizacion")
    , @NamedQuery(name = "Detallecotizacion.findByDescripcion", query = "SELECT d FROM Detallecotizacion d WHERE d.descripcion = :descripcion")
    , @NamedQuery(name = "Detallecotizacion.findByCantidad", query = "SELECT d FROM Detallecotizacion d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "Detallecotizacion.findByPrecioventa", query = "SELECT d FROM Detallecotizacion d WHERE d.precioventa = :precioventa")})
public class Detallecotizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetallecotizacion")
    private Integer iddetallecotizacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cantidad")
    private String cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "precioventa")
    private String precioventa;
    @JoinColumn(name = "cotizacion_idcotizacion", referencedColumnName = "idcotizacion")
    @ManyToOne(optional = false)
    private Cotizacion cotizacionIdcotizacion;
    @JoinColumn(name = "productos_idproductos", referencedColumnName = "idproductos")
    @ManyToOne(optional = false)
    private Productos productosIdproductos;

    public Detallecotizacion() {
    }

    public Detallecotizacion(Integer iddetallecotizacion) {
        this.iddetallecotizacion = iddetallecotizacion;
    }

    public Detallecotizacion(Integer iddetallecotizacion, String descripcion, String cantidad, String precioventa) {
        this.iddetallecotizacion = iddetallecotizacion;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioventa = precioventa;
    }

    public Integer getIddetallecotizacion() {
        return iddetallecotizacion;
    }

    public void setIddetallecotizacion(Integer iddetallecotizacion) {
        this.iddetallecotizacion = iddetallecotizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(String precioventa) {
        this.precioventa = precioventa;
    }

    public Cotizacion getCotizacionIdcotizacion() {
        return cotizacionIdcotizacion;
    }

    public void setCotizacionIdcotizacion(Cotizacion cotizacionIdcotizacion) {
        this.cotizacionIdcotizacion = cotizacionIdcotizacion;
    }

    public Productos getProductosIdproductos() {
        return productosIdproductos;
    }

    public void setProductosIdproductos(Productos productosIdproductos) {
        this.productosIdproductos = productosIdproductos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetallecotizacion != null ? iddetallecotizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallecotizacion)) {
            return false;
        }
        Detallecotizacion other = (Detallecotizacion) object;
        if ((this.iddetallecotizacion == null && other.iddetallecotizacion != null) || (this.iddetallecotizacion != null && !this.iddetallecotizacion.equals(other.iddetallecotizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mariomoran.entities.Detallecotizacion[ iddetallecotizacion=" + iddetallecotizacion + " ]";
    }
    
}
