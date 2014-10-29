/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.z.juegos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author esosa-ubuntu
 */
@Entity
@Table(name = "COMPRA_PROVEEDOR")
@NamedQueries({
    @NamedQuery(name = "CompraProveedor.findAll", query = "SELECT c FROM CompraProveedor c"),
    @NamedQuery(name = "CompraProveedor.findByCmpCorr", query = "SELECT c FROM CompraProveedor c WHERE c.cmpCorr = :cmpCorr"),
    @NamedQuery(name = "CompraProveedor.findByCmpNumCompra", query = "SELECT c FROM CompraProveedor c WHERE c.cmpNumCompra = :cmpNumCompra"),
    @NamedQuery(name = "CompraProveedor.findByCmpFechCompra", query = "SELECT c FROM CompraProveedor c WHERE c.cmpFechCompra = :cmpFechCompra"),
    @NamedQuery(name = "CompraProveedor.findByCmpFechVencimiento", query = "SELECT c FROM CompraProveedor c WHERE c.cmpFechVencimiento = :cmpFechVencimiento"),
    @NamedQuery(name = "CompraProveedor.findByCmpEstado", query = "SELECT c FROM CompraProveedor c WHERE c.cmpEstado = :cmpEstado"),
    @NamedQuery(name = "CompraProveedor.findByCmpCicloVida", query = "SELECT c FROM CompraProveedor c WHERE c.cmpCicloVida = :cmpCicloVida"),
    @NamedQuery(name = "CompraProveedor.findByCmpTarjeta", query = "SELECT c FROM CompraProveedor c WHERE c.cmpTarjeta = :cmpTarjeta"),
    @NamedQuery(name = "CompraProveedor.findByCmpFechaCrea", query = "SELECT c FROM CompraProveedor c WHERE c.cmpFechaCrea = :cmpFechaCrea"),
    @NamedQuery(name = "CompraProveedor.findByCmpUsuaCrea", query = "SELECT c FROM CompraProveedor c WHERE c.cmpUsuaCrea = :cmpUsuaCrea")})
public class CompraProveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CMP_CORR")
    private Integer cmpCorr;
    @Column(name = "CMP_NUM_COMPRA")
    private Integer cmpNumCompra;
    @Column(name = "CMP_FECH_COMPRA")
    @Temporal(TemporalType.DATE)
    private Date cmpFechCompra;
    @Column(name = "CMP_FECH_VENCIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date cmpFechVencimiento;
    @Column(name = "CMP_ESTADO")
    private String cmpEstado;
    @Column(name = "CMP_CICLO_VIDA")
    private String cmpCicloVida;
    @Column(name = "CMP_TARJETA")
    private String cmpTarjeta;
    @Column(name = "CMP_FECHA_CREA")
    @Temporal(TemporalType.DATE)
    private Date cmpFechaCrea;
    @Column(name = "CMP_USUA_CREA")
    private String cmpUsuaCrea;
    @JoinColumn(name = "CMP_TDP_CORR", referencedColumnName = "TDP_CORR")
    @ManyToOne
    private TipoPago tipoPago;
    @JoinColumn(name = "CMP_PRV_CORR", referencedColumnName = "PRV_CORR")
    @ManyToOne
    private Proveedor proveedor;
    @JoinColumn(name = "CMP_EMP_CORR", referencedColumnName = "EMP_CORR")
    @ManyToOne
    private Empleado empleado;
    @OneToMany(mappedBy = "compraProveedor")
    private List<HistorialCompraProveedor> historialCompraProveedorList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "compraProveedor")
    private DetalleCompraProveedor detalleCompraProveedor;

    public CompraProveedor() {
    }

    public CompraProveedor(Integer cmpCorr) {
        this.cmpCorr = cmpCorr;
    }

    public Integer getCmpCorr() {
        return cmpCorr;
    }

    public void setCmpCorr(Integer cmpCorr) {
        this.cmpCorr = cmpCorr;
    }

    public Integer getCmpNumCompra() {
        return cmpNumCompra;
    }

    public void setCmpNumCompra(Integer cmpNumCompra) {
        this.cmpNumCompra = cmpNumCompra;
    }

    public Date getCmpFechCompra() {
        return cmpFechCompra;
    }

    public void setCmpFechCompra(Date cmpFechCompra) {
        this.cmpFechCompra = cmpFechCompra;
    }

    public Date getCmpFechVencimiento() {
        return cmpFechVencimiento;
    }

    public void setCmpFechVencimiento(Date cmpFechVencimiento) {
        this.cmpFechVencimiento = cmpFechVencimiento;
    }

    public String getCmpEstado() {
        return cmpEstado;
    }

    public void setCmpEstado(String cmpEstado) {
        this.cmpEstado = cmpEstado;
    }

    public String getCmpCicloVida() {
        return cmpCicloVida;
    }

    public void setCmpCicloVida(String cmpCicloVida) {
        this.cmpCicloVida = cmpCicloVida;
    }

    public String getCmpTarjeta() {
        return cmpTarjeta;
    }

    public void setCmpTarjeta(String cmpTarjeta) {
        this.cmpTarjeta = cmpTarjeta;
    }

    public Date getCmpFechaCrea() {
        return cmpFechaCrea;
    }

    public void setCmpFechaCrea(Date cmpFechaCrea) {
        this.cmpFechaCrea = cmpFechaCrea;
    }

    public String getCmpUsuaCrea() {
        return cmpUsuaCrea;
    }

    public void setCmpUsuaCrea(String cmpUsuaCrea) {
        this.cmpUsuaCrea = cmpUsuaCrea;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<HistorialCompraProveedor> getHistorialCompraProveedorList() {
        return historialCompraProveedorList;
    }

    public void setHistorialCompraProveedorList(List<HistorialCompraProveedor> historialCompraProveedorList) {
        this.historialCompraProveedorList = historialCompraProveedorList;
    }

    public DetalleCompraProveedor getDetalleCompraProveedor() {
        return detalleCompraProveedor;
    }

    public void setDetalleCompraProveedor(DetalleCompraProveedor detalleCompraProveedor) {
        this.detalleCompraProveedor = detalleCompraProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmpCorr != null ? cmpCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompraProveedor)) {
            return false;
        }
        CompraProveedor other = (CompraProveedor) object;
        if ((this.cmpCorr == null && other.cmpCorr != null) || (this.cmpCorr != null && !this.cmpCorr.equals(other.cmpCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.CompraProveedor[cmpCorr=" + cmpCorr + "]";
    }

}
