/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.z.juegos.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.z.juegos.HistorialCompraProveedor;

/**
 *
 * @author esosa-ubuntu
 */
@Stateless
public class HistorialCompraProveedorFacade extends AbstractFacade<HistorialCompraProveedor> {
    @PersistenceContext(unitName = "zjuegosPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public HistorialCompraProveedorFacade() {
        super(HistorialCompraProveedor.class);
    }

}
