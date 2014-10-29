/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.z.juegos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author esosa-ubuntu
 */
@Entity
@Table(name = "DETALLE_VENTA")
@NamedQueries({
    @NamedQuery(name = "DetalleVenta.findAll", query = "SELECT d FROM DetalleVenta d"),
    @NamedQuery(name = "DetalleVenta.findByDtvCorr", query = "SELECT d FROM DetalleVenta d WHERE d.dtvCorr = :dtvCorr"),
    @NamedQuery(name = "DetalleVenta.findByDtvDepSerie", query = "SELECT d FROM DetalleVenta d WHERE d.dtvDepSerie = :dtvDepSerie"),
    @NamedQuery(name = "DetalleVenta.findByDtvCantidad", query = "SELECT d FROM DetalleVenta d WHERE d.dtvCantidad = :dtvCantidad"),
    @NamedQuery(name = "DetalleVenta.findByDtvVenta", query = "SELECT d FROM DetalleVenta d WHERE d.dtvVenta = :dtvVenta"),
    @NamedQuery(name = "DetalleVenta.findByDtvGravado", query = "SELECT d FROM DetalleVenta d WHERE d.dtvGravado = :dtvGravado"),
    @NamedQuery(name = "DetalleVenta.findByDtvExento", query = "SELECT d FROM DetalleVenta d WHERE d.dtvExento = :dtvExento"),
    @NamedQuery(name = "DetalleVenta.findByDtvFechCrea", query = "SELECT d FROM DetalleVenta d WHERE d.dtvFechCrea = :dtvFechCrea"),
    @NamedQuery(name = "DetalleVenta.findByDtvUsuaCrea", query = "SELECT d FROM DetalleVenta d WHERE d.dtvUsuaCrea = :dtvUsuaCrea")})
public class DetalleVenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTV_CORR")
    private Integer dtvCorr;
    @Column(name = "DTV_DEP_SERIE")
    private String dtvDepSerie;
    @Column(name = "DTV_CANTIDAD")
    private Integer dtvCantidad;
    @Column(name = "DTV_VENTA")
    private Float dtvVenta;
    @Column(name = "DTV_GRAVADO")
    private Float dtvGravado;
    @Column(name = "DTV_EXENTO")
    private Float dtvExento;
    @Column(name = "DTV_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date dtvFechCrea;
    @Column(name = "DTV_USUA_CREA")
    private String dtvUsuaCrea;
    @JoinColumn(name = "DTV_VNT_CORR", referencedColumnName = "VNT_CORR")
    @ManyToOne
    private Venta venta;
    @JoinColumn(name = "DTV_DEP_CODIGO", referencedColumnName = "DEP_CODIGO")
    @ManyToOne
    private InventarioDetalle inventarioDetalle;
    @OneToMany(mappedBy = "detalleVenta")
    private List<Devolucion> devolucionList;

    public DetalleVenta() {
    }

    public DetalleVenta(Integer dtvCorr) {
        this.dtvCorr = dtvCorr;
    }

    public Integer getDtvCorr() {
        return dtvCorr;
    }

    public void setDtvCorr(Integer dtvCorr) {
        this.dtvCorr = dtvCorr;
    }

    public String getDtvDepSerie() {
        return dtvDepSerie;
    }

    public void setDtvDepSerie(String dtvDepSerie) {
        this.dtvDepSerie = dtvDepSerie;
    }

    public Integer getDtvCantidad() {
        return dtvCantidad;
    }

    public void setDtvCantidad(Integer dtvCantidad) {
        this.dtvCantidad = dtvCantidad;
    }

    public Float getDtvVenta() {
        return dtvVenta;
    }

    public void setDtvVenta(Float dtvVenta) {
        this.dtvVenta = dtvVenta;
    }

    public Float getDtvGravado() {
        return dtvGravado;
    }

    public void setDtvGravado(Float dtvGravado) {
        this.dtvGravado = dtvGravado;
    }

    public Float getDtvExento() {
        return dtvExento;
    }

    public void setDtvExento(Float dtvExento) {
        this.dtvExento = dtvExento;
    }

    public Date getDtvFechCrea() {
        return dtvFechCrea;
    }

    public void setDtvFechCrea(Date dtvFechCrea) {
        this.dtvFechCrea = dtvFechCrea;
    }

    public String getDtvUsuaCrea() {
        return dtvUsuaCrea;
    }

    public void setDtvUsuaCrea(String dtvUsuaCrea) {
        this.dtvUsuaCrea = dtvUsuaCrea;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public InventarioDetalle getInventarioDetalle() {
        return inventarioDetalle;
    }

    public void setInventarioDetalle(InventarioDetalle inventarioDetalle) {
        this.inventarioDetalle = inventarioDetalle;
    }

    public List<Devolucion> getDevolucionList() {
        return devolucionList;
    }

    public void setDevolucionList(List<Devolucion> devolucionList) {
        this.devolucionList = devolucionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtvCorr != null ? dtvCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVenta)) {
            return false;
        }
        DetalleVenta other = (DetalleVenta) object;
        if ((this.dtvCorr == null && other.dtvCorr != null) || (this.dtvCorr != null && !this.dtvCorr.equals(other.dtvCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.DetalleVenta[dtvCorr=" + dtvCorr + "]";
    }

}
