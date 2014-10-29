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
@Table(name = "HISTORIAL_ALQUILER")
@NamedQueries({
    @NamedQuery(name = "HistorialAlquiler.findAll", query = "SELECT h FROM HistorialAlquiler h"),
    @NamedQuery(name = "HistorialAlquiler.findByHalCorr", query = "SELECT h FROM HistorialAlquiler h WHERE h.halCorr = :halCorr"),
    @NamedQuery(name = "HistorialAlquiler.findByHalCodEmp", query = "SELECT h FROM HistorialAlquiler h WHERE h.halCodEmp = :halCodEmp"),
    @NamedQuery(name = "HistorialAlquiler.findByHallEstadoAnterior", query = "SELECT h FROM HistorialAlquiler h WHERE h.hallEstadoAnterior = :hallEstadoAnterior"),
    @NamedQuery(name = "HistorialAlquiler.findByHalCicloVidaAnterior", query = "SELECT h FROM HistorialAlquiler h WHERE h.halCicloVidaAnterior = :halCicloVidaAnterior"),
    @NamedQuery(name = "HistorialAlquiler.findByHalObservacion", query = "SELECT h FROM HistorialAlquiler h WHERE h.halObservacion = :halObservacion"),
    @NamedQuery(name = "HistorialAlquiler.findByHallFechCrea", query = "SELECT h FROM HistorialAlquiler h WHERE h.hallFechCrea = :hallFechCrea"),
    @NamedQuery(name = "HistorialAlquiler.findByHalUsuaCrea", query = "SELECT h FROM HistorialAlquiler h WHERE h.halUsuaCrea = :halUsuaCrea")})
public class HistorialAlquiler implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HAL_CORR")
    private Integer halCorr;
    @Column(name = "HAL_COD_EMP")
    private Integer halCodEmp;
    @Column(name = "HALL_ESTADO_ANTERIOR")
    private String hallEstadoAnterior;
    @Column(name = "HAL_CICLO_VIDA_ANTERIOR")
    private String halCicloVidaAnterior;
    @Column(name = "HAL_OBSERVACION")
    private String halObservacion;
    @Column(name = "HALL_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date hallFechCrea;
    @Column(name = "HAL_USUA_CREA")
    private String halUsuaCrea;
    @JoinColumn(name = "HAL_ALQ_CORR", referencedColumnName = "ALQ_CORR")
    @ManyToOne
    private Alquiler alquiler;

    public HistorialAlquiler() {
    }

    public HistorialAlquiler(Integer halCorr) {
        this.halCorr = halCorr;
    }

    public Integer getHalCorr() {
        return halCorr;
    }

    public void setHalCorr(Integer halCorr) {
        this.halCorr = halCorr;
    }

    public Integer getHalCodEmp() {
        return halCodEmp;
    }

    public void setHalCodEmp(Integer halCodEmp) {
        this.halCodEmp = halCodEmp;
    }

    public String getHallEstadoAnterior() {
        return hallEstadoAnterior;
    }

    public void setHallEstadoAnterior(String hallEstadoAnterior) {
        this.hallEstadoAnterior = hallEstadoAnterior;
    }

    public String getHalCicloVidaAnterior() {
        return halCicloVidaAnterior;
    }

    public void setHalCicloVidaAnterior(String halCicloVidaAnterior) {
        this.halCicloVidaAnterior = halCicloVidaAnterior;
    }

    public String getHalObservacion() {
        return halObservacion;
    }

    public void setHalObservacion(String halObservacion) {
        this.halObservacion = halObservacion;
    }

    public Date getHallFechCrea() {
        return hallFechCrea;
    }

    public void setHallFechCrea(Date hallFechCrea) {
        this.hallFechCrea = hallFechCrea;
    }

    public String getHalUsuaCrea() {
        return halUsuaCrea;
    }

    public void setHalUsuaCrea(String halUsuaCrea) {
        this.halUsuaCrea = halUsuaCrea;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (halCorr != null ? halCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialAlquiler)) {
            return false;
        }
        HistorialAlquiler other = (HistorialAlquiler) object;
        if ((this.halCorr == null && other.halCorr != null) || (this.halCorr != null && !this.halCorr.equals(other.halCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.HistorialAlquiler[halCorr=" + halCorr + "]";
    }

}
