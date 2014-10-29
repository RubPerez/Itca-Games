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
@Table(name = "MEMBRESIA")
@NamedQueries({
    @NamedQuery(name = "Membresia.findAll", query = "SELECT m FROM Membresia m"),
    @NamedQuery(name = "Membresia.findByMemCorr", query = "SELECT m FROM Membresia m WHERE m.memCorr = :memCorr"),
    @NamedQuery(name = "Membresia.findByMemNombre", query = "SELECT m FROM Membresia m WHERE m.memNombre = :memNombre"),
    @NamedQuery(name = "Membresia.findByMemFlgAceptadevolucion", query = "SELECT m FROM Membresia m WHERE m.memFlgAceptadevolucion = :memFlgAceptadevolucion"),
    @NamedQuery(name = "Membresia.findByMemFechaCrea", query = "SELECT m FROM Membresia m WHERE m.memFechaCrea = :memFechaCrea"),
    @NamedQuery(name = "Membresia.findByMemUsuaCrea", query = "SELECT m FROM Membresia m WHERE m.memUsuaCrea = :memUsuaCrea")})
public class Membresia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MEM_CORR")
    private Integer memCorr;
    @Column(name = "MEM_NOMBRE")
    private String memNombre;
    @Column(name = "MEM_FLG_ACEPTADEVOLUCION")
    private String memFlgAceptadevolucion;
    @Column(name = "MEM_FECHA_CREA")
    @Temporal(TemporalType.DATE)
    private Date memFechaCrea;
    @Column(name = "MEM_USUA_CREA")
    private String memUsuaCrea;
    @OneToMany(mappedBy = "membresia")
    private List<Cliente> clienteList;
    @OneToMany(mappedBy = "membresia")
    private List<DetalleDescuento> detalleDescuentoList;

    public Membresia() {
    }

    public Membresia(Integer memCorr) {
        this.memCorr = memCorr;
    }

    public Integer getMemCorr() {
        return memCorr;
    }

    public void setMemCorr(Integer memCorr) {
        this.memCorr = memCorr;
    }

    public String getMemNombre() {
        return memNombre;
    }

    public void setMemNombre(String memNombre) {
        this.memNombre = memNombre;
    }

    public String getMemFlgAceptadevolucion() {
        return memFlgAceptadevolucion;
    }

    public void setMemFlgAceptadevolucion(String memFlgAceptadevolucion) {
        this.memFlgAceptadevolucion = memFlgAceptadevolucion;
    }

    public Date getMemFechaCrea() {
        return memFechaCrea;
    }

    public void setMemFechaCrea(Date memFechaCrea) {
        this.memFechaCrea = memFechaCrea;
    }

    public String getMemUsuaCrea() {
        return memUsuaCrea;
    }

    public void setMemUsuaCrea(String memUsuaCrea) {
        this.memUsuaCrea = memUsuaCrea;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
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
        hash += (memCorr != null ? memCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Membresia)) {
            return false;
        }
        Membresia other = (Membresia) object;
        if ((this.memCorr == null && other.memCorr != null) || (this.memCorr != null && !this.memCorr.equals(other.memCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Membresia[memCorr=" + memCorr + "]";
    }

}
