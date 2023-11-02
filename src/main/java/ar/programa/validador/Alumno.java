package ar.programa.validador;

import java.util.ArrayList;
/**
 *
 * @author pBarzaghi
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private Integer nroLibreta;
    private ArrayList<Materia> materiaAprobadas;

    public Alumno(String nombre, Integer nro){
        this.nombre=nombre;
        this.nroLibreta=nro;
        this.materiaAprobadas=new ArrayList<>();

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNroLibreta(Integer nroLibreta) {
        this.nroLibreta = nroLibreta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getNroLibreta() {
        return nroLibreta;
    }

   public void addMateriaAprobada(Materia materia){
        if(!materiaAprobadas.contains(materia))
           this.materiaAprobadas.add(materia);


   }

    public ArrayList<Materia> getMateriaAprobadas() {
        return materiaAprobadas;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
