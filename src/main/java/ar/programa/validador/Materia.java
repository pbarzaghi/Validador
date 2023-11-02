package ar.programa.validador;

import java.util.ArrayList;

/**
 *
 * @author pBarzaghi
 */
public class Materia {
    private String nombre;
    private ArrayList<Materia> correlativas;

    public Materia(String nombre){
        this.nombre=nombre;
        correlativas=new ArrayList<>();

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorrelativas(ArrayList<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Materia> getCorrelativas() {
        return correlativas;
    }

    /*
      Puedo cursar una materia si tengo aprobada las correlativas de dicha materias
     */
    public boolean puedoCursar(Alumno alumno){

       return alumno.getMateriaAprobadas().containsAll(this.getCorrelativas());


    }
  /*
     El metodo tiene corretivas si no esta vacia la lista materias correlativas
   */
    public boolean tieneCorrelativas(){
      return ! this.correlativas.isEmpty();
    }
    public void  addCorrelativa(Materia materia){
         this.correlativas.add(materia);
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
