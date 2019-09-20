/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariomoran.sessionsbeans;

import com.mariomoran.entities.Detallefacturacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface DetallefacturacionFacadeLocal {

    void create(Detallefacturacion detallefacturacion);

    void edit(Detallefacturacion detallefacturacion);

    void remove(Detallefacturacion detallefacturacion);

    Detallefacturacion find(Object id);

    List<Detallefacturacion> findAll();

    List<Detallefacturacion> findRange(int[] range);

    int count();
    
}
