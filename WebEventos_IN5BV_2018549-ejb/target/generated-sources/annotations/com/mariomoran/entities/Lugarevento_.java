package com.mariomoran.entities;

import com.mariomoran.entities.Area;
import com.mariomoran.entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T13:08:35")
@StaticMetamodel(Lugarevento.class)
public class Lugarevento_ { 

    public static volatile SingularAttribute<Lugarevento, String> descripcion;
    public static volatile SingularAttribute<Lugarevento, Area> areaidArea;
    public static volatile ListAttribute<Lugarevento, Reservacion> reservacionList;
    public static volatile SingularAttribute<Lugarevento, Integer> idlugarevento;

}