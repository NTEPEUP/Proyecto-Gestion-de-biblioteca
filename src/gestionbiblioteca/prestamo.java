/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbiblioteca;

import java.io.Serializable;

/**
 *
 * @author Nelson
 */
public class prestamo implements Serializable{
   private String idPtmo;
  private String fechaPtmo;
  private String fechaDev;

    public String getIdPtmo() {
        return idPtmo;
        
    }

    public prestamo(String fechaPtmo, String fechaDev) {
        this.fechaPtmo = fechaPtmo;
        this.fechaDev = fechaDev;
    }

    public String getFechaPtmo() {
        return fechaPtmo;
    }

    public void setFechaPtmo(String fechaPtmo) {
        this.fechaPtmo = fechaPtmo;
    }

    public String getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(String fechaDev) {
        this.fechaDev = fechaDev;
    }
    


  
  
    
}
