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
@Table(name = "MARCA")
@NamedQueries({
    @NamedQuery(name = "Marca.findAll", query = "SELECT m FROM Marca m"),
    @NamedQuery(name = "Marca.findByMarCorr", query = "SELECT m FROM Marca m WHERE m.marCorr = :marCorr"),
    @NamedQuery(name = "Marca.findByMarNombre", query = "SELECT m FROM Marca m WHERE m.marNombre = :marNombre"),
    @NamedQuery(name = "Marca.findByMarFechCrea", query = "SELECT m FROM Marca m WHERE m.marFechCrea = :marFechCrea"),
    @NamedQuery(name = "Marca.findByMarUsuaCrea", query = "SELECT m FROM Marca m WHERE m.marUsuaCrea = :marUsuaCrea")})
public class Marca implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MAR_CORR")
    private Integer marCorr;
    @Column(name = "MAR_NOMBRE")
    private String marNombre;
    @Column(name = "MAR_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date marFechCrea;
    @Column(name = "MAR_USUA_CREA")
    private String marUsuaCrea;
    @OneToMany(mappedBy = "marca")
    private List<Inventario> inventarioList;

    public Marca() {
    }

    public Marca(Integer marCorr) {
        this.marCorr = marCorr;
    }

    public Integer getMarCorr() {
        return marCorr;
    }

    public void setMarCorr(Integer marCorr) {
        this.marCorr = marCorr;
    }

    public String getMarNombre() {
        return marNombre;
    }

    public void setMarNombre(String marNombre) {
        this.marNombre = marNombre;
    }

    public Date getMarFechCrea() {
        return marFechCrea;
    }

    public void setMarFechCrea(Date marFechCrea) {
        this.marFechCrea = marFechCrea;
    }

    public String getMarUsuaCrea() {
        return marUsuaCrea;
    }

    public void setMarUsuaCrea(String marUsuaCrea) {
        this.marUsuaCrea = marUsuaCrea;
    }

    public List<Inventario> getInventarioList() {
        return inventarioList;
    }

    public void setInventarioList(List<Inventario> inventarioList) {
        this.inventarioList = inventarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marCorr != null ? marCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marca)) {
            return false;
        }
        Marca other = (Marca) object;
        if ((this.marCorr == null && other.marCorr != null) || (this.marCorr != null && !this.marCorr.equals(other.marCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Marca[marCorr=" + marCorr + "]";
    }

}
