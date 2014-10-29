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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author esosa-ubuntu
 */
@Entity
@Table(name = "USUARIO")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByUsCorr", query = "SELECT u FROM Usuario u WHERE u.usCorr = :usCorr"),
    @NamedQuery(name = "Usuario.findByUsUsuario", query = "SELECT u FROM Usuario u WHERE u.usUsuario = :usUsuario"),
    @NamedQuery(name = "Usuario.findByUsPass", query = "SELECT u FROM Usuario u WHERE u.usPass = :usPass")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "US_CORR")
    private Integer usCorr;
    @Basic(optional = false)
    @Column(name = "US_USUARIO")
    private String usUsuario;
    @Basic(optional = false)
    @Column(name = "US_PASS")
    private String usPass;
    @OneToMany(mappedBy = "usuario")
    private List<Empleado> empleadoList;
    @JoinColumn(name = "US_ROL_CURR", referencedColumnName = "ROL_CURR")
    @ManyToOne
    private Rol rol;

    public Usuario() {
    }

    public Usuario(Integer usCorr) {
        this.usCorr = usCorr;
    }

    public Usuario(Integer usCorr, String usUsuario, String usPass) {
        this.usCorr = usCorr;
        this.usUsuario = usUsuario;
        this.usPass = usPass;
    }

    public Integer getUsCorr() {
        return usCorr;
    }

    public void setUsCorr(Integer usCorr) {
        this.usCorr = usCorr;
    }

    public String getUsUsuario() {
        return usUsuario;
    }

    public void setUsUsuario(String usUsuario) {
        this.usUsuario = usUsuario;
    }

    public String getUsPass() {
        return usPass;
    }

    public void setUsPass(String usPass) {
        this.usPass = usPass;
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usCorr != null ? usCorr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usCorr == null && other.usCorr != null) || (this.usCorr != null && !this.usCorr.equals(other.usCorr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.z.juegos.Usuario[usCorr=" + usCorr + "]";
    }

}
