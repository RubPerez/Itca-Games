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
@Table(name = "SOLICITUD")
@NamedQueries({
    @NamedQuery(name = "Solicitud.findAll", query = "SELECT s FROM Solicitud s"),
    @NamedQuery(name = "Solicitud.findBySlcCorr", query = "SELECT s FROM Solicitud s WHERE s.slcCorr = :slcCorr"),
    @NamedQuery(name = "Solicitud.findBySlcPrdCorr", query = "SELECT s FROM Solicitud s WHERE s.slcPrdCorr = :slcPrdCorr"),
    @NamedQuery(name = "Solicitud.findBySlcDescripcion", query = "SELECT s FROM Solicitud s WHERE s.slcDescripcion = :slcDescripcion"),
    @NamedQuery(name = "Solicitud.findBySlcEstado", query = "SELECT s FROM Solicitud s WHERE s.slcEstado = :slcEstado"),
    @NamedQuery(name = "Solicitud.findBySlcCicloVida", query = "SELECT s FROM Solicitud s WHERE s.slcCicloVida = :slcCicloVida"),
    @NamedQuery(name = "Solicitud.findBySlcFechCrea", query = "SELECT s FROM Solicitud s WHERE s.slcFechCrea = :slcFechCrea"),
    @NamedQuery(name = "Solicitud.findBySlcUsuaCrea", query = "SELECT s FROM Solicitud s WHERE s.slcUsuaCrea = :slcUsuaCrea")})
public class Solicitud implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SLC_CORR")
    private Integer slcCorr;
    @Column(name = "SLC_PRD_CORR")
    private Integer slcPrdCorr;
    @Column(name = "SLC_DESCRIPCION")
    private String slcDescripcion;
    @Column(name = "SLC_ESTADO")
    private String slcEstado;
    @Column(name = "SLC_CICLO_VIDA")
    private String slcCicloVida;
    @Column(name = "SLC_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date slcFechCrea;
    @Column(name = "SLC_USUA_CREA")
    private String slcUsuaCrea;
    @OneToMany(mappedBy = "solicitud")
    private List<HistoriaSolicitud> historiaSolicitudList;
    @JoinColumn(name = "SLC_PRV_CORR", referencedColumnName = "PRV_CORR")
    @ManyToOne
    private Proveedor proveedor;
    @JoinColumn(name = "SLC_CLT_CORR", referencedColumnName = "CLT_CORR")
    @ManyToOne
    private Cliente cliente;

    public Solicitud() {
    }

    public Solicitud(Integer slcCorr) {
        this.slcCorr = slcCorr;
    }

    public Integer getSlcCorr() {
        return slcCorr;
    }

    public void setSlcCorr(Integer slcCorr) {
        this.slcCorr = slcCorr;
    }

    public Integer getSlcPrdCorr() {
        return slcPrdCorr;
    }

    public void setSlcPrdCorr(Integer slcPrdCorr) {
        this.slcPrdCorr = slcPrdCorr;
    }

    public String getSlcDescripcion() {
        return slcDescripcion;
    }

    public void setSlcDescripcion(String slcDescripcion) {
        this.slcDescripcion = slcDescripcion;
    }

    public String getSlcEstado() {
        return slcEstado;
    }

    public void setSlcEstado(String slcEstado) {
        this.slcEstado = slcEstado;
    }

    public String getSlcCicloVida() {
        return slcCicloVida;
    }

    public void setSlcCicloVida(String slcCicloVida) {
        this.slcCicloVida = slcCicloVida;
    }

    public Date getSlcFechCrea() {
        return slcFechCrea;
    }

    public void setSlcFechCrea(Date slcFechCrea) {
        this.slcFechCrea = slcFechCrea;
    }

    public String getSlcUsuaCrea() {
        return slcUsuaCrea;
    }

    public void setSlcUsuaCrea(String slcUsuaCrea) {
        this.slcUsuaCrea = slcUsuaCrea;
    }

    public List<HistoriaSolicitud> getHistoriaSolicitudList() {
        return historiaSolicitudList;
    }

    public void setHistoriaSolicitudList(List<HistoriaSolicitud> historiaSolicitudList) {
        this.historiaSolicitudList = historiaSolicitudList;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (slcCorr != null ? slcCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitud)) {
            return false;
        }
        Solicitud other = (Solicitud) object;
        if ((this.slcCorr == null && other.slcCorr != null) || (this.slcCorr != null && !this.slcCorr.equals(other.slcCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Solicitud[slcCorr=" + slcCorr + "]";
    }

}
