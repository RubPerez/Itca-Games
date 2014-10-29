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
@Table(name = "DANIO")
@NamedQueries({
    @NamedQuery(name = "Danio.findAll", query = "SELECT d FROM Danio d"),
    @NamedQuery(name = "Danio.findByDanCodigo", query = "SELECT d FROM Danio d WHERE d.danCodigo = :danCodigo"),
    @NamedQuery(name = "Danio.findByDanNombre", query = "SELECT d FROM Danio d WHERE d.danNombre = :danNombre"),
    @NamedQuery(name = "Danio.findByDanEstado", query = "SELECT d FROM Danio d WHERE d.danEstado = :danEstado"),
    @NamedQuery(name = "Danio.findByDanFechCrea", query = "SELECT d FROM Danio d WHERE d.danFechCrea = :danFechCrea"),
    @NamedQuery(name = "Danio.findByDanUsuaCrea", query = "SELECT d FROM Danio d WHERE d.danUsuaCrea = :danUsuaCrea")})
public class Danio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DAN_CODIGO")
    private Integer danCodigo;
    @Column(name = "DAN_NOMBRE")
    private String danNombre;
    @Column(name = "DAN_ESTADO")
    private String danEstado;
    @Column(name = "DAN_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date danFechCrea;
    @Column(name = "DAN_USUA_CREA")
    private String danUsuaCrea;
    @OneToMany(mappedBy = "danio")
    private List<DanioInventario> danioInventarioList;

    public Danio() {
    }

    public Danio(Integer danCodigo) {
        this.danCodigo = danCodigo;
    }

    public Integer getDanCodigo() {
        return danCodigo;
    }

    public void setDanCodigo(Integer danCodigo) {
        this.danCodigo = danCodigo;
    }

    public String getDanNombre() {
        return danNombre;
    }

    public void setDanNombre(String danNombre) {
        this.danNombre = danNombre;
    }

    public String getDanEstado() {
        return danEstado;
    }

    public void setDanEstado(String danEstado) {
        this.danEstado = danEstado;
    }

    public Date getDanFechCrea() {
        return danFechCrea;
    }

    public void setDanFechCrea(Date danFechCrea) {
        this.danFechCrea = danFechCrea;
    }

    public String getDanUsuaCrea() {
        return danUsuaCrea;
    }

    public void setDanUsuaCrea(String danUsuaCrea) {
        this.danUsuaCrea = danUsuaCrea;
    }

    public List<DanioInventario> getDanioInventarioList() {
        return danioInventarioList;
    }

    public void setDanioInventarioList(List<DanioInventario> danioInventarioList) {
        this.danioInventarioList = danioInventarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (danCodigo != null ? danCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Danio)) {
            return false;
        }
        Danio other = (Danio) object;
        if ((this.danCodigo == null && other.danCodigo != null) || (this.danCodigo != null && !this.danCodigo.equals(other.danCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Danio[danCodigo=" + danCodigo + "]";
    }

}
