package com.mariomoran.entities;

import com.mariomoran.entities.Lugarevento;
import com.mariomoran.entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T13:08:35")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, String> descripcion;
    public static volatile SingularAttribute<Area, Integer> idarea;
    public static volatile ListAttribute<Area, Lugarevento> lugareventoList;
    public static volatile ListAttribute<Area, Reservacion> reservacionList;

}