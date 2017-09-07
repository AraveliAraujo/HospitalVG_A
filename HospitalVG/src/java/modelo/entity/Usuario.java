/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANTONIO
 */
@Entity
@Table(catalog = "BDHospital", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByNumusu", query = "SELECT u FROM Usuario u WHERE u.numusu = :numusu")
    , @NamedQuery(name = "Usuario.findByNomusu", query = "SELECT u FROM Usuario u WHERE u.nomusu = :nomusu")
    , @NamedQuery(name = "Usuario.findByUsuusu", query = "SELECT u FROM Usuario u WHERE u.usuusu = :usuusu")
    , @NamedQuery(name = "Usuario.findByPwdusu", query = "SELECT u FROM Usuario u WHERE u.pwdusu = :pwdusu")
    , @NamedQuery(name = "Usuario.findByDniusu", query = "SELECT u FROM Usuario u WHERE u.dniusu = :dniusu")
    , @NamedQuery(name = "Usuario.findByIngusu", query = "SELECT u FROM Usuario u WHERE u.ingusu = :ingusu")
    , @NamedQuery(name = "Usuario.findByTelfusu", query = "SELECT u FROM Usuario u WHERE u.telfusu = :telfusu")
    , @NamedQuery(name = "Usuario.findByFnacusu", query = "SELECT u FROM Usuario u WHERE u.fnacusu = :fnacusu")
    , @NamedQuery(name = "Usuario.findByCargusu", query = "SELECT u FROM Usuario u WHERE u.cargusu = :cargusu")
    , @NamedQuery(name = "Usuario.findByDirusu", query = "SELECT u FROM Usuario u WHERE u.dirusu = :dirusu")
    , @NamedQuery(name = "Usuario.findByUbiusu", query = "SELECT u FROM Usuario u WHERE u.ubiusu = :ubiusu")
    , @NamedQuery(name = "Usuario.findByLevusu", query = "SELECT u FROM Usuario u WHERE u.levusu = :levusu")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer numusu;
    @Size(max = 50)
    @Column(length = 50)
    private String nomusu;
    @Size(max = 5)
    @Column(length = 5)
    private String usuusu;
    @Size(max = 50)
    @Column(length = 50)
    private String pwdusu;
    @Size(max = 8)
    @Column(length = 8)
    private String dniusu;
    @Temporal(TemporalType.DATE)
    private Date ingusu;
    @Size(max = 30)
    @Column(length = 30)
    private String telfusu;
    @Temporal(TemporalType.DATE)
    private Date fnacusu;
    @Size(max = 30)
    @Column(length = 30)
    private String cargusu;
    @Size(max = 50)
    @Column(length = 50)
    private String dirusu;
    @Size(max = 6)
    @Column(length = 6)
    private String ubiusu;
    private Character levusu;

    public Usuario() {
    }

    public Usuario(Integer numusu) {
        this.numusu = numusu;
    }

    public Integer getNumusu() {
        return numusu;
    }

    public void setNumusu(Integer numusu) {
        this.numusu = numusu;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    public String getUsuusu() {
        return usuusu;
    }

    public void setUsuusu(String usuusu) {
        this.usuusu = usuusu;
    }

    public String getPwdusu() {
        return pwdusu;
    }

    public void setPwdusu(String pwdusu) {
        this.pwdusu = pwdusu;
    }

    public String getDniusu() {
        return dniusu;
    }

    public void setDniusu(String dniusu) {
        this.dniusu = dniusu;
    }

    public Date getIngusu() {
        return ingusu;
    }

    public void setIngusu(Date ingusu) {
        this.ingusu = ingusu;
    }

    public String getTelfusu() {
        return telfusu;
    }

    public void setTelfusu(String telfusu) {
        this.telfusu = telfusu;
    }

    public Date getFnacusu() {
        return fnacusu;
    }

    public void setFnacusu(Date fnacusu) {
        this.fnacusu = fnacusu;
    }

    public String getCargusu() {
        return cargusu;
    }

    public void setCargusu(String cargusu) {
        this.cargusu = cargusu;
    }

    public String getDirusu() {
        return dirusu;
    }

    public void setDirusu(String dirusu) {
        this.dirusu = dirusu;
    }

    public String getUbiusu() {
        return ubiusu;
    }

    public void setUbiusu(String ubiusu) {
        this.ubiusu = ubiusu;
    }

    public Character getLevusu() {
        return levusu;
    }

    public void setLevusu(Character levusu) {
        this.levusu = levusu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numusu != null ? numusu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.numusu == null && other.numusu != null) || (this.numusu != null && !this.numusu.equals(other.numusu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entity.Usuario[ numusu=" + numusu + " ]";
    }
    
}
