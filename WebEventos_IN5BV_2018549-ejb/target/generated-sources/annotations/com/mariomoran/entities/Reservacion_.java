package com.mariomoran.entities;

import com.mariomoran.entities.Area;
import com.mariomoran.entities.Cliente;
import com.mariomoran.entities.Cotizacion;
import com.mariomoran.entities.Evento;
import com.mariomoran.entities.Lugarevento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T13:08:35")
@StaticMetamodel(Reservacion.class)
public class Reservacion_ { 

    public static volatile SingularAttribute<Reservacion, String> descripcion;
    public static volatile SingularAttribute<Reservacion, Cliente> clienteIdcliente;
    public static volatile SingularAttribute<Reservacion, Lugarevento> lugarEventoidlugarEvento;
    public static volatile SingularAttribute<Reservacion, Date> horafin;
    public static volatile SingularAttribute<Reservacion, Area> areaIdarea;
    public static volatile SingularAttribute<Reservacion, Evento> eventoIdevento;
    public static volatile SingularAttribute<Reservacion, Date> horainicio;
    public static volatile SingularAttribute<Reservacion, Cotizacion> cotizacionIdcotizacion;
    public static volatile SingularAttribute<Reservacion, Integer> idreservacion;

}