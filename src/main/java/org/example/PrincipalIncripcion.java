package org.example;

import ar.programa.validador.Alumno;
import ar.programa.validador.Inscripcion;
import ar.programa.validador.Materia;

import java.util.ArrayList;


/**
 * @author pBarzaghi
 *
 */
public class PrincipalIncripcion
{



    public static void main(String[] args)
    {
         Materia materiaProg1,materiaProg2,materiaProg3,
                materiaAlgebra1,
                materiaAlgoritmo1,materiaAlgoritmo2;
        Alumno alumnoPablo,alumnoOscar;

       //-----------------------------------------
       //
       //---------------------------------------
        ArrayList<Materia> materias =new ArrayList<>();
        materiaProg1=new Materia("Programacion I");

        materiaProg2=new Materia("Programacion II");
        materiaProg2.addCorrelativa(materiaProg1);

        materiaProg3=new Materia("Programacion III");
        materiaProg3.addCorrelativa(materiaProg1);
        materiaProg3.addCorrelativa(materiaProg1);

         materiaAlgebra1=new Materia("Algebra I");

        materiaAlgoritmo1=new Materia("Algoritmo I");

        materiaAlgoritmo2=new Materia("Algoritmo II");
        materiaAlgoritmo2.addCorrelativa(materiaAlgoritmo1);



        alumnoPablo=new Alumno("Pablo",new Integer(1));
        alumnoPablo.addMateriaAprobada(materiaProg1);

        // Comente esta linea para que salga Rechazada la inscripcion
        // alumnoPablo.addMateriaAprobada(materiaAlgoritmo1);


        alumnoOscar=new Alumno("Oscar",new Integer(2));
        alumnoOscar.addMateriaAprobada(materiaProg1);
        alumnoOscar.addMateriaAprobada(materiaAlgoritmo1);
       // ---- fin carga de materia y alumnos ---

        //--- Carga de Inscripciones



        //---------- Fin de carga de inscripciones ----


        ArrayList<Inscripcion> inscripciones =new ArrayList<>();
        Inscripcion  inscripcionPablo =new Inscripcion(alumnoPablo,materiaAlgoritmo2);
        inscripciones.add(inscripcionPablo);

        Inscripcion  inscripcionOscar =new Inscripcion(alumnoOscar,materiaProg3);
        inscripciones.add(inscripcionOscar);



        inscripciones.stream().forEach(i -> System.out.println(leyendaEstado(i)));

    }





     public static String leyendaEstado(Inscripcion inscripcion) {
          if (inscripcion.getAlumno().getNroLibreta() == null)
            return "No existe el/la alumno/a";

        return (inscripcion.aprobado()?inscripcion.toString()+" Estado Inscripcion : Aprobado":
                inscripcion.toString()+" Estado Inscripcion : Rechazado");

     }





}
