/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariomoran.sessionsbeans;

import com.mariomoran.entities.Tipoproducto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface TipoproductoFacadeLocal {

    void create(Tipoproducto tipoproducto);

    void edit(Tipoproducto tipoproducto);

    void remove(Tipoproducto tipoproducto);

    Tipoproducto find(Object id);

    List<Tipoproducto> findAll();

    List<Tipoproducto> findRange(int[] range);

    int count();
    
}
