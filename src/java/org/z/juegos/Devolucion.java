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
@Table(name = "DEVOLUCION")
@NamedQueries({
    @NamedQuery(name = "Devolucion.findAll", query = "SELECT d FROM Devolucion d"),
    @NamedQuery(name = "Devolucion.findByDvlCorr", query = "SELECT d FROM Devolucion d WHERE d.dvlCorr = :dvlCorr"),
    @NamedQuery(name = "Devolucion.findByDvlDepSerie", query = "SELECT d FROM Devolucion d WHERE d.dvlDepSerie = :dvlDepSerie"),
    @NamedQuery(name = "Devolucion.findByDvlCantidad", query = "SELECT d FROM Devolucion d WHERE d.dvlCantidad = :dvlCantidad"),
    @NamedQuery(name = "Devolucion.findByDvlComentario", query = "SELECT d FROM Devolucion d WHERE d.dvlComentario = :dvlComentario"),
    @NamedQuery(name = "Devolucion.findByDvlCicloVida", query = "SELECT d FROM Devolucion d WHERE d.dvlCicloVida = :dvlCicloVida"),
    @NamedQuery(name = "Devolucion.findByDvlFechCrea", query = "SELECT d FROM Devolucion d WHERE d.dvlFechCrea = :dvlFechCrea"),
    @NamedQuery(name = "Devolucion.findByDvlUsuaCrea", query = "SELECT d FROM Devolucion d WHERE d.dvlUsuaCrea = :dvlUsuaCrea")})
public class Devolucion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DVL_CORR")
    private Integer dvlCorr;
    @Column(name = "DVL_DEP_SERIE")
    private String dvlDepSerie;
    @Column(name = "DVL_CANTIDAD")
    private Integer dvlCantidad;
    @Column(name = "DVL_COMENTARIO")
    private String dvlComentario;
    @Column(name = "DVL_CICLO_VIDA")
    private String dvlCicloVida;
    @Column(name = "DVL_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date dvlFechCrea;
    @Column(name = "DVL_USUA_CREA")
    private String dvlUsuaCrea;
    @JoinColumn(name = "DVL_DTV_CORR", referencedColumnName = "DTV_CORR")
    @ManyToOne
    private DetalleVenta detalleVenta;
    @JoinColumn(name = "DVL_DEP_CODIGO", referencedColumnName = "DEP_CODIGO")
    @ManyToOne
    private InventarioDetalle inventarioDetalle;

    public Devolucion() {
    }

    public Devolucion(Integer dvlCorr) {
        this.dvlCorr = dvlCorr;
    }

    public Integer getDvlCorr() {
        return dvlCorr;
    }

    public void setDvlCorr(Integer dvlCorr) {
        this.dvlCorr = dvlCorr;
    }

    public String getDvlDepSerie() {
        return dvlDepSerie;
    }

    public void setDvlDepSerie(String dvlDepSerie) {
        this.dvlDepSerie = dvlDepSerie;
    }

    public Integer getDvlCantidad() {
        return dvlCantidad;
    }

    public void setDvlCantidad(Integer dvlCantidad) {
        this.dvlCantidad = dvlCantidad;
    }

    public String getDvlComentario() {
        return dvlComentario;
    }

    public void setDvlComentario(String dvlComentario) {
        this.dvlComentario = dvlComentario;
    }

    public String getDvlCicloVida() {
        return dvlCicloVida;
    }

    public void setDvlCicloVida(String dvlCicloVida) {
        this.dvlCicloVida = dvlCicloVida;
    }

    public Date getDvlFechCrea() {
        return dvlFechCrea;
    }

    public void setDvlFechCrea(Date dvlFechCrea) {
        this.dvlFechCrea = dvlFechCrea;
    }

    public String getDvlUsuaCrea() {
        return dvlUsuaCrea;
    }

    public void setDvlUsuaCrea(String dvlUsuaCrea) {
        this.dvlUsuaCrea = dvlUsuaCrea;
    }

    public DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(DetalleVenta detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public InventarioDetalle getInventarioDetalle() {
        return inventarioDetalle;
    }

    public void setInventarioDetalle(InventarioDetalle inventarioDetalle) {
        this.inventarioDetalle = inventarioDetalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dvlCorr != null ? dvlCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devolucion)) {
            return false;
        }
        Devolucion other = (Devolucion) object;
        if ((this.dvlCorr == null && other.dvlCorr != null) || (this.dvlCorr != null && !this.dvlCorr.equals(other.dvlCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Devolucion[dvlCorr=" + dvlCorr + "]";
    }

}
