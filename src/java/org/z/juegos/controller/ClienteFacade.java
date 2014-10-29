/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.z.juegos.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.z.juegos.Cliente;

/**
 *
 * @author esosa-ubuntu
 */
@Stateless
public class ClienteFacade extends AbstractFacade<Cliente> {
    @PersistenceContext(unitName = "zjuegosPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(Cliente.class);
    }

}
