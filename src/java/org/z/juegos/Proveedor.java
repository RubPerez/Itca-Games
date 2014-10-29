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
@Table(name = "PROVEEDOR")
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p"),
    @NamedQuery(name = "Proveedor.findByPrvCorr", query = "SELECT p FROM Proveedor p WHERE p.prvCorr = :prvCorr"),
    @NamedQuery(name = "Proveedor.findByPrvNombre", query = "SELECT p FROM Proveedor p WHERE p.prvNombre = :prvNombre"),
    @NamedQuery(name = "Proveedor.findByPrvDireccion", query = "SELECT p FROM Proveedor p WHERE p.prvDireccion = :prvDireccion"),
    @NamedQuery(name = "Proveedor.findByPrvTelefono", query = "SELECT p FROM Proveedor p WHERE p.prvTelefono = :prvTelefono"),
    @NamedQuery(name = "Proveedor.findByPrvEmail", query = "SELECT p FROM Proveedor p WHERE p.prvEmail = :prvEmail"),
    @NamedQuery(name = "Proveedor.findByPrvNit", query = "SELECT p FROM Proveedor p WHERE p.prvNit = :prvNit"),
    @NamedQuery(name = "Proveedor.findByPrvNumReg", query = "SELECT p FROM Proveedor p WHERE p.prvNumReg = :prvNumReg"),
    @NamedQuery(name = "Proveedor.findByPrvRepresentante", query = "SELECT p FROM Proveedor p WHERE p.prvRepresentante = :prvRepresentante"),
    @NamedQuery(name = "Proveedor.findByPrvFechCrea", query = "SELECT p FROM Proveedor p WHERE p.prvFechCrea = :prvFechCrea"),
    @NamedQuery(name = "Proveedor.findByPrvUsuaCrea", query = "SELECT p FROM Proveedor p WHERE p.prvUsuaCrea = :prvUsuaCrea")})
public class Proveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRV_CORR")
    private Integer prvCorr;
    @Column(name = "PRV_NOMBRE")
    private String prvNombre;
    @Column(name = "PRV_DIRECCION")
    private String prvDireccion;
    @Column(name = "PRV_TELEFONO")
    private String prvTelefono;
    @Column(name = "PRV_EMAIL")
    private String prvEmail;
    @Column(name = "PRV_NIT")
    private String prvNit;
    @Column(name = "PRV_NUM_REG")
    private String prvNumReg;
    @Column(name = "PRV_REPRESENTANTE")
    private String prvRepresentante;
    @Column(name = "PRV_FECH_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prvFechCrea;
    @Column(name = "PRV_USUA_CREA")
    private String prvUsuaCrea;
    @OneToMany(mappedBy = "proveedor")
    private List<CompraProveedor> compraProveedorList;
    @OneToMany(mappedBy = "proveedor")
    private List<Solicitud> solicitudList;

    public Proveedor() {
    }

    public Proveedor(Integer prvCorr) {
        this.prvCorr = prvCorr;
    }

    public Integer getPrvCorr() {
        return prvCorr;
    }

    public void setPrvCorr(Integer prvCorr) {
        this.prvCorr = prvCorr;
    }

    public String getPrvNombre() {
        return prvNombre;
    }

    public void setPrvNombre(String prvNombre) {
        this.prvNombre = prvNombre;
    }

    public String getPrvDireccion() {
        return prvDireccion;
    }

    public void setPrvDireccion(String prvDireccion) {
        this.prvDireccion = prvDireccion;
    }

    public String getPrvTelefono() {
        return prvTelefono;
    }

    public void setPrvTelefono(String prvTelefono) {
        this.prvTelefono = prvTelefono;
    }

    public String getPrvEmail() {
        return prvEmail;
    }

    public void setPrvEmail(String prvEmail) {
        this.prvEmail = prvEmail;
    }

    public String getPrvNit() {
        return prvNit;
    }

    public void setPrvNit(String prvNit) {
        this.prvNit = prvNit;
    }

    public String getPrvNumReg() {
        return prvNumReg;
    }

    public void setPrvNumReg(String prvNumReg) {
        this.prvNumReg = prvNumReg;
    }

    public String getPrvRepresentante() {
        return prvRepresentante;
    }

    public void setPrvRepresentante(String prvRepresentante) {
        this.prvRepresentante = prvRepresentante;
    }

    public Date getPrvFechCrea() {
        return prvFechCrea;
    }

    public void setPrvFechCrea(Date prvFechCrea) {
        this.prvFechCrea = prvFechCrea;
    }

    public String getPrvUsuaCrea() {
        return prvUsuaCrea;
    }

    public void setPrvUsuaCrea(String prvUsuaCrea) {
        this.prvUsuaCrea = prvUsuaCrea;
    }

    public List<CompraProveedor> getCompraProveedorList() {
        return compraProveedorList;
    }

    public void setCompraProveedorList(List<CompraProveedor> compraProveedorList) {
        this.compraProveedorList = compraProveedorList;
    }

    public List<Solicitud> getSolicitudList() {
        return solicitudList;
    }

    public void setSolicitudList(List<Solicitud> solicitudList) {
        this.solicitudList = solicitudList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prvCorr != null ? prvCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.prvCorr == null && other.prvCorr != null) || (this.prvCorr != null && !this.prvCorr.equals(other.prvCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Proveedor[prvCorr=" + prvCorr + "]";
    }

}
