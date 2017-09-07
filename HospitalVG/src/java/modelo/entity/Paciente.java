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
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p")
    , @NamedQuery(name = "Paciente.findByNumpac", query = "SELECT p FROM Paciente p WHERE p.numpac = :numpac")
    , @NamedQuery(name = "Paciente.findByNompac", query = "SELECT p FROM Paciente p WHERE p.nompac = :nompac")
    , @NamedQuery(name = "Paciente.findByApepac", query = "SELECT p FROM Paciente p WHERE p.apepac = :apepac")
    , @NamedQuery(name = "Paciente.findBySexpac", query = "SELECT p FROM Paciente p WHERE p.sexpac = :sexpac")
    , @NamedQuery(name = "Paciente.findByDnipac", query = "SELECT p FROM Paciente p WHERE p.dnipac = :dnipac")
    , @NamedQuery(name = "Paciente.findByFnpac", query = "SELECT p FROM Paciente p WHERE p.fnpac = :fnpac")
    , @NamedQuery(name = "Paciente.findByDirpac", query = "SELECT p FROM Paciente p WHERE p.dirpac = :dirpac")
    , @NamedQuery(name = "Paciente.findByNumubi", query = "SELECT p FROM Paciente p WHERE p.numubi = :numubi")
    , @NamedQuery(name = "Paciente.findByTelfpac", query = "SELECT p FROM Paciente p WHERE p.telfpac = :telfpac")
    , @NamedQuery(name = "Paciente.findByEmailpac", query = "SELECT p FROM Paciente p WHERE p.emailpac = :emailpac")
    , @NamedQuery(name = "Paciente.findByGspac", query = "SELECT p FROM Paciente p WHERE p.gspac = :gspac")
    , @NamedQuery(name = "Paciente.findByHcpac", query = "SELECT p FROM Paciente p WHERE p.hcpac = :hcpac")
    , @NamedQuery(name = "Paciente.findByEstpac", query = "SELECT p FROM Paciente p WHERE p.estpac = :estpac")})
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Long numpac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(nullable = false, length = 30)
    private String nompac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(nullable = false, length = 70)
    private String apepac;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Character sexpac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(nullable = false, length = 8)
    private String dnipac;
    @Temporal(TemporalType.DATE)
    private Date fnpac;
    @Size(max = 50)
    @Column(length = 50)
    private String dirpac;
    @Size(max = 6)
    @Column(length = 6)
    private String numubi;
    @Size(max = 30)
    @Column(length = 30)
    private String telfpac;
    @Size(max = 30)
    @Column(length = 30)
    private String emailpac;
    @Size(max = 5)
    @Column(length = 5)
    private String gspac;
    @Size(max = 11)
    @Column(length = 11)
    private String hcpac;
    @Size(max = 20)
    @Column(length = 20)
    private String estpac;

    public Paciente() {
    }

    public Paciente(Long numpac) {
        this.numpac = numpac;
    }

    public Paciente(Long numpac, String nompac, String apepac, Character sexpac, String dnipac) {
        this.numpac = numpac;
        this.nompac = nompac;
        this.apepac = apepac;
        this.sexpac = sexpac;
        this.dnipac = dnipac;
    }

    public Long getNumpac() {
        return numpac;
    }

    public void setNumpac(Long numpac) {
        this.numpac = numpac;
    }

    public String getNompac() {
        return nompac;
    }

    public void setNompac(String nompac) {
        this.nompac = nompac;
    }

    public String getApepac() {
        return apepac;
    }

    public void setApepac(String apepac) {
        this.apepac = apepac;
    }

    public Character getSexpac() {
        return sexpac;
    }

    public void setSexpac(Character sexpac) {
        this.sexpac = sexpac;
    }

    public String getDnipac() {
        return dnipac;
    }

    public void setDnipac(String dnipac) {
        this.dnipac = dnipac;
    }

    public Date getFnpac() {
        return fnpac;
    }

    public void setFnpac(Date fnpac) {
        this.fnpac = fnpac;
    }

    public String getDirpac() {
        return dirpac;
    }

    public void setDirpac(String dirpac) {
        this.dirpac = dirpac;
    }

    public String getNumubi() {
        return numubi;
    }

    public void setNumubi(String numubi) {
        this.numubi = numubi;
    }

    public String getTelfpac() {
        return telfpac;
    }

    public void setTelfpac(String telfpac) {
        this.telfpac = telfpac;
    }

    public String getEmailpac() {
        return emailpac;
    }

    public void setEmailpac(String emailpac) {
        this.emailpac = emailpac;
    }

    public String getGspac() {
        return gspac;
    }

    public void setGspac(String gspac) {
        this.gspac = gspac;
    }

    public String getHcpac() {
        return hcpac;
    }

    public void setHcpac(String hcpac) {
        this.hcpac = hcpac;
    }

    public String getEstpac() {
        return estpac;
    }

    public void setEstpac(String estpac) {
        this.estpac = estpac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numpac != null ? numpac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.numpac == null && other.numpac != null) || (this.numpac != null && !this.numpac.equals(other.numpac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entity.Paciente[ numpac=" + numpac + " ]";
    }
    
}
