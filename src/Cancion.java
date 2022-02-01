/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lv1821
 */
public class Cancion extends Medio{
    
        private String interprete;
        private String autor;
        private String album;
        
        //Constructor Predeterminado
        public Cancion(){
            super();
        }
        
      public Cancion(String clave,String titulo,Genero genero,String interprete,String autor,String album, int duracion, String fecha){  
          super(clave,titulo,genero,duracion,fecha);
          this.interprete=interprete;
          this.autor=autor;
          this.album=album;
      }
      
      //Constructor que Inicializa la clave
      public Cancion(String clave){
          this(clave,null,null,null,null,null,0,null);
      }

    public String getInterprete() {
        return interprete;
    }

    public String getAutor() {
        return autor;
    }

    public String getAlbum() {
        return album;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
      
      @Override
      public String toString(){
          return super.toString()+", "+interprete+", "+album;
      }
}