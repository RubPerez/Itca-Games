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
@Table(name = "TIPO_PRODUCTO")
@NamedQueries({
    @NamedQuery(name = "TipoProducto.findAll", query = "SELECT t FROM TipoProducto t"),
    @NamedQuery(name = "TipoProducto.findByTppCorr", query = "SELECT t FROM TipoProducto t WHERE t.tppCorr = :tppCorr"),
    @NamedQuery(name = "TipoProducto.findByTppNombre", query = "SELECT t FROM TipoProducto t WHERE t.tppNombre = :tppNombre"),
    @NamedQuery(name = "TipoProducto.findByTppFechCrea", query = "SELECT t FROM TipoProducto t WHERE t.tppFechCrea = :tppFechCrea"),
    @NamedQuery(name = "TipoProducto.findByTppUsuaCrea", query = "SELECT t FROM TipoProducto t WHERE t.tppUsuaCrea = :tppUsuaCrea")})
public class TipoProducto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPP_CORR")
    private Integer tppCorr;
    @Column(name = "TPP_NOMBRE")
    private String tppNombre;
    @Column(name = "TPP_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date tppFechCrea;
    @Column(name = "TPP_USUA_CREA")
    private String tppUsuaCrea;
    @OneToMany(mappedBy = "tipoProducto")
    private List<CatalogoProducto> catalogoProductoList;

    public TipoProducto() {
    }

    public TipoProducto(Integer tppCorr) {
        this.tppCorr = tppCorr;
    }

    public Integer getTppCorr() {
        return tppCorr;
    }

    public void setTppCorr(Integer tppCorr) {
        this.tppCorr = tppCorr;
    }

    public String getTppNombre() {
        return tppNombre;
    }

    public void setTppNombre(String tppNombre) {
        this.tppNombre = tppNombre;
    }

    public Date getTppFechCrea() {
        return tppFechCrea;
    }

    public void setTppFechCrea(Date tppFechCrea) {
        this.tppFechCrea = tppFechCrea;
    }

    public String getTppUsuaCrea() {
        return tppUsuaCrea;
    }

    public void setTppUsuaCrea(String tppUsuaCrea) {
        this.tppUsuaCrea = tppUsuaCrea;
    }

    public List<CatalogoProducto> getCatalogoProductoList() {
        return catalogoProductoList;
    }

    public void setCatalogoProductoList(List<CatalogoProducto> catalogoProductoList) {
        this.catalogoProductoList = catalogoProductoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tppCorr != null ? tppCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoProducto)) {
            return false;
        }
        TipoProducto other = (TipoProducto) object;
        if ((this.tppCorr == null && other.tppCorr != null) || (this.tppCorr != null && !this.tppCorr.equals(other.tppCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.TipoProducto[tppCorr=" + tppCorr + "]";
    }

}
