/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lv1821
 */
public class Pelicula extends Medio {
    private String actor1;
    private String actor2;
    private String director;
    
    
    public Pelicula(){
    }
    
    public Pelicula(String clave, String titulo, Genero genero, String actor1,String actor2,String director,int duracion,String fecha){
        super(clave,titulo,genero,duracion,fecha);
        this.actor1=actor1;
        this.actor2=actor2;
        this.director=director;
    }
    
    public Pelicula(String clave){
        this(clave,null,null,null,null,null,0,null);
    }

    public String getActor1() {
        return actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public String getDirector() {
        return director;
    }

    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }

    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public String toString(){
        return super.toString()+", "+actor1+", "+actor2+", "+director;
    }
}
