package com.mariomoran.entities;

import com.mariomoran.entities.Facturacion;
import com.mariomoran.entities.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T13:08:35")
@StaticMetamodel(Detallefacturacion.class)
public class Detallefacturacion_ { 

    public static volatile SingularAttribute<Detallefacturacion, Integer> iddetallefacturacion;
    public static volatile SingularAttribute<Detallefacturacion, Facturacion> facturacionIdfacturacion;
    public static volatile SingularAttribute<Detallefacturacion, Productos> productosIdproductos;
    public static volatile SingularAttribute<Detallefacturacion, String> cantidad;
    public static volatile SingularAttribute<Detallefacturacion, Double> precioventa;

}