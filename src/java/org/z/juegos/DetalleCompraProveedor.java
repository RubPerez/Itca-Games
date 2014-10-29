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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author esosa-ubuntu
 */
@Entity
@Table(name = "DETALLE_COMPRA_PROVEEDOR")
@NamedQueries({
    @NamedQuery(name = "DetalleCompraProveedor.findAll", query = "SELECT d FROM DetalleCompraProveedor d"),
    @NamedQuery(name = "DetalleCompraProveedor.findByDtcCmpCorr", query = "SELECT d FROM DetalleCompraProveedor d WHERE d.dtcCmpCorr = :dtcCmpCorr"),
    @NamedQuery(name = "DetalleCompraProveedor.findByDtcCantidad", query = "SELECT d FROM DetalleCompraProveedor d WHERE d.dtcCantidad = :dtcCantidad"),
    @NamedQuery(name = "DetalleCompraProveedor.findByDtcEnvio", query = "SELECT d FROM DetalleCompraProveedor d WHERE d.dtcEnvio = :dtcEnvio"),
    @NamedQuery(name = "DetalleCompraProveedor.findByDtcEstado", query = "SELECT d FROM DetalleCompraProveedor d WHERE d.dtcEstado = :dtcEstado"),
    @NamedQuery(name = "DetalleCompraProveedor.findByDtcFechCrea", query = "SELECT d FROM DetalleCompraProveedor d WHERE d.dtcFechCrea = :dtcFechCrea"),
    @NamedQuery(name = "DetalleCompraProveedor.findByDtcUsuaCrea", query = "SELECT d FROM DetalleCompraProveedor d WHERE d.dtcUsuaCrea = :dtcUsuaCrea"),
    @NamedQuery(name = "DetalleCompraProveedor.findByDtcPrecio", query = "SELECT d FROM DetalleCompraProveedor d WHERE d.dtcPrecio = :dtcPrecio")})
public class DetalleCompraProveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTC_CMP_CORR")
    private Integer dtcCmpCorr;
    @Column(name = "DTC_CANTIDAD")
    private Integer dtcCantidad;
    @Column(name = "DTC_ENVIO")
    private String dtcEnvio;
    @Column(name = "DTC_ESTADO")
    private String dtcEstado;
    @Column(name = "DTC_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date dtcFechCrea;
    @Column(name = "DTC_USUA_CREA")
    private String dtcUsuaCrea;
    @Column(name = "DTC_PRECIO")
    private BigDecimal dtcPrecio;
    @JoinColumn(name = "DTC_INV_CORR", referencedColumnName = "INV_CORR")
    @ManyToOne
    private Inventario inventario;
    @JoinColumn(name = "DTC_CMP_CORR", referencedColumnName = "CMP_CORR", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private CompraProveedor compraProveedor;

    public DetalleCompraProveedor() {
    }

    public DetalleCompraProveedor(Integer dtcCmpCorr) {
        this.dtcCmpCorr = dtcCmpCorr;
    }

    public Integer getDtcCmpCorr() {
        return dtcCmpCorr;
    }

    public void setDtcCmpCorr(Integer dtcCmpCorr) {
        this.dtcCmpCorr = dtcCmpCorr;
    }

    public Integer getDtcCantidad() {
        return dtcCantidad;
    }

    public void setDtcCantidad(Integer dtcCantidad) {
        this.dtcCantidad = dtcCantidad;
    }

    public String getDtcEnvio() {
        return dtcEnvio;
    }

    public void setDtcEnvio(String dtcEnvio) {
        this.dtcEnvio = dtcEnvio;
    }

    public String getDtcEstado() {
        return dtcEstado;
    }

    public void setDtcEstado(String dtcEstado) {
        this.dtcEstado = dtcEstado;
    }

    public Date getDtcFechCrea() {
        return dtcFechCrea;
    }

    public void setDtcFechCrea(Date dtcFechCrea) {
        this.dtcFechCrea = dtcFechCrea;
    }

    public String getDtcUsuaCrea() {
        return dtcUsuaCrea;
    }

    public void setDtcUsuaCrea(String dtcUsuaCrea) {
        this.dtcUsuaCrea = dtcUsuaCrea;
    }

    public BigDecimal getDtcPrecio() {
        return dtcPrecio;
    }

    public void setDtcPrecio(BigDecimal dtcPrecio) {
        this.dtcPrecio = dtcPrecio;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
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
        hash += (dtcCmpCorr != null ? dtcCmpCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCompraProveedor)) {
            return false;
        }
        DetalleCompraProveedor other = (DetalleCompraProveedor) object;
        if ((this.dtcCmpCorr == null && other.dtcCmpCorr != null) || (this.dtcCmpCorr != null && !this.dtcCmpCorr.equals(other.dtcCmpCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.DetalleCompraProveedor[dtcCmpCorr=" + dtcCmpCorr + "]";
    }

}
