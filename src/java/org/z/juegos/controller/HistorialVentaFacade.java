/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.z.juegos.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.z.juegos.HistorialVenta;

/**
 *
 * @author esosa-ubuntu
 */
@Stateless
public class HistorialVentaFacade extends AbstractFacade<HistorialVenta> {
    @PersistenceContext(unitName = "zjuegosPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public HistorialVentaFacade() {
        super(HistorialVenta.class);
    }

}
