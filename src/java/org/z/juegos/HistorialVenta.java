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
@Table(name = "HISTORIAL_VENTA")
@NamedQueries({
    @NamedQuery(name = "HistorialVenta.findAll", query = "SELECT h FROM HistorialVenta h"),
    @NamedQuery(name = "HistorialVenta.findByHsvCorr", query = "SELECT h FROM HistorialVenta h WHERE h.hsvCorr = :hsvCorr"),
    @NamedQuery(name = "HistorialVenta.findByHsvCodEmp", query = "SELECT h FROM HistorialVenta h WHERE h.hsvCodEmp = :hsvCodEmp"),
    @NamedQuery(name = "HistorialVenta.findByHsvEstadoAnterior", query = "SELECT h FROM HistorialVenta h WHERE h.hsvEstadoAnterior = :hsvEstadoAnterior"),
    @NamedQuery(name = "HistorialVenta.findByHsvObservacion", query = "SELECT h FROM HistorialVenta h WHERE h.hsvObservacion = :hsvObservacion"),
    @NamedQuery(name = "HistorialVenta.findByHsvFechCrea", query = "SELECT h FROM HistorialVenta h WHERE h.hsvFechCrea = :hsvFechCrea"),
    @NamedQuery(name = "HistorialVenta.findByHsvUsuaCrea", query = "SELECT h FROM HistorialVenta h WHERE h.hsvUsuaCrea = :hsvUsuaCrea")})
public class HistorialVenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HSV_CORR")
    private Integer hsvCorr;
    @Column(name = "HSV_COD_EMP")
    private Integer hsvCodEmp;
    @Column(name = "HSV_ESTADO_ANTERIOR")
    private String hsvEstadoAnterior;
    @Column(name = "HSV_OBSERVACION")
    private String hsvObservacion;
    @Column(name = "HSV_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date hsvFechCrea;
    @Column(name = "HSV_USUA_CREA")
    private String hsvUsuaCrea;
    @JoinColumn(name = "HSV_VNT_CORR", referencedColumnName = "VNT_CORR")
    @ManyToOne
    private Venta venta;

    public HistorialVenta() {
    }

    public HistorialVenta(Integer hsvCorr) {
        this.hsvCorr = hsvCorr;
    }

    public Integer getHsvCorr() {
        return hsvCorr;
    }

    public void setHsvCorr(Integer hsvCorr) {
        this.hsvCorr = hsvCorr;
    }

    public Integer getHsvCodEmp() {
        return hsvCodEmp;
    }

    public void setHsvCodEmp(Integer hsvCodEmp) {
        this.hsvCodEmp = hsvCodEmp;
    }

    public String getHsvEstadoAnterior() {
        return hsvEstadoAnterior;
    }

    public void setHsvEstadoAnterior(String hsvEstadoAnterior) {
        this.hsvEstadoAnterior = hsvEstadoAnterior;
    }

    public String getHsvObservacion() {
        return hsvObservacion;
    }

    public void setHsvObservacion(String hsvObservacion) {
        this.hsvObservacion = hsvObservacion;
    }

    public Date getHsvFechCrea() {
        return hsvFechCrea;
    }

    public void setHsvFechCrea(Date hsvFechCrea) {
        this.hsvFechCrea = hsvFechCrea;
    }

    public String getHsvUsuaCrea() {
        return hsvUsuaCrea;
    }

    public void setHsvUsuaCrea(String hsvUsuaCrea) {
        this.hsvUsuaCrea = hsvUsuaCrea;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hsvCorr != null ? hsvCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialVenta)) {
            return false;
        }
        HistorialVenta other = (HistorialVenta) object;
        if ((this.hsvCorr == null && other.hsvCorr != null) || (this.hsvCorr != null && !this.hsvCorr.equals(other.hsvCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.HistorialVenta[hsvCorr=" + hsvCorr + "]";
    }

}
