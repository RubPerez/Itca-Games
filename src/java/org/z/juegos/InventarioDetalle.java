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
@Table(name = "INVENTARIO_DETALLE")
@NamedQueries({
    @NamedQuery(name = "InventarioDetalle.findAll", query = "SELECT i FROM InventarioDetalle i"),
    @NamedQuery(name = "InventarioDetalle.findByDepCodigo", query = "SELECT i FROM InventarioDetalle i WHERE i.depCodigo = :depCodigo"),
    @NamedQuery(name = "InventarioDetalle.findByDepSerie", query = "SELECT i FROM InventarioDetalle i WHERE i.depSerie = :depSerie"),
    @NamedQuery(name = "InventarioDetalle.findByDepDescripcion", query = "SELECT i FROM InventarioDetalle i WHERE i.depDescripcion = :depDescripcion"),
    @NamedQuery(name = "InventarioDetalle.findByDepCiclovida", query = "SELECT i FROM InventarioDetalle i WHERE i.depCiclovida = :depCiclovida"),
    @NamedQuery(name = "InventarioDetalle.findByDepFechCrea", query = "SELECT i FROM InventarioDetalle i WHERE i.depFechCrea = :depFechCrea"),
    @NamedQuery(name = "InventarioDetalle.findByDepUsuaCrea", query = "SELECT i FROM InventarioDetalle i WHERE i.depUsuaCrea = :depUsuaCrea")})
public class InventarioDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DEP_CODIGO")
    private Integer depCodigo;
    @Column(name = "DEP_SERIE")
    private String depSerie;
    @Column(name = "DEP_DESCRIPCION")
    private String depDescripcion;
    @Column(name = "DEP_CICLOVIDA")
    private String depCiclovida;
    @Column(name = "DEP_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date depFechCrea;
    @Column(name = "DEP_USUA_CREA")
    private String depUsuaCrea;
    @OneToMany(mappedBy = "inventarioDetalle")
    private List<Alquiler> alquilerList;
    @OneToMany(mappedBy = "inventarioDetalle")
    private List<DetalleVenta> detalleVentaList;
    @JoinColumn(name = "DEP_INV_CORR", referencedColumnName = "INV_CORR")
    @ManyToOne
    private Inventario inventario;
    @OneToMany(mappedBy = "inventarioDetalle")
    private List<Devolucion> devolucionList;

    public InventarioDetalle() {
    }

    public InventarioDetalle(Integer depCodigo) {
        this.depCodigo = depCodigo;
    }

    public Integer getDepCodigo() {
        return depCodigo;
    }

    public void setDepCodigo(Integer depCodigo) {
        this.depCodigo = depCodigo;
    }

    public String getDepSerie() {
        return depSerie;
    }

    public void setDepSerie(String depSerie) {
        this.depSerie = depSerie;
    }

    public String getDepDescripcion() {
        return depDescripcion;
    }

    public void setDepDescripcion(String depDescripcion) {
        this.depDescripcion = depDescripcion;
    }

    public String getDepCiclovida() {
        return depCiclovida;
    }

    public void setDepCiclovida(String depCiclovida) {
        this.depCiclovida = depCiclovida;
    }

    public Date getDepFechCrea() {
        return depFechCrea;
    }

    public void setDepFechCrea(Date depFechCrea) {
        this.depFechCrea = depFechCrea;
    }

    public String getDepUsuaCrea() {
        return depUsuaCrea;
    }

    public void setDepUsuaCrea(String depUsuaCrea) {
        this.depUsuaCrea = depUsuaCrea;
    }

    public List<Alquiler> getAlquilerList() {
        return alquilerList;
    }

    public void setAlquilerList(List<Alquiler> alquilerList) {
        this.alquilerList = alquilerList;
    }

    public List<DetalleVenta> getDetalleVentaList() {
        return detalleVentaList;
    }

    public void setDetalleVentaList(List<DetalleVenta> detalleVentaList) {
        this.detalleVentaList = detalleVentaList;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public List<Devolucion> getDevolucionList() {
        return devolucionList;
    }

    public void setDevolucionList(List<Devolucion> devolucionList) {
        this.devolucionList = devolucionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depCodigo != null ? depCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventarioDetalle)) {
            return false;
        }
        InventarioDetalle other = (InventarioDetalle) object;
        if ((this.depCodigo == null && other.depCodigo != null) || (this.depCodigo != null && !this.depCodigo.equals(other.depCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.InventarioDetalle[depCodigo=" + depCodigo + "]";
    }

}
