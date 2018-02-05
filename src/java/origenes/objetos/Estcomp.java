/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package origenes.objetos;

import java.io.Serializable;
import java.util.GregorianCalendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name="estcomp")
public class Estcomp implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nroInterno;
    private String tipoComp;
    private String fechaFac;
    private String ptoVta;
    private String nroFc;
    private String cuit;
    private String netog;
    private String iva;
    private String cero;
    private String computable;
    private String retencion;
    private String fechaDePago;
    private String fechaDDJJ;
    private String descripcion;
    private String codNoRet;
    private String certExclusion;
    private String tipoCredFiscal;

    public Estcomp() {
    }
    public Estcomp(String campos[]) {
        this(campos[0],campos[1],campos[2],campos[3],campos[4],campos[5],campos[7],campos[8],campos[9],campos[10],campos[11],campos[12],campos[13],campos[14],campos[15],campos[16],campos[17],campos[18],campos[19]);
    }

    public Estcomp(String nroInterno, String tipoComp, String fechaFac, String ptoVta, String nroFc, String cuit, String netog, String iva, String cero, String computable, String retencion,String fechaDePago, String fechaDDJJ, String descripcion, String codNoRet, String certExclusion, String tipoCredFiscal,String pu,String cant) {
        this.nroInterno = nroInterno;
        this.tipoComp = tipoComp;
        this.fechaFac = fechaFac;
        this.ptoVta = ptoVta;
        this.nroFc = nroFc;
        this.cuit = cuit;
        this.netog = netog;
        this.iva = iva;
        this.cero = cero;
        this.computable = computable;
        this.retencion = retencion;
        this.fechaDePago = fechaDePago;
        this.fechaDDJJ = fechaDDJJ;
        this.descripcion = descripcion;
        this.codNoRet = codNoRet;
        this.certExclusion = certExclusion;
        this.tipoCredFiscal = tipoCredFiscal;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estcomp)) {
            return false;
        }
        Estcomp other = (Estcomp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estcomp{" + "id=" + id + ", nroInterno=" + nroInterno + ", tipoComp=" + tipoComp + ", fechaFac=" + fechaFac + ", ptoVta=" + ptoVta + ", nroFc=" + nroFc + ", cuit=" + cuit + ", netog=" + netog + ", iva=" + iva + ", cero=" + cero + ", computable=" + computable + ", fechaDePago=" + fechaDePago + ", fechaDDJJ=" + fechaDDJJ + ", descripcion=" + descripcion + ", codNoRet=" + codNoRet + ", certExclusion=" + certExclusion + ", tipoCredFiscal=" + tipoCredFiscal + '}';
    }

    
    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the nroInterno
     */
    public String getNroInterno() {
        return nroInterno;
    }

    /**
     * @param nroInterno the nroInterno to set
     */
    public void setNroInterno(String nroInterno) {
        this.nroInterno = nroInterno;
    }

    /**
     * @return the tipoComp
     */
    public String getTipoComp() {
        return tipoComp;
    }

    /**
     * @param tipoComp the tipoComp to set
     */
    public void setTipoComp(String tipoComp) {
        this.tipoComp = tipoComp;
    }

    /**
     * @return the fechaFac
     */
    public String getFechaFac() {
        return fechaFac;
    }

    /**
     * @param fechaFac the fechaFac to set
     */
    public void setFechaFac(String fechaFac) {
        this.fechaFac = fechaFac;
    }

    /**
     * @return the ptoVta
     */
    public String getPtoVta() {
        return ptoVta;
    }

    /**
     * @param ptoVta the ptoVta to set
     */
    public void setPtoVta(String ptoVta) {
        this.ptoVta = ptoVta;
    }

    /**
     * @return the nroFc
     */
    public String getNroFc() {
        return nroFc;
    }

    /**
     * @param nroFc the nroFc to set
     */
    public void setNroFc(String nroFc) {
        this.nroFc = nroFc;
    }

    /**
     * @return the cuit
     */
    public String getCuit() {
        return cuit;
    }

    /**
     * @param cuit the cuit to set
     */
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    /**
     * @return the netog
     */
    public String getNetog() {
        return netog;
    }

    /**
     * @param netog the netog to set
     */
    public void setNetog(String netog) {
        this.netog = netog;
    }

    /**
     * @return the iva
     */
    public String getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(String iva) {
        this.iva = iva;
    }

    /**
     * @return the cero
     */
    public String getCero() {
        return cero;
    }

    /**
     * @param cero the cero to set
     */
    public void setCero(String cero) {
        this.cero = cero;
    }

    /**
     * @return the computable
     */
    public String getComputable() {
        return computable;
    }

    /**
     * @param computable the computable to set
     */
    public void setComputable(String computable) {
        this.computable = computable;
    }

    /**
     * @return the fechaDePago
     */
    public String getFechaDePago() {
        return fechaDePago;
    }

    /**
     * @param fechaDePago the fechaDePago to set
     */
    public void setFechaDePago(String fechaDePago) {
        this.fechaDePago = fechaDePago;
    }

    /**
     * @return the fechaDDJJ
     */
    public String getFechaDDJJ() {
        return fechaDDJJ;
    }

    /**
     * @param fechaDDJJ the fechaDDJJ to set
     */
    public void setFechaDDJJ(String fechaDDJJ) {
        this.fechaDDJJ = fechaDDJJ;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the codNoRet
     */
    public String getCodNoRet() {
        return codNoRet;
    }

    /**
     * @param codNoRet the codNoRet to set
     */
    public void setCodNoRet(String codNoRet) {
        this.codNoRet = codNoRet;
    }

    /**
     * @return the certExclusion
     */
    public String getCertExclusion() {
        return certExclusion;
    }

    /**
     * @param certExclusion the certExclusion to set
     */
    public void setCertExclusion(String certExclusion) {
        this.certExclusion = certExclusion;
    }

    /**
     * @return the tipoCredFiscal
     */
    public String getTipoCredFiscal() {
        return tipoCredFiscal;
    }

    /**
     * @param tipoCredFiscal the tipoCredFiscal to set
     */
    public void setTipoCredFiscal(String tipoCredFiscal) {
        this.tipoCredFiscal = tipoCredFiscal;
    }

    /**
     * @return the retencion
     */
    public String getRetencion() {
        return retencion;
    }

    /**
     * @param retencion the retencion to set
     */
    public void setRetencion(String retencion) {
        this.retencion = retencion;
    }
    
}
