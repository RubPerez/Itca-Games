/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.z.juegos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author esosa-ubuntu
 */
@Entity
@Table(name = "ROL")
@NamedQueries({
    @NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r"),
    @NamedQuery(name = "Rol.findByRolCurr", query = "SELECT r FROM Rol r WHERE r.rolCurr = :rolCurr"),
    @NamedQuery(name = "Rol.findByRolTipo", query = "SELECT r FROM Rol r WHERE r.rolTipo = :rolTipo"),
    @NamedQuery(name = "Rol.findByRolDescripcion", query = "SELECT r FROM Rol r WHERE r.rolDescripcion = :rolDescripcion")})
public class Rol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ROL_CURR")
    private Integer rolCurr;
    @Column(name = "ROL_TIPO")
    private String rolTipo;
    @Column(name = "ROL_DESCRIPCION")
    private String rolDescripcion;
    @OneToMany(mappedBy = "rol")
    private List<Usuario> usuarioList;

    public Rol() {
    }

    public Rol(Integer rolCurr) {
        this.rolCurr = rolCurr;
    }

    public Integer getRolCurr() {
        return rolCurr;
    }

    public void setRolCurr(Integer rolCurr) {
        this.rolCurr = rolCurr;
    }

    public String getRolTipo() {
        return rolTipo;
    }

    public void setRolTipo(String rolTipo) {
        this.rolTipo = rolTipo;
    }

    public String getRolDescripcion() {
        return rolDescripcion;
    }

    public void setRolDescripcion(String rolDescripcion) {
        this.rolDescripcion = rolDescripcion;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolCurr != null ? rolCurr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.rolCurr == null && other.rolCurr != null) || (this.rolCurr != null && !this.rolCurr.equals(other.rolCurr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Rol[rolCurr=" + rolCurr + "]";
    }

}
