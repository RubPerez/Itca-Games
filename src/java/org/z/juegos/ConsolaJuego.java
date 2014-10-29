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
@Table(name = "CONSOLA_JUEGO")
@NamedQueries({
    @NamedQuery(name = "ConsolaJuego.findAll", query = "SELECT c FROM ConsolaJuego c"),
    @NamedQuery(name = "ConsolaJuego.findByCjoCorr", query = "SELECT c FROM ConsolaJuego c WHERE c.cjoCorr = :cjoCorr"),
    @NamedQuery(name = "ConsolaJuego.findByCjoNombre", query = "SELECT c FROM ConsolaJuego c WHERE c.cjoNombre = :cjoNombre"),
    @NamedQuery(name = "ConsolaJuego.findByCjoFechCrea", query = "SELECT c FROM ConsolaJuego c WHERE c.cjoFechCrea = :cjoFechCrea"),
    @NamedQuery(name = "ConsolaJuego.findByCjoUsuaCrea", query = "SELECT c FROM ConsolaJuego c WHERE c.cjoUsuaCrea = :cjoUsuaCrea")})
public class ConsolaJuego implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CJO_CORR")
    private Integer cjoCorr;
    @Column(name = "CJO_NOMBRE")
    private String cjoNombre;
    @Column(name = "CJO_FECH_CREA")
    @Temporal(TemporalType.DATE)
    private Date cjoFechCrea;
    @Column(name = "CJO_USUA_CREA")
    private String cjoUsuaCrea;
    @OneToMany(mappedBy = "consolaJuego")
    private List<ConsolaInventario> consolaInventarioList;

    public ConsolaJuego() {
    }

    public ConsolaJuego(Integer cjoCorr) {
        this.cjoCorr = cjoCorr;
    }

    public Integer getCjoCorr() {
        return cjoCorr;
    }

    public void setCjoCorr(Integer cjoCorr) {
        this.cjoCorr = cjoCorr;
    }

    public String getCjoNombre() {
        return cjoNombre;
    }

    public void setCjoNombre(String cjoNombre) {
        this.cjoNombre = cjoNombre;
    }

    public Date getCjoFechCrea() {
        return cjoFechCrea;
    }

    public void setCjoFechCrea(Date cjoFechCrea) {
        this.cjoFechCrea = cjoFechCrea;
    }

    public String getCjoUsuaCrea() {
        return cjoUsuaCrea;
    }

    public void setCjoUsuaCrea(String cjoUsuaCrea) {
        this.cjoUsuaCrea = cjoUsuaCrea;
    }

    public List<ConsolaInventario> getConsolaInventarioList() {
        return consolaInventarioList;
    }

    public void setConsolaInventarioList(List<ConsolaInventario> consolaInventarioList) {
        this.consolaInventarioList = consolaInventarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cjoCorr != null ? cjoCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsolaJuego)) {
            return false;
        }
        ConsolaJuego other = (ConsolaJuego) object;
        if ((this.cjoCorr == null && other.cjoCorr != null) || (this.cjoCorr != null && !this.cjoCorr.equals(other.cjoCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.ConsolaJuego[cjoCorr=" + cjoCorr + "]";
    }

}
