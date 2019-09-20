/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariomoran.sessionsbeans;

import com.mariomoran.entities.Detallefacturacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class DetallefacturacionFacade extends AbstractFacade<Detallefacturacion> implements DetallefacturacionFacadeLocal {

    @PersistenceContext(unitName = "com.mariomoran_WebEventos_IN5BV_2018549-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetallefacturacionFacade() {
        super(Detallefacturacion.class);
    }
    
}
