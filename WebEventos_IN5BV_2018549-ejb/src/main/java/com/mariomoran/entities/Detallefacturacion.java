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
@Table(name = "detallefacturacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallefacturacion.findAll", query = "SELECT d FROM Detallefacturacion d")
    , @NamedQuery(name = "Detallefacturacion.findByIddetallefacturacion", query = "SELECT d FROM Detallefacturacion d WHERE d.iddetallefacturacion = :iddetallefacturacion")
    , @NamedQuery(name = "Detallefacturacion.findByCantidad", query = "SELECT d FROM Detallefacturacion d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "Detallefacturacion.findByPrecioventa", query = "SELECT d FROM Detallefacturacion d WHERE d.precioventa = :precioventa")})
public class Detallefacturacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetallefacturacion")
    private Integer iddetallefacturacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cantidad")
    private String cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioventa")
    private double precioventa;
    @JoinColumn(name = "facturacion_idfacturacion", referencedColumnName = "idfacturacion")
    @ManyToOne(optional = false)
    private Facturacion facturacionIdfacturacion;
    @JoinColumn(name = "productos_idproductos", referencedColumnName = "idproductos")
    @ManyToOne(optional = false)
    private Productos productosIdproductos;

    public Detallefacturacion() {
    }

    public Detallefacturacion(Integer iddetallefacturacion) {
        this.iddetallefacturacion = iddetallefacturacion;
    }

    public Detallefacturacion(Integer iddetallefacturacion, String cantidad, double precioventa) {
        this.iddetallefacturacion = iddetallefacturacion;
        this.cantidad = cantidad;
        this.precioventa = precioventa;
    }

    public Integer getIddetallefacturacion() {
        return iddetallefacturacion;
    }

    public void setIddetallefacturacion(Integer iddetallefacturacion) {
        this.iddetallefacturacion = iddetallefacturacion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public Facturacion getFacturacionIdfacturacion() {
        return facturacionIdfacturacion;
    }

    public void setFacturacionIdfacturacion(Facturacion facturacionIdfacturacion) {
        this.facturacionIdfacturacion = facturacionIdfacturacion;
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
        hash += (iddetallefacturacion != null ? iddetallefacturacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallefacturacion)) {
            return false;
        }
        Detallefacturacion other = (Detallefacturacion) object;
        if ((this.iddetallefacturacion == null && other.iddetallefacturacion != null) || (this.iddetallefacturacion != null && !this.iddetallefacturacion.equals(other.iddetallefacturacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mariomoran.entities.Detallefacturacion[ iddetallefacturacion=" + iddetallefacturacion + " ]";
    }
    
}
