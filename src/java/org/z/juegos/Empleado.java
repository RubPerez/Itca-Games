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
@Table(name = "EMPLEADO")
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByEmpCorr", query = "SELECT e FROM Empleado e WHERE e.empCorr = :empCorr"),
    @NamedQuery(name = "Empleado.findByEmpNombre", query = "SELECT e FROM Empleado e WHERE e.empNombre = :empNombre"),
    @NamedQuery(name = "Empleado.findByEmpApellodo", query = "SELECT e FROM Empleado e WHERE e.empApellodo = :empApellodo"),
    @NamedQuery(name = "Empleado.findByEmpTelefono", query = "SELECT e FROM Empleado e WHERE e.empTelefono = :empTelefono"),
    @NamedQuery(name = "Empleado.findByEmpNumDoc", query = "SELECT e FROM Empleado e WHERE e.empNumDoc = :empNumDoc"),
    @NamedQuery(name = "Empleado.findByEmpDireccion", query = "SELECT e FROM Empleado e WHERE e.empDireccion = :empDireccion"),
    @NamedQuery(name = "Empleado.findByEmpEmpEmail", query = "SELECT e FROM Empleado e WHERE e.empEmpEmail = :empEmpEmail"),
    @NamedQuery(name = "Empleado.findByEmpFechNacimiento", query = "SELECT e FROM Empleado e WHERE e.empFechNacimiento = :empFechNacimiento"),
    @NamedQuery(name = "Empleado.findByEmpFechCrea", query = "SELECT e FROM Empleado e WHERE e.empFechCrea = :empFechCrea"),
    @NamedQuery(name = "Empleado.findByEmpUsuaCrea", query = "SELECT e FROM Empleado e WHERE e.empUsuaCrea = :empUsuaCrea")})
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMP_CORR")
    private Integer empCorr;
    @Column(name = "EMP_NOMBRE")
    private String empNombre;
    @Column(name = "EMP_APELLODO")
    private String empApellodo;
    @Column(name = "EMP_TELEFONO")
    private String empTelefono;
    @Column(name = "EMP_NUM_DOC")
    private String empNumDoc;
    @Column(name = "EMP_DIRECCION")
    private String empDireccion;
    @Column(name = "EMP_EMP_EMAIL")
    private String empEmpEmail;
    @Column(name = "EMP_FECH_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date empFechNacimiento;
    @Column(name = "EMP_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date empFechCrea;
    @Column(name = "EMP_USUA_CREA")
    private String empUsuaCrea;
    @JoinColumn(name = "EMP_US_CORR", referencedColumnName = "US_CORR")
    @ManyToOne
    private Usuario usuario;
    @JoinColumn(name = "EMP_SUC_CORR", referencedColumnName = "SUC_CORR")
    @ManyToOne
    private Sucursal sucursal;
    @JoinColumn(name = "EMP_CRG_CORR", referencedColumnName = "CRG_CORR")
    @ManyToOne
    private Cargo cargo;
    @OneToMany(mappedBy = "empleado")
    private List<CompraProveedor> compraProveedorList;

    public Empleado() {
    }

    public Empleado(Integer empCorr) {
        this.empCorr = empCorr;
    }

    public Integer getEmpCorr() {
        return empCorr;
    }

    public void setEmpCorr(Integer empCorr) {
        this.empCorr = empCorr;
    }

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    public String getEmpApellodo() {
        return empApellodo;
    }

    public void setEmpApellodo(String empApellodo) {
        this.empApellodo = empApellodo;
    }

    public String getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }

    public String getEmpNumDoc() {
        return empNumDoc;
    }

    public void setEmpNumDoc(String empNumDoc) {
        this.empNumDoc = empNumDoc;
    }

    public String getEmpDireccion() {
        return empDireccion;
    }

    public void setEmpDireccion(String empDireccion) {
        this.empDireccion = empDireccion;
    }

    public String getEmpEmpEmail() {
        return empEmpEmail;
    }

    public void setEmpEmpEmail(String empEmpEmail) {
        this.empEmpEmail = empEmpEmail;
    }

    public Date getEmpFechNacimiento() {
        return empFechNacimiento;
    }

    public void setEmpFechNacimiento(Date empFechNacimiento) {
        this.empFechNacimiento = empFechNacimiento;
    }

    public Date getEmpFechCrea() {
        return empFechCrea;
    }

    public void setEmpFechCrea(Date empFechCrea) {
        this.empFechCrea = empFechCrea;
    }

    public String getEmpUsuaCrea() {
        return empUsuaCrea;
    }

    public void setEmpUsuaCrea(String empUsuaCrea) {
        this.empUsuaCrea = empUsuaCrea;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<CompraProveedor> getCompraProveedorList() {
        return compraProveedorList;
    }

    public void setCompraProveedorList(List<CompraProveedor> compraProveedorList) {
        this.compraProveedorList = compraProveedorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empCorr != null ? empCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.empCorr == null && other.empCorr != null) || (this.empCorr != null && !this.empCorr.equals(other.empCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Empleado[empCorr=" + empCorr + "]";
    }

}
