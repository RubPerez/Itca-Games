/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.z.juegos;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "INVENTARIO")
@NamedQueries({
    @NamedQuery(name = "Inventario.findAll", query = "SELECT i FROM Inventario i"),
    @NamedQuery(name = "Inventario.findByInvCorr", query = "SELECT i FROM Inventario i WHERE i.invCorr = :invCorr"),
    @NamedQuery(name = "Inventario.findByInvTipoTransaccion", query = "SELECT i FROM Inventario i WHERE i.invTipoTransaccion = :invTipoTransaccion"),
    @NamedQuery(name = "Inventario.findByInvNombre", query = "SELECT i FROM Inventario i WHERE i.invNombre = :invNombre"),
    @NamedQuery(name = "Inventario.findByInvDescripcion", query = "SELECT i FROM Inventario i WHERE i.invDescripcion = :invDescripcion"),
    @NamedQuery(name = "Inventario.findByInvCantidad", query = "SELECT i FROM Inventario i WHERE i.invCantidad = :invCantidad"),
    @NamedQuery(name = "Inventario.findByInvPrecio", query = "SELECT i FROM Inventario i WHERE i.invPrecio = :invPrecio"),
    @NamedQuery(name = "Inventario.findByInvEstado", query = "SELECT i FROM Inventario i WHERE i.invEstado = :invEstado"),
    @NamedQuery(name = "Inventario.findByInvImagen", query = "SELECT i FROM Inventario i WHERE i.invImagen = :invImagen"),
    @NamedQuery(name = "Inventario.findByInvFechCrea", query = "SELECT i FROM Inventario i WHERE i.invFechCrea = :invFechCrea"),
    @NamedQuery(name = "Inventario.findByInvUsuaCrea", query = "SELECT i FROM Inventario i WHERE i.invUsuaCrea = :invUsuaCrea")})
public class Inventario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INV_CORR")
    private Integer invCorr;
    @Column(name = "INV_TIPO_TRANSACCION")
    private String invTipoTransaccion;
    @Column(name = "INV_NOMBRE")
    private String invNombre;
    @Column(name = "INV_DESCRIPCION")
    private String invDescripcion;
    @Column(name = "INV_CANTIDAD")
    private Integer invCantidad;
    @Column(name = "INV_PRECIO")
    private BigDecimal invPrecio;
    @Column(name = "INV_ESTADO")
    private String invEstado;
    @Column(name = "INV_IMAGEN")
    private String invImagen;
    @Column(name = "INV_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date invFechCrea;
    @Column(name = "INV_USUA_CREA")
    private String invUsuaCrea;
    @JoinColumn(name = "INV_SUC_CORR", referencedColumnName = "SUC_CORR")
    @ManyToOne
    private Sucursal sucursal;
    @JoinColumn(name = "INV_MOD_CORR", referencedColumnName = "MOD_CORR")
    @ManyToOne
    private Modelo modelo;
    @JoinColumn(name = "INV_MAR_CORR", referencedColumnName = "MAR_CORR")
    @ManyToOne
    private Marca marca;
    @JoinColumn(name = "INV_CTG_CORR", referencedColumnName = "CTG_CORR")
    @ManyToOne
    private CatalogoProducto catalogoProducto;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "inventario")
    private ConsolaInventario consolaInventario;
    @OneToMany(mappedBy = "inventario")
    private List<InventarioDetalle> inventarioDetalleList;
    @OneToMany(mappedBy = "inventario")
    private List<DetalleCompraProveedor> detalleCompraProveedorList;
    @OneToMany(mappedBy = "inventario")
    private List<DanioInventario> danioInventarioList;
    @OneToMany(mappedBy = "inventario")
    private List<DetalleDescuento> detalleDescuentoList;

    public Inventario() {
    }

    public Inventario(Integer invCorr) {
        this.invCorr = invCorr;
    }

    public Integer getInvCorr() {
        return invCorr;
    }

    public void setInvCorr(Integer invCorr) {
        this.invCorr = invCorr;
    }

    public String getInvTipoTransaccion() {
        return invTipoTransaccion;
    }

    public void setInvTipoTransaccion(String invTipoTransaccion) {
        this.invTipoTransaccion = invTipoTransaccion;
    }

    public String getInvNombre() {
        return invNombre;
    }

    public void setInvNombre(String invNombre) {
        this.invNombre = invNombre;
    }

    public String getInvDescripcion() {
        return invDescripcion;
    }

    public void setInvDescripcion(String invDescripcion) {
        this.invDescripcion = invDescripcion;
    }

    public Integer getInvCantidad() {
        return invCantidad;
    }

    public void setInvCantidad(Integer invCantidad) {
        this.invCantidad = invCantidad;
    }

    public BigDecimal getInvPrecio() {
        return invPrecio;
    }

    public void setInvPrecio(BigDecimal invPrecio) {
        this.invPrecio = invPrecio;
    }

    public String getInvEstado() {
        return invEstado;
    }

    public void setInvEstado(String invEstado) {
        this.invEstado = invEstado;
    }

    public String getInvImagen() {
        return invImagen;
    }

    public void setInvImagen(String invImagen) {
        this.invImagen = invImagen;
    }

    public Date getInvFechCrea() {
        return invFechCrea;
    }

    public void setInvFechCrea(Date invFechCrea) {
        this.invFechCrea = invFechCrea;
    }

    public String getInvUsuaCrea() {
        return invUsuaCrea;
    }

    public void setInvUsuaCrea(String invUsuaCrea) {
        this.invUsuaCrea = invUsuaCrea;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public CatalogoProducto getCatalogoProducto() {
        return catalogoProducto;
    }

    public void setCatalogoProducto(CatalogoProducto catalogoProducto) {
        this.catalogoProducto = catalogoProducto;
    }

    public ConsolaInventario getConsolaInventario() {
        return consolaInventario;
    }

    public void setConsolaInventario(ConsolaInventario consolaInventario) {
        this.consolaInventario = consolaInventario;
    }

    public List<InventarioDetalle> getInventarioDetalleList() {
        return inventarioDetalleList;
    }

    public void setInventarioDetalleList(List<InventarioDetalle> inventarioDetalleList) {
        this.inventarioDetalleList = inventarioDetalleList;
    }

    public List<DetalleCompraProveedor> getDetalleCompraProveedorList() {
        return detalleCompraProveedorList;
    }

    public void setDetalleCompraProveedorList(List<DetalleCompraProveedor> detalleCompraProveedorList) {
        this.detalleCompraProveedorList = detalleCompraProveedorList;
    }

    public List<DanioInventario> getDanioInventarioList() {
        return danioInventarioList;
    }

    public void setDanioInventarioList(List<DanioInventario> danioInventarioList) {
        this.danioInventarioList = danioInventarioList;
    }

    public List<DetalleDescuento> getDetalleDescuentoList() {
        return detalleDescuentoList;
    }

    public void setDetalleDescuentoList(List<DetalleDescuento> detalleDescuentoList) {
        this.detalleDescuentoList = detalleDescuentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invCorr != null ? invCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventario)) {
            return false;
        }
        Inventario other = (Inventario) object;
        if ((this.invCorr == null && other.invCorr != null) || (this.invCorr != null && !this.invCorr.equals(other.invCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Inventario[invCorr=" + invCorr + "]";
    }

}
