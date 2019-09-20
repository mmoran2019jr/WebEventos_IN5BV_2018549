/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariomoran.sessionsbeans;

import com.mariomoran.entities.Reservacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface ReservacionFacadeLocal {

    void create(Reservacion reservacion);

    void edit(Reservacion reservacion);

    void remove(Reservacion reservacion);

    Reservacion find(Object id);

    List<Reservacion> findAll();

    List<Reservacion> findRange(int[] range);

    int count();
    
}
