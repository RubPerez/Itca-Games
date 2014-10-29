/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.z.juegos.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.z.juegos.Membresia;

/**
 *
 * @author esosa-ubuntu
 */
@Stateless
public class MembresiaFacade extends AbstractFacade<Membresia> {
    @PersistenceContext(unitName = "zjuegosPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public MembresiaFacade() {
        super(Membresia.class);
    }

}
