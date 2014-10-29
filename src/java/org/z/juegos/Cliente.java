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
@Table(name = "CLIENTE")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCltCorr", query = "SELECT c FROM Cliente c WHERE c.cltCorr = :cltCorr"),
    @NamedQuery(name = "Cliente.findByCltNombre", query = "SELECT c FROM Cliente c WHERE c.cltNombre = :cltNombre"),
    @NamedQuery(name = "Cliente.findByCltApellido", query = "SELECT c FROM Cliente c WHERE c.cltApellido = :cltApellido"),
    @NamedQuery(name = "Cliente.findByCltNumDocumento", query = "SELECT c FROM Cliente c WHERE c.cltNumDocumento = :cltNumDocumento"),
    @NamedQuery(name = "Cliente.findByCltTelefono", query = "SELECT c FROM Cliente c WHERE c.cltTelefono = :cltTelefono"),
    @NamedQuery(name = "Cliente.findByCltEmail", query = "SELECT c FROM Cliente c WHERE c.cltEmail = :cltEmail"),
    @NamedQuery(name = "Cliente.findByCltCicloVida", query = "SELECT c FROM Cliente c WHERE c.cltCicloVida = :cltCicloVida"),
    @NamedQuery(name = "Cliente.findByCltStatus", query = "SELECT c FROM Cliente c WHERE c.cltStatus = :cltStatus"),
    @NamedQuery(name = "Cliente.findByCltFechCrea", query = "SELECT c FROM Cliente c WHERE c.cltFechCrea = :cltFechCrea"),
    @NamedQuery(name = "Cliente.findByCltUsuaCrea", query = "SELECT c FROM Cliente c WHERE c.cltUsuaCrea = :cltUsuaCrea")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLT_CORR")
    private Integer cltCorr;
    @Column(name = "CLT_NOMBRE")
    private String cltNombre;
    @Column(name = "CLT_APELLIDO")
    private String cltApellido;
    @Column(name = "CLT_NUM_DOCUMENTO")
    private String cltNumDocumento;
    @Column(name = "CLT_TELEFONO")
    private String cltTelefono;
    @Column(name = "CLT_EMAIL")
    private String cltEmail;
    @Column(name = "CLT_CICLO_VIDA")
    private String cltCicloVida;
    @Column(name = "CLT_STATUS")
    private String cltStatus;
    @Column(name = "CLT_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date cltFechCrea;
    @Column(name = "CLT_USUA_CREA")
    private String cltUsuaCrea;
    @OneToMany(mappedBy = "cliente")
    private List<Alquiler> alquilerList;
    @OneToMany(mappedBy = "cliente")
    private List<Solicitud> solicitudList;
    @OneToMany(mappedBy = "cliente")
    private List<Venta> ventaList;
    @JoinColumn(name = "CLT_MEM_CORR", referencedColumnName = "MEM_CORR")
    @ManyToOne
    private Membresia membresia;

    public Cliente() {
    }

    public Cliente(Integer cltCorr) {
        this.cltCorr = cltCorr;
    }

    public Integer getCltCorr() {
        return cltCorr;
    }

    public void setCltCorr(Integer cltCorr) {
        this.cltCorr = cltCorr;
    }

    public String getCltNombre() {
        return cltNombre;
    }

    public void setCltNombre(String cltNombre) {
        this.cltNombre = cltNombre;
    }

    public String getCltApellido() {
        return cltApellido;
    }

    public void setCltApellido(String cltApellido) {
        this.cltApellido = cltApellido;
    }

    public String getCltNumDocumento() {
        return cltNumDocumento;
    }

    public void setCltNumDocumento(String cltNumDocumento) {
        this.cltNumDocumento = cltNumDocumento;
    }

    public String getCltTelefono() {
        return cltTelefono;
    }

    public void setCltTelefono(String cltTelefono) {
        this.cltTelefono = cltTelefono;
    }

    public String getCltEmail() {
        return cltEmail;
    }

    public void setCltEmail(String cltEmail) {
        this.cltEmail = cltEmail;
    }

    public String getCltCicloVida() {
        return cltCicloVida;
    }

    public void setCltCicloVida(String cltCicloVida) {
        this.cltCicloVida = cltCicloVida;
    }

    public String getCltStatus() {
        return cltStatus;
    }

    public void setCltStatus(String cltStatus) {
        this.cltStatus = cltStatus;
    }

    public Date getCltFechCrea() {
        return cltFechCrea;
    }

    public void setCltFechCrea(Date cltFechCrea) {
        this.cltFechCrea = cltFechCrea;
    }

    public String getCltUsuaCrea() {
        return cltUsuaCrea;
    }

    public void setCltUsuaCrea(String cltUsuaCrea) {
        this.cltUsuaCrea = cltUsuaCrea;
    }

    public List<Alquiler> getAlquilerList() {
        return alquilerList;
    }

    public void setAlquilerList(List<Alquiler> alquilerList) {
        this.alquilerList = alquilerList;
    }

    public List<Solicitud> getSolicitudList() {
        return solicitudList;
    }

    public void setSolicitudList(List<Solicitud> solicitudList) {
        this.solicitudList = solicitudList;
    }

    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cltCorr != null ? cltCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cltCorr == null && other.cltCorr != null) || (this.cltCorr != null && !this.cltCorr.equals(other.cltCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Cliente[cltCorr=" + cltCorr + "]";
    }

}
