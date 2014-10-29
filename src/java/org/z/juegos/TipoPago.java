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
@Table(name = "TIPO_PAGO")
@NamedQueries({
    @NamedQuery(name = "TipoPago.findAll", query = "SELECT t FROM TipoPago t"),
    @NamedQuery(name = "TipoPago.findByTdpCorr", query = "SELECT t FROM TipoPago t WHERE t.tdpCorr = :tdpCorr"),
    @NamedQuery(name = "TipoPago.findByTdpNombre", query = "SELECT t FROM TipoPago t WHERE t.tdpNombre = :tdpNombre"),
    @NamedQuery(name = "TipoPago.findByTdpDescripcion", query = "SELECT t FROM TipoPago t WHERE t.tdpDescripcion = :tdpDescripcion"),
    @NamedQuery(name = "TipoPago.findByTdpFechCrea", query = "SELECT t FROM TipoPago t WHERE t.tdpFechCrea = :tdpFechCrea"),
    @NamedQuery(name = "TipoPago.findByTdpUsuaCrea", query = "SELECT t FROM TipoPago t WHERE t.tdpUsuaCrea = :tdpUsuaCrea")})
public class TipoPago implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TDP_CORR")
    private Integer tdpCorr;
    @Column(name = "TDP_NOMBRE")
    private String tdpNombre;
    @Column(name = "TDP_DESCRIPCION")
    private String tdpDescripcion;
    @Column(name = "TDP_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date tdpFechCrea;
    @Column(name = "TDP_USUA_CREA")
    private String tdpUsuaCrea;
    @OneToMany(mappedBy = "tipoPago")
    private List<CompraProveedor> compraProveedorList;
    @OneToMany(mappedBy = "tipoPago")
    private List<Venta> ventaList;

    public TipoPago() {
    }

    public TipoPago(Integer tdpCorr) {
        this.tdpCorr = tdpCorr;
    }

    public Integer getTdpCorr() {
        return tdpCorr;
    }

    public void setTdpCorr(Integer tdpCorr) {
        this.tdpCorr = tdpCorr;
    }

    public String getTdpNombre() {
        return tdpNombre;
    }

    public void setTdpNombre(String tdpNombre) {
        this.tdpNombre = tdpNombre;
    }

    public String getTdpDescripcion() {
        return tdpDescripcion;
    }

    public void setTdpDescripcion(String tdpDescripcion) {
        this.tdpDescripcion = tdpDescripcion;
    }

    public Date getTdpFechCrea() {
        return tdpFechCrea;
    }

    public void setTdpFechCrea(Date tdpFechCrea) {
        this.tdpFechCrea = tdpFechCrea;
    }

    public String getTdpUsuaCrea() {
        return tdpUsuaCrea;
    }

    public void setTdpUsuaCrea(String tdpUsuaCrea) {
        this.tdpUsuaCrea = tdpUsuaCrea;
    }

    public List<CompraProveedor> getCompraProveedorList() {
        return compraProveedorList;
    }

    public void setCompraProveedorList(List<CompraProveedor> compraProveedorList) {
        this.compraProveedorList = compraProveedorList;
    }

    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tdpCorr != null ? tdpCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPago)) {
            return false;
        }
        TipoPago other = (TipoPago) object;
        if ((this.tdpCorr == null && other.tdpCorr != null) || (this.tdpCorr != null && !this.tdpCorr.equals(other.tdpCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.TipoPago[tdpCorr=" + tdpCorr + "]";
    }

}
