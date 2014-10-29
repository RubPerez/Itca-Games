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
@Table(name = "ALQUILER")
@NamedQueries({
    @NamedQuery(name = "Alquiler.findAll", query = "SELECT a FROM Alquiler a"),
    @NamedQuery(name = "Alquiler.findByAlqCorr", query = "SELECT a FROM Alquiler a WHERE a.alqCorr = :alqCorr"),
    @NamedQuery(name = "Alquiler.findByAlqDepSerie", query = "SELECT a FROM Alquiler a WHERE a.alqDepSerie = :alqDepSerie"),
    @NamedQuery(name = "Alquiler.findByAlqFechAlquiler", query = "SELECT a FROM Alquiler a WHERE a.alqFechAlquiler = :alqFechAlquiler"),
    @NamedQuery(name = "Alquiler.findByAlqHoraInicio", query = "SELECT a FROM Alquiler a WHERE a.alqHoraInicio = :alqHoraInicio"),
    @NamedQuery(name = "Alquiler.findByAlqHoraFinalizar", query = "SELECT a FROM Alquiler a WHERE a.alqHoraFinalizar = :alqHoraFinalizar"),
    @NamedQuery(name = "Alquiler.findByAlqPrecio", query = "SELECT a FROM Alquiler a WHERE a.alqPrecio = :alqPrecio"),
    @NamedQuery(name = "Alquiler.findByAlqEstado", query = "SELECT a FROM Alquiler a WHERE a.alqEstado = :alqEstado"),
    @NamedQuery(name = "Alquiler.findByAlqCicloVida", query = "SELECT a FROM Alquiler a WHERE a.alqCicloVida = :alqCicloVida"),
    @NamedQuery(name = "Alquiler.findByAlqFechCrea", query = "SELECT a FROM Alquiler a WHERE a.alqFechCrea = :alqFechCrea"),
    @NamedQuery(name = "Alquiler.findByAlqUsuaCrea", query = "SELECT a FROM Alquiler a WHERE a.alqUsuaCrea = :alqUsuaCrea")})
public class Alquiler implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ALQ_CORR")
    private Integer alqCorr;
    @Column(name = "ALQ_DEP_SERIE")
    private String alqDepSerie;
    @Column(name = "ALQ_FECH_ALQUILER")
    @Temporal(TemporalType.DATE)
    private Date alqFechAlquiler;
    @Column(name = "ALQ_HORA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date alqHoraInicio;
    @Column(name = "ALQ_HORA_FINALIZAR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date alqHoraFinalizar;
    @Column(name = "ALQ_PRECIO")
    private Float alqPrecio;
    @Column(name = "ALQ_ESTADO")
    private String alqEstado;
    @Column(name = "ALQ_CICLO_VIDA")
    private String alqCicloVida;
    @Column(name = "ALQ_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date alqFechCrea;
    @Column(name = "ALQ_USUA_CREA")
    private String alqUsuaCrea;
    @JoinColumn(name = "ALQ_DEP_COGIGO", referencedColumnName = "DEP_CODIGO")
    @ManyToOne
    private InventarioDetalle inventarioDetalle;
    @JoinColumn(name = "ALQ_CLT_CORR", referencedColumnName = "CLT_CORR")
    @ManyToOne
    private Cliente cliente;
    @OneToMany(mappedBy = "alquiler")
    private List<HistorialAlquiler> historialAlquilerList;
    @OneToMany(mappedBy = "alquiler")
    private List<Venta> ventaList;

    public Alquiler() {
    }

    public Alquiler(Integer alqCorr) {
        this.alqCorr = alqCorr;
    }

    public Integer getAlqCorr() {
        return alqCorr;
    }

    public void setAlqCorr(Integer alqCorr) {
        this.alqCorr = alqCorr;
    }

    public String getAlqDepSerie() {
        return alqDepSerie;
    }

    public void setAlqDepSerie(String alqDepSerie) {
        this.alqDepSerie = alqDepSerie;
    }

    public Date getAlqFechAlquiler() {
        return alqFechAlquiler;
    }

    public void setAlqFechAlquiler(Date alqFechAlquiler) {
        this.alqFechAlquiler = alqFechAlquiler;
    }

    public Date getAlqHoraInicio() {
        return alqHoraInicio;
    }

    public void setAlqHoraInicio(Date alqHoraInicio) {
        this.alqHoraInicio = alqHoraInicio;
    }

    public Date getAlqHoraFinalizar() {
        return alqHoraFinalizar;
    }

    public void setAlqHoraFinalizar(Date alqHoraFinalizar) {
        this.alqHoraFinalizar = alqHoraFinalizar;
    }

    public Float getAlqPrecio() {
        return alqPrecio;
    }

    public void setAlqPrecio(Float alqPrecio) {
        this.alqPrecio = alqPrecio;
    }

    public String getAlqEstado() {
        return alqEstado;
    }

    public void setAlqEstado(String alqEstado) {
        this.alqEstado = alqEstado;
    }

    public String getAlqCicloVida() {
        return alqCicloVida;
    }

    public void setAlqCicloVida(String alqCicloVida) {
        this.alqCicloVida = alqCicloVida;
    }

    public Date getAlqFechCrea() {
        return alqFechCrea;
    }

    public void setAlqFechCrea(Date alqFechCrea) {
        this.alqFechCrea = alqFechCrea;
    }

    public String getAlqUsuaCrea() {
        return alqUsuaCrea;
    }

    public void setAlqUsuaCrea(String alqUsuaCrea) {
        this.alqUsuaCrea = alqUsuaCrea;
    }

    public InventarioDetalle getInventarioDetalle() {
        return inventarioDetalle;
    }

    public void setInventarioDetalle(InventarioDetalle inventarioDetalle) {
        this.inventarioDetalle = inventarioDetalle;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<HistorialAlquiler> getHistorialAlquilerList() {
        return historialAlquilerList;
    }

    public void setHistorialAlquilerList(List<HistorialAlquiler> historialAlquilerList) {
        this.historialAlquilerList = historialAlquilerList;
    }

    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alqCorr != null ? alqCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alquiler)) {
            return false;
        }
        Alquiler other = (Alquiler) object;
        if ((this.alqCorr == null && other.alqCorr != null) || (this.alqCorr != null && !this.alqCorr.equals(other.alqCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Alquiler[alqCorr=" + alqCorr + "]";
    }

}
