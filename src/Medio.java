/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lv1821
 */
public class Medio {

    private String clave;
    private String titulo;
    private Genero genero;
    private int duracion;
    private String fecha;

    public Medio() {
    }
    
    public Medio(String clave,String titulo,Genero genero,int duracion,String fecha){
    
        this.clave=clave;
        this.titulo=titulo;
        this.genero=genero;
        this.duracion=duracion;
        this.fecha=fecha;
    }

    public String getClave() {
        return clave;
    }

    public String getTitulo() {
        return titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public boolean equals(Object obj){
        
        if(obj==null){
        return false;
        }
        
        if(getClass() != obj.getClass()){
            return false;
        }
        
        final Medio other = (Medio) obj;
        
        if((this.clave==null) ? (other.clave !=null): !this.clave.equals(other.clave)){
        return false;
    }
        return true;
    }
    
    public int hashCode(){
        int hash = 5;
        
        hash=47*hash+(this.clave !=null? this.clave.hashCode():0);
        return hash;
    }
    
    public String toString(){
        return clave+", "+titulo+", "+genero.getNombre()+", "+duracion+", "+fecha;
    }

}
