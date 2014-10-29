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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author esosa-ubuntu
 */
@Entity
@Table(name = "HISTORIAL_COMPRA_PROVEEDOR")
@NamedQueries({
    @NamedQuery(name = "HistorialCompraProveedor.findAll", query = "SELECT h FROM HistorialCompraProveedor h"),
    @NamedQuery(name = "HistorialCompraProveedor.findByHcpCorr", query = "SELECT h FROM HistorialCompraProveedor h WHERE h.hcpCorr = :hcpCorr"),
    @NamedQuery(name = "HistorialCompraProveedor.findByHcpEstadoAnterior", query = "SELECT h FROM HistorialCompraProveedor h WHERE h.hcpEstadoAnterior = :hcpEstadoAnterior"),
    @NamedQuery(name = "HistorialCompraProveedor.findByHcpCicloVidaAnterior", query = "SELECT h FROM HistorialCompraProveedor h WHERE h.hcpCicloVidaAnterior = :hcpCicloVidaAnterior"),
    @NamedQuery(name = "HistorialCompraProveedor.findByHcpCodEmp", query = "SELECT h FROM HistorialCompraProveedor h WHERE h.hcpCodEmp = :hcpCodEmp"),
    @NamedQuery(name = "HistorialCompraProveedor.findByHcpObservacion", query = "SELECT h FROM HistorialCompraProveedor h WHERE h.hcpObservacion = :hcpObservacion"),
    @NamedQuery(name = "HistorialCompraProveedor.findByHcpFechCrea", query = "SELECT h FROM HistorialCompraProveedor h WHERE h.hcpFechCrea = :hcpFechCrea"),
    @NamedQuery(name = "HistorialCompraProveedor.findByHcpUsuaCrea", query = "SELECT h FROM HistorialCompraProveedor h WHERE h.hcpUsuaCrea = :hcpUsuaCrea")})
public class HistorialCompraProveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HCP_CORR")
    private Integer hcpCorr;
    @Column(name = "HCP_ESTADO_ANTERIOR")
    private String hcpEstadoAnterior;
    @Column(name = "HCP_CICLO_VIDA_ANTERIOR")
    private String hcpCicloVidaAnterior;
    @Column(name = "HCP_COD_EMP")
    private Integer hcpCodEmp;
    @Column(name = "HCP_OBSERVACION")
    private String hcpObservacion;
    @Column(name = "HCP_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date hcpFechCrea;
    @Column(name = "HCP_USUA_CREA")
    private String hcpUsuaCrea;
    @JoinColumn(name = "HCP_CMP_CORR", referencedColumnName = "CMP_CORR")
    @ManyToOne
    private CompraProveedor compraProveedor;

    public HistorialCompraProveedor() {
    }

    public HistorialCompraProveedor(Integer hcpCorr) {
        this.hcpCorr = hcpCorr;
    }

    public Integer getHcpCorr() {
        return hcpCorr;
    }

    public void setHcpCorr(Integer hcpCorr) {
        this.hcpCorr = hcpCorr;
    }

    public String getHcpEstadoAnterior() {
        return hcpEstadoAnterior;
    }

    public void setHcpEstadoAnterior(String hcpEstadoAnterior) {
        this.hcpEstadoAnterior = hcpEstadoAnterior;
    }

    public String getHcpCicloVidaAnterior() {
        return hcpCicloVidaAnterior;
    }

    public void setHcpCicloVidaAnterior(String hcpCicloVidaAnterior) {
        this.hcpCicloVidaAnterior = hcpCicloVidaAnterior;
    }

    public Integer getHcpCodEmp() {
        return hcpCodEmp;
    }

    public void setHcpCodEmp(Integer hcpCodEmp) {
        this.hcpCodEmp = hcpCodEmp;
    }

    public String getHcpObservacion() {
        return hcpObservacion;
    }

    public void setHcpObservacion(String hcpObservacion) {
        this.hcpObservacion = hcpObservacion;
    }

    public Date getHcpFechCrea() {
        return hcpFechCrea;
    }

    public void setHcpFechCrea(Date hcpFechCrea) {
        this.hcpFechCrea = hcpFechCrea;
    }

    public String getHcpUsuaCrea() {
        return hcpUsuaCrea;
    }

    public void setHcpUsuaCrea(String hcpUsuaCrea) {
        this.hcpUsuaCrea = hcpUsuaCrea;
    }

    public CompraProveedor getCompraProveedor() {
        return compraProveedor;
    }

    public void setCompraProveedor(CompraProveedor compraProveedor) {
        this.compraProveedor = compraProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hcpCorr != null ? hcpCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialCompraProveedor)) {
            return false;
        }
        HistorialCompraProveedor other = (HistorialCompraProveedor) object;
        if ((this.hcpCorr == null && other.hcpCorr != null) || (this.hcpCorr != null && !this.hcpCorr.equals(other.hcpCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.HistorialCompraProveedor[hcpCorr=" + hcpCorr + "]";
    }

}
