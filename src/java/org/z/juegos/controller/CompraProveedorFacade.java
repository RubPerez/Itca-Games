/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.z.juegos.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.z.juegos.CompraProveedor;

/**
 *
 * @author esosa-ubuntu
 */
@Stateless
public class CompraProveedorFacade extends AbstractFacade<CompraProveedor> {
    @PersistenceContext(unitName = "zjuegosPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CompraProveedorFacade() {
        super(CompraProveedor.class);
    }

}
