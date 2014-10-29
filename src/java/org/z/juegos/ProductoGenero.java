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
@Table(name = "PRODUCTO_GENERO")
@NamedQueries({
    @NamedQuery(name = "ProductoGenero.findAll", query = "SELECT p FROM ProductoGenero p"),
    @NamedQuery(name = "ProductoGenero.findByPgnCorr", query = "SELECT p FROM ProductoGenero p WHERE p.pgnCorr = :pgnCorr"),
    @NamedQuery(name = "ProductoGenero.findByPgnNombre", query = "SELECT p FROM ProductoGenero p WHERE p.pgnNombre = :pgnNombre"),
    @NamedQuery(name = "ProductoGenero.findByPgnFechCrea", query = "SELECT p FROM ProductoGenero p WHERE p.pgnFechCrea = :pgnFechCrea"),
    @NamedQuery(name = "ProductoGenero.findByPgnUsuaCrea", query = "SELECT p FROM ProductoGenero p WHERE p.pgnUsuaCrea = :pgnUsuaCrea")})
public class ProductoGenero implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PGN_CORR")
    private Integer pgnCorr;
    @Column(name = "PGN_NOMBRE")
    private String pgnNombre;
    @Column(name = "PGN_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date pgnFechCrea;
    @Column(name = "PGN_USUA_CREA")
    private String pgnUsuaCrea;
    @JoinColumn(name = "PGN_GNJ_CORR", referencedColumnName = "GNJ_CORR")
    @ManyToOne
    private GeneroJuego generoJuego;
    @JoinColumn(name = "PGN_CTG_CORR", referencedColumnName = "CTG_CORR")
    @ManyToOne
    private CatalogoProducto catalogoProducto;

    public ProductoGenero() {
    }

    public ProductoGenero(Integer pgnCorr) {
        this.pgnCorr = pgnCorr;
    }

    public Integer getPgnCorr() {
        return pgnCorr;
    }

    public void setPgnCorr(Integer pgnCorr) {
        this.pgnCorr = pgnCorr;
    }

    public String getPgnNombre() {
        return pgnNombre;
    }

    public void setPgnNombre(String pgnNombre) {
        this.pgnNombre = pgnNombre;
    }

    public Date getPgnFechCrea() {
        return pgnFechCrea;
    }

    public void setPgnFechCrea(Date pgnFechCrea) {
        this.pgnFechCrea = pgnFechCrea;
    }

    public String getPgnUsuaCrea() {
        return pgnUsuaCrea;
    }

    public void setPgnUsuaCrea(String pgnUsuaCrea) {
        this.pgnUsuaCrea = pgnUsuaCrea;
    }

    public GeneroJuego getGeneroJuego() {
        return generoJuego;
    }

    public void setGeneroJuego(GeneroJuego generoJuego) {
        this.generoJuego = generoJuego;
    }

    public CatalogoProducto getCatalogoProducto() {
        return catalogoProducto;
    }

    public void setCatalogoProducto(CatalogoProducto catalogoProducto) {
        this.catalogoProducto = catalogoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pgnCorr != null ? pgnCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoGenero)) {
            return false;
        }
        ProductoGenero other = (ProductoGenero) object;
        if ((this.pgnCorr == null && other.pgnCorr != null) || (this.pgnCorr != null && !this.pgnCorr.equals(other.pgnCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.ProductoGenero[pgnCorr=" + pgnCorr + "]";
    }

}
