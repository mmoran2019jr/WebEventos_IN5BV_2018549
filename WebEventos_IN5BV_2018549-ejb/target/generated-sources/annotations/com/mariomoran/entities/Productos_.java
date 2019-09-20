package com.mariomoran.entities;

import com.mariomoran.entities.Detallecotizacion;
import com.mariomoran.entities.Detallefacturacion;
import com.mariomoran.entities.Tipoproducto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T13:08:35")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, Integer> idproductos;
    public static volatile ListAttribute<Productos, Detallecotizacion> detallecotizacionList;
    public static volatile ListAttribute<Productos, Detallefacturacion> detallefacturacionList;
    public static volatile SingularAttribute<Productos, Double> precioVenta;
    public static volatile SingularAttribute<Productos, Tipoproducto> tipoproductoIdtipoproducto;

}