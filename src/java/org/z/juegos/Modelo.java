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
@Table(name = "MODELO")
@NamedQueries({
    @NamedQuery(name = "Modelo.findAll", query = "SELECT m FROM Modelo m"),
    @NamedQuery(name = "Modelo.findByModCorr", query = "SELECT m FROM Modelo m WHERE m.modCorr = :modCorr"),
    @NamedQuery(name = "Modelo.findByModNombre", query = "SELECT m FROM Modelo m WHERE m.modNombre = :modNombre"),
    @NamedQuery(name = "Modelo.findByModFechCrea", query = "SELECT m FROM Modelo m WHERE m.modFechCrea = :modFechCrea"),
    @NamedQuery(name = "Modelo.findByModUsuaCrea", query = "SELECT m FROM Modelo m WHERE m.modUsuaCrea = :modUsuaCrea")})
public class Modelo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MOD_CORR")
    private Integer modCorr;
    @Column(name = "MOD_NOMBRE")
    private String modNombre;
    @Column(name = "MOD_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date modFechCrea;
    @Column(name = "MOD_USUA_CREA")
    private String modUsuaCrea;
    @OneToMany(mappedBy = "modelo")
    private List<Inventario> inventarioList;

    public Modelo() {
    }

    public Modelo(Integer modCorr) {
        this.modCorr = modCorr;
    }

    public Integer getModCorr() {
        return modCorr;
    }

    public void setModCorr(Integer modCorr) {
        this.modCorr = modCorr;
    }

    public String getModNombre() {
        return modNombre;
    }

    public void setModNombre(String modNombre) {
        this.modNombre = modNombre;
    }

    public Date getModFechCrea() {
        return modFechCrea;
    }

    public void setModFechCrea(Date modFechCrea) {
        this.modFechCrea = modFechCrea;
    }

    public String getModUsuaCrea() {
        return modUsuaCrea;
    }

    public void setModUsuaCrea(String modUsuaCrea) {
        this.modUsuaCrea = modUsuaCrea;
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
        hash += (modCorr != null ? modCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modelo)) {
            return false;
        }
        Modelo other = (Modelo) object;
        if ((this.modCorr == null && other.modCorr != null) || (this.modCorr != null && !this.modCorr.equals(other.modCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Modelo[modCorr=" + modCorr + "]";
    }

}
