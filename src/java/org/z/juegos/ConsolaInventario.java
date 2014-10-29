/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.z.juegos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author esosa-ubuntu
 */
@Entity
@Table(name = "CONSOLA_INVENTARIO")
@NamedQueries({
    @NamedQuery(name = "ConsolaInventario.findAll", query = "SELECT c FROM ConsolaInventario c"),
    @NamedQuery(name = "ConsolaInventario.findByCinInvCorr", query = "SELECT c FROM ConsolaInventario c WHERE c.cinInvCorr = :cinInvCorr"),
    @NamedQuery(name = "ConsolaInventario.findByCinFechCrea", query = "SELECT c FROM ConsolaInventario c WHERE c.cinFechCrea = :cinFechCrea"),
    @NamedQuery(name = "ConsolaInventario.findByCinUsuaCrea", query = "SELECT c FROM ConsolaInventario c WHERE c.cinUsuaCrea = :cinUsuaCrea")})
public class ConsolaInventario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CIN_INV_CORR")
    private Integer cinInvCorr;
    @Column(name = "CIN_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date cinFechCrea;
    @Column(name = "CIN_USUA_CREA")
    private String cinUsuaCrea;
    @JoinColumn(name = "CIN_INV_CORR", referencedColumnName = "INV_CORR", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Inventario inventario;
    @JoinColumn(name = "CIN_CJO_CORR", referencedColumnName = "CJO_CORR")
    @ManyToOne
    private ConsolaJuego consolaJuego;

    public ConsolaInventario() {
    }

    public ConsolaInventario(Integer cinInvCorr) {
        this.cinInvCorr = cinInvCorr;
    }

    public Integer getCinInvCorr() {
        return cinInvCorr;
    }

    public void setCinInvCorr(Integer cinInvCorr) {
        this.cinInvCorr = cinInvCorr;
    }

    public Date getCinFechCrea() {
        return cinFechCrea;
    }

    public void setCinFechCrea(Date cinFechCrea) {
        this.cinFechCrea = cinFechCrea;
    }

    public String getCinUsuaCrea() {
        return cinUsuaCrea;
    }

    public void setCinUsuaCrea(String cinUsuaCrea) {
        this.cinUsuaCrea = cinUsuaCrea;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public ConsolaJuego getConsolaJuego() {
        return consolaJuego;
    }

    public void setConsolaJuego(ConsolaJuego consolaJuego) {
        this.consolaJuego = consolaJuego;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cinInvCorr != null ? cinInvCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsolaInventario)) {
            return false;
        }
        ConsolaInventario other = (ConsolaInventario) object;
        if ((this.cinInvCorr == null && other.cinInvCorr != null) || (this.cinInvCorr != null && !this.cinInvCorr.equals(other.cinInvCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.ConsolaInventario[cinInvCorr=" + cinInvCorr + "]";
    }

}
