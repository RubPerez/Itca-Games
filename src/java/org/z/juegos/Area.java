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
@Table(name = "AREA")
@NamedQueries({
    @NamedQuery(name = "Area.findAll", query = "SELECT a FROM Area a"),
    @NamedQuery(name = "Area.findByAreCorr", query = "SELECT a FROM Area a WHERE a.areCorr = :areCorr"),
    @NamedQuery(name = "Area.findByAreNombre", query = "SELECT a FROM Area a WHERE a.areNombre = :areNombre"),
    @NamedQuery(name = "Area.findByAreFechCrea", query = "SELECT a FROM Area a WHERE a.areFechCrea = :areFechCrea"),
    @NamedQuery(name = "Area.findByAreUsuaCrea", query = "SELECT a FROM Area a WHERE a.areUsuaCrea = :areUsuaCrea")})
public class Area implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ARE_CORR")
    private Integer areCorr;
    @Column(name = "ARE_NOMBRE")
    private String areNombre;
    @Column(name = "ARE_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date areFechCrea;
    @Column(name = "ARE_USUA_CREA")
    private String areUsuaCrea;
    @OneToMany(mappedBy = "area")
    private List<Cargo> cargoList;

    public Area() {
    }

    public Area(Integer areCorr) {
        this.areCorr = areCorr;
    }

    public Integer getAreCorr() {
        return areCorr;
    }

    public void setAreCorr(Integer areCorr) {
        this.areCorr = areCorr;
    }

    public String getAreNombre() {
        return areNombre;
    }

    public void setAreNombre(String areNombre) {
        this.areNombre = areNombre;
    }

    public Date getAreFechCrea() {
        return areFechCrea;
    }

    public void setAreFechCrea(Date areFechCrea) {
        this.areFechCrea = areFechCrea;
    }

    public String getAreUsuaCrea() {
        return areUsuaCrea;
    }

    public void setAreUsuaCrea(String areUsuaCrea) {
        this.areUsuaCrea = areUsuaCrea;
    }

    public List<Cargo> getCargoList() {
        return cargoList;
    }

    public void setCargoList(List<Cargo> cargoList) {
        this.cargoList = cargoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (areCorr != null ? areCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Area)) {
            return false;
        }
        Area other = (Area) object;
        if ((this.areCorr == null && other.areCorr != null) || (this.areCorr != null && !this.areCorr.equals(other.areCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Area[areCorr=" + areCorr + "]";
    }

}
