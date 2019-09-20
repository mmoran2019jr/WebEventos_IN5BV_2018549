/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariomoran.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "reservacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservacion.findAll", query = "SELECT r FROM Reservacion r")
    , @NamedQuery(name = "Reservacion.findByIdreservacion", query = "SELECT r FROM Reservacion r WHERE r.idreservacion = :idreservacion")
    , @NamedQuery(name = "Reservacion.findByHorainicio", query = "SELECT r FROM Reservacion r WHERE r.horainicio = :horainicio")
    , @NamedQuery(name = "Reservacion.findByHorafin", query = "SELECT r FROM Reservacion r WHERE r.horafin = :horafin")
    , @NamedQuery(name = "Reservacion.findByDescripcion", query = "SELECT r FROM Reservacion r WHERE r.descripcion = :descripcion")})
public class Reservacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreservacion")
    private Integer idreservacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horainicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horainicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horafin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horafin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "area_idarea", referencedColumnName = "idarea")
    @ManyToOne(optional = false)
    private Area areaIdarea;
    @JoinColumn(name = "cliente_idcliente", referencedColumnName = "idcliente")
    @ManyToOne(optional = false)
    private Cliente clienteIdcliente;
    @JoinColumn(name = "cotizacion_idcotizacion", referencedColumnName = "idcotizacion")
    @ManyToOne(optional = false)
    private Cotizacion cotizacionIdcotizacion;
    @JoinColumn(name = "evento_idevento", referencedColumnName = "idevento")
    @ManyToOne(optional = false)
    private Evento eventoIdevento;
    @JoinColumn(name = "lugarEvento_idlugarEvento", referencedColumnName = "idlugarevento")
    @ManyToOne(optional = false)
    private Lugarevento lugarEventoidlugarEvento;

    public Reservacion() {
    }

    public Reservacion(Integer idreservacion) {
        this.idreservacion = idreservacion;
    }

    public Reservacion(Integer idreservacion, Date horainicio, Date horafin, String descripcion) {
        this.idreservacion = idreservacion;
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.descripcion = descripcion;
    }

    public Integer getIdreservacion() {
        return idreservacion;
    }

    public void setIdreservacion(Integer idreservacion) {
        this.idreservacion = idreservacion;
    }

    public Date getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Date horainicio) {
        this.horainicio = horainicio;
    }

    public Date getHorafin() {
        return horafin;
    }

    public void setHorafin(Date horafin) {
        this.horafin = horafin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Area getAreaIdarea() {
        return areaIdarea;
    }

    public void setAreaIdarea(Area areaIdarea) {
        this.areaIdarea = areaIdarea;
    }

    public Cliente getClienteIdcliente() {
        return clienteIdcliente;
    }

    public void setClienteIdcliente(Cliente clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }

    public Cotizacion getCotizacionIdcotizacion() {
        return cotizacionIdcotizacion;
    }

    public void setCotizacionIdcotizacion(Cotizacion cotizacionIdcotizacion) {
        this.cotizacionIdcotizacion = cotizacionIdcotizacion;
    }

    public Evento getEventoIdevento() {
        return eventoIdevento;
    }

    public void setEventoIdevento(Evento eventoIdevento) {
        this.eventoIdevento = eventoIdevento;
    }

    public Lugarevento getLugarEventoidlugarEvento() {
        return lugarEventoidlugarEvento;
    }

    public void setLugarEventoidlugarEvento(Lugarevento lugarEventoidlugarEvento) {
        this.lugarEventoidlugarEvento = lugarEventoidlugarEvento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreservacion != null ? idreservacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservacion)) {
            return false;
        }
        Reservacion other = (Reservacion) object;
        if ((this.idreservacion == null && other.idreservacion != null) || (this.idreservacion != null && !this.idreservacion.equals(other.idreservacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mariomoran.entities.Reservacion[ idreservacion=" + idreservacion + " ]";
    }
    
}
