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
@Table(name = "VENTA")
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v"),
    @NamedQuery(name = "Venta.findByVntCorr", query = "SELECT v FROM Venta v WHERE v.vntCorr = :vntCorr"),
    @NamedQuery(name = "Venta.findByVntNumVenta", query = "SELECT v FROM Venta v WHERE v.vntNumVenta = :vntNumVenta"),
    @NamedQuery(name = "Venta.findByVntFechVenta", query = "SELECT v FROM Venta v WHERE v.vntFechVenta = :vntFechVenta"),
    @NamedQuery(name = "Venta.findByVntAutorizacion", query = "SELECT v FROM Venta v WHERE v.vntAutorizacion = :vntAutorizacion"),
    @NamedQuery(name = "Venta.findByVntEstado", query = "SELECT v FROM Venta v WHERE v.vntEstado = :vntEstado"),
    @NamedQuery(name = "Venta.findByVntCicloVida", query = "SELECT v FROM Venta v WHERE v.vntCicloVida = :vntCicloVida"),
    @NamedQuery(name = "Venta.findByVntFechCrea", query = "SELECT v FROM Venta v WHERE v.vntFechCrea = :vntFechCrea"),
    @NamedQuery(name = "Venta.findByVntUsuaCrea", query = "SELECT v FROM Venta v WHERE v.vntUsuaCrea = :vntUsuaCrea")})
public class Venta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VNT_CORR")
    private Integer vntCorr;
    @Column(name = "VNT_NUM_VENTA")
    private String vntNumVenta;
    @Column(name = "VNT_FECH_VENTA")
    @Temporal(TemporalType.DATE)
    private Date vntFechVenta;
    @Column(name = "VNT_AUTORIZACION")
    private String vntAutorizacion;
    @Column(name = "VNT_ESTADO")
    private String vntEstado;
    @Column(name = "VNT_CICLO_VIDA")
    private String vntCicloVida;
    @Column(name = "VNT_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date vntFechCrea;
    @Column(name = "VNT_USUA_CREA")
    private String vntUsuaCrea;
    @OneToMany(mappedBy = "venta")
    private List<HistorialVenta> historialVentaList;
    @OneToMany(mappedBy = "venta")
    private List<DetalleVenta> detalleVentaList;
    @JoinColumn(name = "VNT_TDP_CORR", referencedColumnName = "TDP_CORR")
    @ManyToOne
    private TipoPago tipoPago;
    @JoinColumn(name = "VNT_CLT_CORR", referencedColumnName = "CLT_CORR")
    @ManyToOne
    private Cliente cliente;
    @JoinColumn(name = "VNT_ALQ_CORR", referencedColumnName = "ALQ_CORR")
    @ManyToOne
    private Alquiler alquiler;

    public Venta() {
    }

    public Venta(Integer vntCorr) {
        this.vntCorr = vntCorr;
    }

    public Integer getVntCorr() {
        return vntCorr;
    }

    public void setVntCorr(Integer vntCorr) {
        this.vntCorr = vntCorr;
    }

    public String getVntNumVenta() {
        return vntNumVenta;
    }

    public void setVntNumVenta(String vntNumVenta) {
        this.vntNumVenta = vntNumVenta;
    }

    public Date getVntFechVenta() {
        return vntFechVenta;
    }

    public void setVntFechVenta(Date vntFechVenta) {
        this.vntFechVenta = vntFechVenta;
    }

    public String getVntAutorizacion() {
        return vntAutorizacion;
    }

    public void setVntAutorizacion(String vntAutorizacion) {
        this.vntAutorizacion = vntAutorizacion;
    }

    public String getVntEstado() {
        return vntEstado;
    }

    public void setVntEstado(String vntEstado) {
        this.vntEstado = vntEstado;
    }

    public String getVntCicloVida() {
        return vntCicloVida;
    }

    public void setVntCicloVida(String vntCicloVida) {
        this.vntCicloVida = vntCicloVida;
    }

    public Date getVntFechCrea() {
        return vntFechCrea;
    }

    public void setVntFechCrea(Date vntFechCrea) {
        this.vntFechCrea = vntFechCrea;
    }

    public String getVntUsuaCrea() {
        return vntUsuaCrea;
    }

    public void setVntUsuaCrea(String vntUsuaCrea) {
        this.vntUsuaCrea = vntUsuaCrea;
    }

    public List<HistorialVenta> getHistorialVentaList() {
        return historialVentaList;
    }

    public void setHistorialVentaList(List<HistorialVenta> historialVentaList) {
        this.historialVentaList = historialVentaList;
    }

    public List<DetalleVenta> getDetalleVentaList() {
        return detalleVentaList;
    }

    public void setDetalleVentaList(List<DetalleVenta> detalleVentaList) {
        this.detalleVentaList = detalleVentaList;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        hash += (vntCorr != null ? vntCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.vntCorr == null && other.vntCorr != null) || (this.vntCorr != null && !this.vntCorr.equals(other.vntCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Venta[vntCorr=" + vntCorr + "]";
    }

}
