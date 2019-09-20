/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariomoran.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "facturacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturacion.findAll", query = "SELECT f FROM Facturacion f")
    , @NamedQuery(name = "Facturacion.findByIdfacturacion", query = "SELECT f FROM Facturacion f WHERE f.idfacturacion = :idfacturacion")
    , @NamedQuery(name = "Facturacion.findByDescripcion", query = "SELECT f FROM Facturacion f WHERE f.descripcion = :descripcion")
    , @NamedQuery(name = "Facturacion.findByNombrefactura", query = "SELECT f FROM Facturacion f WHERE f.nombrefactura = :nombrefactura")
    , @NamedQuery(name = "Facturacion.findByTotal", query = "SELECT f FROM Facturacion f WHERE f.total = :total")
    , @NamedQuery(name = "Facturacion.findByProductosIdproductos", query = "SELECT f FROM Facturacion f WHERE f.productosIdproductos = :productosIdproductos")})
public class Facturacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfacturacion")
    private Integer idfacturacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nombrefactura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nombrefactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private double total;
    @Basic(optional = false)
    @NotNull
    @Column(name = "productos_idproductos")
    private int productosIdproductos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facturacionIdfacturacion")
    private List<Detallefacturacion> detallefacturacionList;
    @JoinColumn(name = "cotizacion_idcotizacion", referencedColumnName = "idcotizacion")
    @ManyToOne(optional = false)
    private Cotizacion cotizacionIdcotizacion;
    @JoinColumn(name = "idcliente", referencedColumnName = "idcliente")
    @ManyToOne(optional = false)
    private Cliente idcliente;

    public Facturacion() {
    }

    public Facturacion(Integer idfacturacion) {
        this.idfacturacion = idfacturacion;
    }

    public Facturacion(Integer idfacturacion, String descripcion, Date nombrefactura, double total, int productosIdproductos) {
        this.idfacturacion = idfacturacion;
        this.descripcion = descripcion;
        this.nombrefactura = nombrefactura;
        this.total = total;
        this.productosIdproductos = productosIdproductos;
    }

    public Integer getIdfacturacion() {
        return idfacturacion;
    }

    public void setIdfacturacion(Integer idfacturacion) {
        this.idfacturacion = idfacturacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getNombrefactura() {
        return nombrefactura;
    }

    public void setNombrefactura(Date nombrefactura) {
        this.nombrefactura = nombrefactura;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getProductosIdproductos() {
        return productosIdproductos;
    }

    public void setProductosIdproductos(int productosIdproductos) {
        this.productosIdproductos = productosIdproductos;
    }

    @XmlTransient
    public List<Detallefacturacion> getDetallefacturacionList() {
        return detallefacturacionList;
    }

    public void setDetallefacturacionList(List<Detallefacturacion> detallefacturacionList) {
        this.detallefacturacionList = detallefacturacionList;
    }

    public Cotizacion getCotizacionIdcotizacion() {
        return cotizacionIdcotizacion;
    }

    public void setCotizacionIdcotizacion(Cotizacion cotizacionIdcotizacion) {
        this.cotizacionIdcotizacion = cotizacionIdcotizacion;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfacturacion != null ? idfacturacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturacion)) {
            return false;
        }
        Facturacion other = (Facturacion) object;
        if ((this.idfacturacion == null && other.idfacturacion != null) || (this.idfacturacion != null && !this.idfacturacion.equals(other.idfacturacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mariomoran.entities.Facturacion[ idfacturacion=" + idfacturacion + " ]";
    }
    
}
