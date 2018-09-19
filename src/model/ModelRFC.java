/**
 *
 * @author Carina Amairani Díaz Ramírez
 */
package model;

import java.awt.event.ActionEvent;


public class ModelRFC {
    
    public String Nombre;
    public String APaterno;
    public String AMaterno;
    public String RFC;
    public String Dia;
    public String Anio;
    public String Mes;

   

    public String getMes() {
        return Mes ;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

  

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }
  
   
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAPaterno() {
        return APaterno;
    }

    public void setAPaterno(String APaterno) {
        this.APaterno = APaterno;
    }

    public String getAMaterno() {
        return AMaterno;
    }

    public void setAMaterno(String AMaterno) {
        this.AMaterno = AMaterno;
    }
    
     public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
  
    
   
    public String datosRfc(){
        
        
        this.APaterno=this.APaterno.substring(0,2).toUpperCase();
        this.AMaterno=this.AMaterno.substring(0,1).toUpperCase();
        this.Nombre=this.Nombre.substring(0,1).toUpperCase();
        this.Anio=this.Anio.substring(2,4).toUpperCase();
        this.Mes=this.Mes.substring(0,2).toUpperCase();
        this.Dia=this.Dia.substring(0,2).toUpperCase();
   
        this.RFC= this.APaterno+this.AMaterno+this.Nombre+this.Anio+this.Mes+this.Dia;  
        return this.RFC;
        
    }
  

    
}
