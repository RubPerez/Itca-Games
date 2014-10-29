/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.z.juegos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author esosa-ubuntu
 */
@Entity
@Table(name = "DANIO_INVENTARIO")
@NamedQueries({
    @NamedQuery(name = "DanioInventario.findAll", query = "SELECT d FROM DanioInventario d"),
    @NamedQuery(name = "DanioInventario.findByDaiCorr", query = "SELECT d FROM DanioInventario d WHERE d.daiCorr = :daiCorr"),
    @NamedQuery(name = "DanioInventario.findByDaiCosto", query = "SELECT d FROM DanioInventario d WHERE d.daiCosto = :daiCosto"),
    @NamedQuery(name = "DanioInventario.findByDaiFechCrea", query = "SELECT d FROM DanioInventario d WHERE d.daiFechCrea = :daiFechCrea"),
    @NamedQuery(name = "DanioInventario.findByDaiUsuaCrea", query = "SELECT d FROM DanioInventario d WHERE d.daiUsuaCrea = :daiUsuaCrea")})
public class DanioInventario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DAI_CORR")
    private Integer daiCorr;
    @Column(name = "DAI_COSTO")
    private BigDecimal daiCosto;
    @Column(name = "DAI_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date daiFechCrea;
    @Column(name = "DAI_USUA_CREA")
    private String daiUsuaCrea;
    @JoinColumn(name = "DAI_INV_CORR", referencedColumnName = "INV_CORR")
    @ManyToOne
    private Inventario inventario;
    @JoinColumn(name = "DAI_DAN_CODIGO", referencedColumnName = "DAN_CODIGO")
    @ManyToOne
    private Danio danio;

    public DanioInventario() {
    }

    public DanioInventario(Integer daiCorr) {
        this.daiCorr = daiCorr;
    }

    public Integer getDaiCorr() {
        return daiCorr;
    }

    public void setDaiCorr(Integer daiCorr) {
        this.daiCorr = daiCorr;
    }

    public BigDecimal getDaiCosto() {
        return daiCosto;
    }

    public void setDaiCosto(BigDecimal daiCosto) {
        this.daiCosto = daiCosto;
    }

    public Date getDaiFechCrea() {
        return daiFechCrea;
    }

    public void setDaiFechCrea(Date daiFechCrea) {
        this.daiFechCrea = daiFechCrea;
    }

    public String getDaiUsuaCrea() {
        return daiUsuaCrea;
    }

    public void setDaiUsuaCrea(String daiUsuaCrea) {
        this.daiUsuaCrea = daiUsuaCrea;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Danio getDanio() {
        return danio;
    }

    public void setDanio(Danio danio) {
        this.danio = danio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (daiCorr != null ? daiCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DanioInventario)) {
            return false;
        }
        DanioInventario other = (DanioInventario) object;
        if ((this.daiCorr == null && other.daiCorr != null) || (this.daiCorr != null && !this.daiCorr.equals(other.daiCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.DanioInventario[daiCorr=" + daiCorr + "]";
    }

}
