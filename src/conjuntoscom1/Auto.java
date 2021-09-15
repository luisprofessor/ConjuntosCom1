/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntoscom1;

/**
 *
 * @author Javier
 */
public class Auto {
    private String marca;
    private String patente;

    public Auto(String marca, String patente) {
        this.marca = marca;
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    
    public boolean equals(Object obj){
    // sea un auto
    // que no sea 
    if(obj==null || !(obj instanceof Auto)){
    
        return false;
    
    }else{
    
        Auto viene=(Auto)obj;
        
        return patente.equals(viene.patente);
    
    }
    
        
    }
   
    public int hashCode(){
    
        return patente.hashCode();
    }
    
}
