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
@Table(name = "SUCURSAL")
@NamedQueries({
    @NamedQuery(name = "Sucursal.findAll", query = "SELECT s FROM Sucursal s"),
    @NamedQuery(name = "Sucursal.findBySucCorr", query = "SELECT s FROM Sucursal s WHERE s.sucCorr = :sucCorr"),
    @NamedQuery(name = "Sucursal.findBySucNombre", query = "SELECT s FROM Sucursal s WHERE s.sucNombre = :sucNombre"),
    @NamedQuery(name = "Sucursal.findBySucDireccion", query = "SELECT s FROM Sucursal s WHERE s.sucDireccion = :sucDireccion"),
    @NamedQuery(name = "Sucursal.findBySucTelefono", query = "SELECT s FROM Sucursal s WHERE s.sucTelefono = :sucTelefono"),
    @NamedQuery(name = "Sucursal.findBySucFechCrea", query = "SELECT s FROM Sucursal s WHERE s.sucFechCrea = :sucFechCrea"),
    @NamedQuery(name = "Sucursal.findBySucUsuaCrea", query = "SELECT s FROM Sucursal s WHERE s.sucUsuaCrea = :sucUsuaCrea")})
public class Sucursal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUC_CORR")
    private Integer sucCorr;
    @Column(name = "SUC_NOMBRE")
    private String sucNombre;
    @Column(name = "SUC_DIRECCION")
    private String sucDireccion;
    @Column(name = "SUC_TELEFONO")
    private String sucTelefono;
    @Column(name = "SUC_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date sucFechCrea;
    @Column(name = "SUC_USUA_CREA")
    private String sucUsuaCrea;
    @OneToMany(mappedBy = "sucursal")
    private List<Empleado> empleadoList;
    @OneToMany(mappedBy = "sucursal")
    private List<Inventario> inventarioList;
    @OneToMany(mappedBy = "sucursal")
    private List<DetalleDescuento> detalleDescuentoList;

    public Sucursal() {
    }

    public Sucursal(Integer sucCorr) {
        this.sucCorr = sucCorr;
    }

    public Integer getSucCorr() {
        return sucCorr;
    }

    public void setSucCorr(Integer sucCorr) {
        this.sucCorr = sucCorr;
    }

    public String getSucNombre() {
        return sucNombre;
    }

    public void setSucNombre(String sucNombre) {
        this.sucNombre = sucNombre;
    }

    public String getSucDireccion() {
        return sucDireccion;
    }

    public void setSucDireccion(String sucDireccion) {
        this.sucDireccion = sucDireccion;
    }

    public String getSucTelefono() {
        return sucTelefono;
    }

    public void setSucTelefono(String sucTelefono) {
        this.sucTelefono = sucTelefono;
    }

    public Date getSucFechCrea() {
        return sucFechCrea;
    }

    public void setSucFechCrea(Date sucFechCrea) {
        this.sucFechCrea = sucFechCrea;
    }

    public String getSucUsuaCrea() {
        return sucUsuaCrea;
    }

    public void setSucUsuaCrea(String sucUsuaCrea) {
        this.sucUsuaCrea = sucUsuaCrea;
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public List<Inventario> getInventarioList() {
        return inventarioList;
    }

    public void setInventarioList(List<Inventario> inventarioList) {
        this.inventarioList = inventarioList;
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
        hash += (sucCorr != null ? sucCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sucursal)) {
            return false;
        }
        Sucursal other = (Sucursal) object;
        if ((this.sucCorr == null && other.sucCorr != null) || (this.sucCorr != null && !this.sucCorr.equals(other.sucCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Sucursal[sucCorr=" + sucCorr + "]";
    }

}
