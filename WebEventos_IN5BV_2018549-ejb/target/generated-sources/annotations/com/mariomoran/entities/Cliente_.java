package com.mariomoran.entities;

import com.mariomoran.entities.Facturacion;
import com.mariomoran.entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T13:08:35")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apellidos;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, String> dpi;
    public static volatile ListAttribute<Cliente, Facturacion> facturacionList;
    public static volatile SingularAttribute<Cliente, Integer> idcliente;
    public static volatile ListAttribute<Cliente, Reservacion> reservacionList;
    public static volatile SingularAttribute<Cliente, String> email;
    public static volatile SingularAttribute<Cliente, String> nombres;

}