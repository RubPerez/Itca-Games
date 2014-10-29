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
@Table(name = "GENERO_JUEGO")
@NamedQueries({
    @NamedQuery(name = "GeneroJuego.findAll", query = "SELECT g FROM GeneroJuego g"),
    @NamedQuery(name = "GeneroJuego.findByGnjCorr", query = "SELECT g FROM GeneroJuego g WHERE g.gnjCorr = :gnjCorr"),
    @NamedQuery(name = "GeneroJuego.findByGnjNombre", query = "SELECT g FROM GeneroJuego g WHERE g.gnjNombre = :gnjNombre"),
    @NamedQuery(name = "GeneroJuego.findByGnjFechCrea", query = "SELECT g FROM GeneroJuego g WHERE g.gnjFechCrea = :gnjFechCrea"),
    @NamedQuery(name = "GeneroJuego.findByGnjUsuaCrea", query = "SELECT g FROM GeneroJuego g WHERE g.gnjUsuaCrea = :gnjUsuaCrea")})
public class GeneroJuego implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GNJ_CORR")
    private Integer gnjCorr;
    @Column(name = "GNJ_NOMBRE")
    private String gnjNombre;
    @Column(name = "GNJ_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date gnjFechCrea;
    @Column(name = "GNJ_USUA_CREA")
    private String gnjUsuaCrea;
    @OneToMany(mappedBy = "generoJuego")
    private List<ProductoGenero> productoGeneroList;

    public GeneroJuego() {
    }

    public GeneroJuego(Integer gnjCorr) {
        this.gnjCorr = gnjCorr;
    }

    public Integer getGnjCorr() {
        return gnjCorr;
    }

    public void setGnjCorr(Integer gnjCorr) {
        this.gnjCorr = gnjCorr;
    }

    public String getGnjNombre() {
        return gnjNombre;
    }

    public void setGnjNombre(String gnjNombre) {
        this.gnjNombre = gnjNombre;
    }

    public Date getGnjFechCrea() {
        return gnjFechCrea;
    }

    public void setGnjFechCrea(Date gnjFechCrea) {
        this.gnjFechCrea = gnjFechCrea;
    }

    public String getGnjUsuaCrea() {
        return gnjUsuaCrea;
    }

    public void setGnjUsuaCrea(String gnjUsuaCrea) {
        this.gnjUsuaCrea = gnjUsuaCrea;
    }

    public List<ProductoGenero> getProductoGeneroList() {
        return productoGeneroList;
    }

    public void setProductoGeneroList(List<ProductoGenero> productoGeneroList) {
        this.productoGeneroList = productoGeneroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gnjCorr != null ? gnjCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeneroJuego)) {
            return false;
        }
        GeneroJuego other = (GeneroJuego) object;
        if ((this.gnjCorr == null && other.gnjCorr != null) || (this.gnjCorr != null && !this.gnjCorr.equals(other.gnjCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.GeneroJuego[gnjCorr=" + gnjCorr + "]";
    }

}
