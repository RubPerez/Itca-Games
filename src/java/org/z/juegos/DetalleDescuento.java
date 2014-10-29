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
@Table(name = "DETALLE_DESCUENTO")
@NamedQueries({
    @NamedQuery(name = "DetalleDescuento.findAll", query = "SELECT d FROM DetalleDescuento d"),
    @NamedQuery(name = "DetalleDescuento.findByDtdCorr", query = "SELECT d FROM DetalleDescuento d WHERE d.dtdCorr = :dtdCorr"),
    @NamedQuery(name = "DetalleDescuento.findByDtdValor", query = "SELECT d FROM DetalleDescuento d WHERE d.dtdValor = :dtdValor"),
    @NamedQuery(name = "DetalleDescuento.findByDtdFechCrea", query = "SELECT d FROM DetalleDescuento d WHERE d.dtdFechCrea = :dtdFechCrea"),
    @NamedQuery(name = "DetalleDescuento.findByDtdUsuaCrea", query = "SELECT d FROM DetalleDescuento d WHERE d.dtdUsuaCrea = :dtdUsuaCrea")})
public class DetalleDescuento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTD_CORR")
    private Integer dtdCorr;
    @Column(name = "DTD_VALOR")
    private Float dtdValor;
    @Column(name = "DTD_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date dtdFechCrea;
    @Column(name = "DTD_USUA_CREA")
    private String dtdUsuaCrea;
    @JoinColumn(name = "DTD_SUC_CORR", referencedColumnName = "SUC_CORR")
    @ManyToOne
    private Sucursal sucursal;
    @JoinColumn(name = "DTD_MEM_CORR", referencedColumnName = "MEM_CORR")
    @ManyToOne
    private Membresia membresia;
    @JoinColumn(name = "DTD_INV_CORR", referencedColumnName = "INV_CORR")
    @ManyToOne
    private Inventario inventario;

    public DetalleDescuento() {
    }

    public DetalleDescuento(Integer dtdCorr) {
        this.dtdCorr = dtdCorr;
    }

    public Integer getDtdCorr() {
        return dtdCorr;
    }

    public void setDtdCorr(Integer dtdCorr) {
        this.dtdCorr = dtdCorr;
    }

    public Float getDtdValor() {
        return dtdValor;
    }

    public void setDtdValor(Float dtdValor) {
        this.dtdValor = dtdValor;
    }

    public Date getDtdFechCrea() {
        return dtdFechCrea;
    }

    public void setDtdFechCrea(Date dtdFechCrea) {
        this.dtdFechCrea = dtdFechCrea;
    }

    public String getDtdUsuaCrea() {
        return dtdUsuaCrea;
    }

    public void setDtdUsuaCrea(String dtdUsuaCrea) {
        this.dtdUsuaCrea = dtdUsuaCrea;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtdCorr != null ? dtdCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleDescuento)) {
            return false;
        }
        DetalleDescuento other = (DetalleDescuento) object;
        if ((this.dtdCorr == null && other.dtdCorr != null) || (this.dtdCorr != null && !this.dtdCorr.equals(other.dtdCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.DetalleDescuento[dtdCorr=" + dtdCorr + "]";
    }

}
