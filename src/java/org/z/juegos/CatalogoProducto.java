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
@Table(name = "CATALOGO_PRODUCTO")
@NamedQueries({
    @NamedQuery(name = "CatalogoProducto.findAll", query = "SELECT c FROM CatalogoProducto c"),
    @NamedQuery(name = "CatalogoProducto.findByCtgCorr", query = "SELECT c FROM CatalogoProducto c WHERE c.ctgCorr = :ctgCorr"),
    @NamedQuery(name = "CatalogoProducto.findByCtgNombre", query = "SELECT c FROM CatalogoProducto c WHERE c.ctgNombre = :ctgNombre"),
    @NamedQuery(name = "CatalogoProducto.findByCtgFechCrea", query = "SELECT c FROM CatalogoProducto c WHERE c.ctgFechCrea = :ctgFechCrea"),
    @NamedQuery(name = "CatalogoProducto.findByCtgUsuaCrea", query = "SELECT c FROM CatalogoProducto c WHERE c.ctgUsuaCrea = :ctgUsuaCrea")})
public class CatalogoProducto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CTG_CORR")
    private Integer ctgCorr;
    @Column(name = "CTG_NOMBRE")
    private String ctgNombre;
    @Column(name = "CTG_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date ctgFechCrea;
    @Column(name = "CTG_USUA_CREA")
    private String ctgUsuaCrea;
    @OneToMany(mappedBy = "catalogoProducto")
    private List<Inventario> inventarioList;
    @OneToMany(mappedBy = "catalogoProducto")
    private List<ProductoGenero> productoGeneroList;
    @JoinColumn(name = "CTG_TPP_CORR", referencedColumnName = "TPP_CORR")
    @ManyToOne
    private TipoProducto tipoProducto;

    public CatalogoProducto() {
    }

    public CatalogoProducto(Integer ctgCorr) {
        this.ctgCorr = ctgCorr;
    }

    public Integer getCtgCorr() {
        return ctgCorr;
    }

    public void setCtgCorr(Integer ctgCorr) {
        this.ctgCorr = ctgCorr;
    }

    public String getCtgNombre() {
        return ctgNombre;
    }

    public void setCtgNombre(String ctgNombre) {
        this.ctgNombre = ctgNombre;
    }

    public Date getCtgFechCrea() {
        return ctgFechCrea;
    }

    public void setCtgFechCrea(Date ctgFechCrea) {
        this.ctgFechCrea = ctgFechCrea;
    }

    public String getCtgUsuaCrea() {
        return ctgUsuaCrea;
    }

    public void setCtgUsuaCrea(String ctgUsuaCrea) {
        this.ctgUsuaCrea = ctgUsuaCrea;
    }

    public List<Inventario> getInventarioList() {
        return inventarioList;
    }

    public void setInventarioList(List<Inventario> inventarioList) {
        this.inventarioList = inventarioList;
    }

    public List<ProductoGenero> getProductoGeneroList() {
        return productoGeneroList;
    }

    public void setProductoGeneroList(List<ProductoGenero> productoGeneroList) {
        this.productoGeneroList = productoGeneroList;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ctgCorr != null ? ctgCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoProducto)) {
            return false;
        }
        CatalogoProducto other = (CatalogoProducto) object;
        if ((this.ctgCorr == null && other.ctgCorr != null) || (this.ctgCorr != null && !this.ctgCorr.equals(other.ctgCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.CatalogoProducto[ctgCorr=" + ctgCorr + "]";
    }

}
