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
@Table(name = "CARGO")
@NamedQueries({
    @NamedQuery(name = "Cargo.findAll", query = "SELECT c FROM Cargo c"),
    @NamedQuery(name = "Cargo.findByCrgCorr", query = "SELECT c FROM Cargo c WHERE c.crgCorr = :crgCorr"),
    @NamedQuery(name = "Cargo.findByCrgNombre", query = "SELECT c FROM Cargo c WHERE c.crgNombre = :crgNombre"),
    @NamedQuery(name = "Cargo.findByCrgFuncion", query = "SELECT c FROM Cargo c WHERE c.crgFuncion = :crgFuncion"),
    @NamedQuery(name = "Cargo.findByCrgFechCrea", query = "SELECT c FROM Cargo c WHERE c.crgFechCrea = :crgFechCrea"),
    @NamedQuery(name = "Cargo.findByCrgUsuaCrea", query = "SELECT c FROM Cargo c WHERE c.crgUsuaCrea = :crgUsuaCrea")})
public class Cargo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRG_CORR")
    private Integer crgCorr;
    @Column(name = "CRG_NOMBRE")
    private String crgNombre;
    @Column(name = "CRG_FUNCION")
    private String crgFuncion;
    @Column(name = "CRG_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date crgFechCrea;
    @Column(name = "CRG_USUA_CREA")
    private String crgUsuaCrea;
    @OneToMany(mappedBy = "cargo")
    private List<Empleado> empleadoList;
    @JoinColumn(name = "CRG_ARE_CORR", referencedColumnName = "ARE_CORR")
    @ManyToOne
    private Area area;

    public Cargo() {
    }

    public Cargo(Integer crgCorr) {
        this.crgCorr = crgCorr;
    }

    public Integer getCrgCorr() {
        return crgCorr;
    }

    public void setCrgCorr(Integer crgCorr) {
        this.crgCorr = crgCorr;
    }

    public String getCrgNombre() {
        return crgNombre;
    }

    public void setCrgNombre(String crgNombre) {
        this.crgNombre = crgNombre;
    }

    public String getCrgFuncion() {
        return crgFuncion;
    }

    public void setCrgFuncion(String crgFuncion) {
        this.crgFuncion = crgFuncion;
    }

    public Date getCrgFechCrea() {
        return crgFechCrea;
    }

    public void setCrgFechCrea(Date crgFechCrea) {
        this.crgFechCrea = crgFechCrea;
    }

    public String getCrgUsuaCrea() {
        return crgUsuaCrea;
    }

    public void setCrgUsuaCrea(String crgUsuaCrea) {
        this.crgUsuaCrea = crgUsuaCrea;
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crgCorr != null ? crgCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargo)) {
            return false;
        }
        Cargo other = (Cargo) object;
        if ((this.crgCorr == null && other.crgCorr != null) || (this.crgCorr != null && !this.crgCorr.equals(other.crgCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Cargo[crgCorr=" + crgCorr + "]";
    }

}
