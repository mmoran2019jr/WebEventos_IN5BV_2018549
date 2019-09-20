package com.mariomoran.entities;

import com.mariomoran.entities.Detallecotizacion;
import com.mariomoran.entities.Facturacion;
import com.mariomoran.entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T13:08:35")
@StaticMetamodel(Cotizacion.class)
public class Cotizacion_ { 

    public static volatile ListAttribute<Cotizacion, Detallecotizacion> detallecotizacionList;
    public static volatile SingularAttribute<Cotizacion, Integer> idcotizacion;
    public static volatile SingularAttribute<Cotizacion, String> nombrecotizacion;
    public static volatile ListAttribute<Cotizacion, Facturacion> facturacionList;
    public static volatile ListAttribute<Cotizacion, Reservacion> reservacionList;

}