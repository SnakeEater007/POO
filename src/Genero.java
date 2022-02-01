/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lv1821
 */
public class Genero {
    private String cveGenero;
    private String nombre;
    private char tipoMedio;
    
    public Genero(){
        
    }
    
    public Genero(String cveGenero,String nombre,char tipoMedio){
        this.cveGenero=cveGenero;
        this.nombre = nombre;
        this.tipoMedio=tipoMedio;
    }

    public String getCveGenero() {
        return cveGenero;
    }

    public String getNombre() {
        return nombre;
    }

    public char getTipoMedio() {
        return tipoMedio;
    }

    public void setCveGenero(String cveGenero) {
        this.cveGenero = cveGenero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoMedio(char tipoMedio) {
        this.tipoMedio = tipoMedio;
    }
    
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        
        final Genero other = (Genero) obj;
        
        if((this.cveGenero==null)? (other.cveGenero != null) : !this.cveGenero.equals(other.cveGenero)){
            return false;
        }
        return true;
    }
    
    public int hashCode(){
        int hash=7;
        
        hash = 71*hash+(this.cveGenero != null? this.cveGenero.hashCode(): 0);
        
        return hash;
    }
    
    public String toString(){
        return cveGenero + ", "+nombre+", "+tipoMedio;
    }
}
