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
@Table(name="comp")
public class Comp implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nroInterno;
    private String tipoComp;
    private String letra;
    private String ptoVta;
    private String nroFc;
    private String fecha;
    private String cuit;
    private String netog;
    private String exento;
    private String iva21;
    private String iva27;
    private String iva105;
    private String percIva;
    private String percIIBB;
    private String total;
    private String fechaDDJJ;
    
    
    public Comp() {
    }
    public Comp(String linea,String periodo) {
        this(linea.substring(0, 5),linea.substring(6, 8),linea.substring(9, 10),linea.substring(11, 15),linea.substring(16, 24),linea.substring(32, 36)+linea.substring(29,31)+linea.substring(26,28),linea.substring(70,83),linea.substring(102,114),linea.substring(114,126),linea.substring(126,138),linea.substring(138,150),linea.substring(150,162),linea.substring(162,174),linea.substring(174,186),linea.substring(186,198),periodo);
    }

    public Comp(String nroInterno, String tipoComp, String letra, String ptoVta, String nroFc, String fecha, String cuit, String netog, String exento, String iva21, String iva27, String iva105, String percIva, String percIIBB, String total,String periodo) {
        this.nroInterno = nroInterno;
        this.tipoComp = tipoComp;
        this.letra = letra;
        this.ptoVta = ptoVta;
        this.nroFc = nroFc;
        this.fecha = fecha;
        this.cuit = cuit;
        this.netog = netog;
        this.iva21 = iva21;
        this.exento = exento;
        this.iva27 = iva27;
        this.iva105 = iva105;
        this.percIva = percIva;
        this.percIIBB = percIIBB;
        this.total = total;
        this.fechaDDJJ = periodo;
    }
    
    @Override
    public String toString() {
        return "Comp{" + "id=" + id + ", nroInterno=" + nroInterno + ", tipoComp=" + tipoComp + ", letra=" + letra + ", ptoVta=" + ptoVta + ", nroFc=" + nroFc + ", fecha=" + fecha + ", cuit=" + cuit + ", netog=" + netog + ", iva21=" + iva21 + ", exento=" + exento + ", iva27=" + iva27 + ", iva105=" + iva105 + ", percIva=" + percIva + ", percIIBB=" + percIIBB + ", total=" + total + '}';
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
        if (!(object instanceof Comp)) {
            return false;
        }
        Comp other = (Comp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
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
     * @return the letra
     */
    public String getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(String letra) {
        this.letra = letra;
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
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
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
     * @return the iva21
     */
    public String getIva21() {
        return iva21;
    }

    /**
     * @param iva21 the iva21 to set
     */
    public void setIva21(String iva21) {
        this.iva21 = iva21;
    }

    /**
     * @return the exento
     */
    public String getExento() {
        return exento;
    }

    /**
     * @param exento the exento to set
     */
    public void setExento(String exento) {
        this.exento = exento;
    }

    /**
     * @return the iva27
     */
    public String getIva27() {
        return iva27;
    }

    /**
     * @param iva27 the iva27 to set
     */
    public void setIva27(String iva27) {
        this.iva27 = iva27;
    }

    /**
     * @return the iva105
     */
    public String getIva105() {
        return iva105;
    }

    /**
     * @param iva105 the iva105 to set
     */
    public void setIva105(String iva105) {
        this.iva105 = iva105;
    }

    /**
     * @return the percIva
     */
    public String getPercIva() {
        return percIva;
    }

    /**
     * @param percIva the percIva to set
     */
    public void setPercIva(String percIva) {
        this.percIva = percIva;
    }

    /**
     * @return the percIIBB
     */
    public String getPercIIBB() {
        return percIIBB;
    }

    /**
     * @param percIIBB the percIIBB to set
     */
    public void setPercIIBB(String percIIBB) {
        this.percIIBB = percIIBB;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
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

    
}
