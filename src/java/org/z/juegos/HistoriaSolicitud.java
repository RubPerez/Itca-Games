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
@Table(name = "HISTORIA_SOLICITUD")
@NamedQueries({
    @NamedQuery(name = "HistoriaSolicitud.findAll", query = "SELECT h FROM HistoriaSolicitud h"),
    @NamedQuery(name = "HistoriaSolicitud.findByHslCorr", query = "SELECT h FROM HistoriaSolicitud h WHERE h.hslCorr = :hslCorr"),
    @NamedQuery(name = "HistoriaSolicitud.findByHslComentario", query = "SELECT h FROM HistoriaSolicitud h WHERE h.hslComentario = :hslComentario"),
    @NamedQuery(name = "HistoriaSolicitud.findByHslFechCrea", query = "SELECT h FROM HistoriaSolicitud h WHERE h.hslFechCrea = :hslFechCrea"),
    @NamedQuery(name = "HistoriaSolicitud.findByHslUsuaCrea", query = "SELECT h FROM HistoriaSolicitud h WHERE h.hslUsuaCrea = :hslUsuaCrea")})
public class HistoriaSolicitud implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HSL_CORR")
    private Integer hslCorr;
    @Column(name = "HSL_COMENTARIO")
    private String hslComentario;
    @Column(name = "HSL_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date hslFechCrea;
    @Column(name = "HSL_USUA_CREA")
    private String hslUsuaCrea;
    @JoinColumn(name = "HSL_SLC_CORR", referencedColumnName = "SLC_CORR")
    @ManyToOne
    private Solicitud solicitud;

    public HistoriaSolicitud() {
    }

    public HistoriaSolicitud(Integer hslCorr) {
        this.hslCorr = hslCorr;
    }

    public Integer getHslCorr() {
        return hslCorr;
    }

    public void setHslCorr(Integer hslCorr) {
        this.hslCorr = hslCorr;
    }

    public String getHslComentario() {
        return hslComentario;
    }

    public void setHslComentario(String hslComentario) {
        this.hslComentario = hslComentario;
    }

    public Date getHslFechCrea() {
        return hslFechCrea;
    }

    public void setHslFechCrea(Date hslFechCrea) {
        this.hslFechCrea = hslFechCrea;
    }

    public String getHslUsuaCrea() {
        return hslUsuaCrea;
    }

    public void setHslUsuaCrea(String hslUsuaCrea) {
        this.hslUsuaCrea = hslUsuaCrea;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hslCorr != null ? hslCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriaSolicitud)) {
            return false;
        }
        HistoriaSolicitud other = (HistoriaSolicitud) object;
        if ((this.hslCorr == null && other.hslCorr != null) || (this.hslCorr != null && !this.hslCorr.equals(other.hslCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.HistoriaSolicitud[hslCorr=" + hslCorr + "]";
    }

}
