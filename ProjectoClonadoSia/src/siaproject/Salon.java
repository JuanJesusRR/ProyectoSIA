
package siaproject;
import java.util.List;


public class Salon {
    //Atributos
    private int numero;
    private List<Edificio> edificios;
    private List<Curso> cursos;
    private List<Facultad> facultad;
    //Get 
        public List<Curso> getCursos(){
        return this.cursos;
        }
        public List<Facultad>  getFacultad(){
        return this.facultad;
        }
        public List<Edificio> getEdificios(){
        return this.edificios;
        }
        public int getNumero(){
        return this.numero;
        }
   
    //Set
        public void setFacultad(List<Facultad> facultad){
        this.facultad=facultad;
        }
        public void setEdificios(List<Edificio> edificios){
        this.edificios=edificios;
        }
        public void setCursos(List<Curso> cursos){
        this.cursos=cursos;
        }
        public void setnumero(int numero){
        this.numero=numero;
    
    
        }
}
