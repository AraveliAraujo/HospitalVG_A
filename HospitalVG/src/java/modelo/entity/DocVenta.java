/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "DOC_VENTA", catalog = "BDHospital", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocVenta.findAll", query = "SELECT d FROM DocVenta d")
    , @NamedQuery(name = "DocVenta.findByNcodDoc", query = "SELECT d FROM DocVenta d WHERE d.ncodDoc = :ncodDoc")
    , @NamedQuery(name = "DocVenta.findByNumDoc", query = "SELECT d FROM DocVenta d WHERE d.numDoc = :numDoc")
    , @NamedQuery(name = "DocVenta.findByTipDoc", query = "SELECT d FROM DocVenta d WHERE d.tipDoc = :tipDoc")
    , @NamedQuery(name = "DocVenta.findByFchingDoc", query = "SELECT d FROM DocVenta d WHERE d.fchingDoc = :fchingDoc")
    , @NamedQuery(name = "DocVenta.findByMontDoc", query = "SELECT d FROM DocVenta d WHERE d.montDoc = :montDoc")
    , @NamedQuery(name = "DocVenta.findByDondoc", query = "SELECT d FROM DocVenta d WHERE d.dondoc = :dondoc")
    , @NamedQuery(name = "DocVenta.findByObsDoc", query = "SELECT d FROM DocVenta d WHERE d.obsDoc = :obsDoc")
    , @NamedQuery(name = "DocVenta.findByNumpac", query = "SELECT d FROM DocVenta d WHERE d.numpac = :numpac")})
public class DocVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NCOD_DOC", nullable = false)
    private Long ncodDoc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "NUM_DOC", nullable = false, length = 14)
    private String numDoc;
    @Size(max = 10)
    @Column(name = "TIP_DOC", length = 10)
    private String tipDoc;
    @Column(name = "FCHING_DOC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fchingDoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONT_DOC", precision = 10, scale = 2)
    private BigDecimal montDoc;
    @Column(precision = 10, scale = 2)
    private BigDecimal dondoc;
    @Size(max = 50)
    @Column(name = "OBS_DOC", length = 50)
    private String obsDoc;
    private BigInteger numpac;

    public DocVenta() {
    }

    public DocVenta(Long ncodDoc) {
        this.ncodDoc = ncodDoc;
    }

    public DocVenta(Long ncodDoc, String numDoc) {
        this.ncodDoc = ncodDoc;
        this.numDoc = numDoc;
    }

    public Long getNcodDoc() {
        return ncodDoc;
    }

    public void setNcodDoc(Long ncodDoc) {
        this.ncodDoc = ncodDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getTipDoc() {
        return tipDoc;
    }

    public void setTipDoc(String tipDoc) {
        this.tipDoc = tipDoc;
    }

    public Date getFchingDoc() {
        return fchingDoc;
    }

    public void setFchingDoc(Date fchingDoc) {
        this.fchingDoc = fchingDoc;
    }

    public BigDecimal getMontDoc() {
        return montDoc;
    }

    public void setMontDoc(BigDecimal montDoc) {
        this.montDoc = montDoc;
    }

    public BigDecimal getDondoc() {
        return dondoc;
    }

    public void setDondoc(BigDecimal dondoc) {
        this.dondoc = dondoc;
    }

    public String getObsDoc() {
        return obsDoc;
    }

    public void setObsDoc(String obsDoc) {
        this.obsDoc = obsDoc;
    }

    public BigInteger getNumpac() {
        return numpac;
    }

    public void setNumpac(BigInteger numpac) {
        this.numpac = numpac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ncodDoc != null ? ncodDoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocVenta)) {
            return false;
        }
        DocVenta other = (DocVenta) object;
        if ((this.ncodDoc == null && other.ncodDoc != null) || (this.ncodDoc != null && !this.ncodDoc.equals(other.ncodDoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entity.DocVenta[ ncodDoc=" + ncodDoc + " ]";
    }
    
}
