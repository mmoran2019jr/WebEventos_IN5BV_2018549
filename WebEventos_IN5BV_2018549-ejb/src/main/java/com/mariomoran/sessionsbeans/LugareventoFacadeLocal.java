/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariomoran.sessionsbeans;

import com.mariomoran.entities.Lugarevento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface LugareventoFacadeLocal {

    void create(Lugarevento lugarevento);

    void edit(Lugarevento lugarevento);

    void remove(Lugarevento lugarevento);

    Lugarevento find(Object id);

    List<Lugarevento> findAll();

    List<Lugarevento> findRange(int[] range);

    int count();
    
}
