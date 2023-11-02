package ar.programa.validadorTest;

import ar.programa.validador.Alumno;
import ar.programa.validador.Inscripcion;
import ar.programa.validador.Materia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InscripcionTest {

    @Test
    public void  pabloAproboLaInscripcionMateriaAlgebra(){

       Alumno alumnoPablo=new Alumno("Pablo",new Integer(1));
       Materia materiaAlgebra1=new Materia("Algebra I");
        Assertions.assertTrue((new Inscripcion(alumnoPablo,materiaAlgebra1)).aprobado());
    }

    @Test
    public void  pabloNoAproboLaInscripcionMateriaProgramacionII(){

        Alumno alumnoPablo=new Alumno("Pablo",new Integer(1));
       Materia  materiaProgramacionI=new Materia("Programacion I");

        Materia  materiaProgramacionII=new Materia("Programacion II");
        materiaProgramacionII.addCorrelativa( materiaProgramacionI);
        Assertions.assertFalse((new Inscripcion(alumnoPablo, materiaProgramacionII)).aprobado());
    }

    @Test
    public void  pabloAproboLaInscripcionMateriaProgramacionII(){

        Alumno alumnoPablo=new Alumno("Pablo",new Integer(1));
        Materia  materiaProgramacionI=new Materia("Programacion I");
        alumnoPablo.addMateriaAprobada(materiaProgramacionI);
        Materia  materiaProgramacionII=new Materia("Programacion II");
        materiaProgramacionII.addCorrelativa( materiaProgramacionI);
        Assertions.assertTrue((new Inscripcion(alumnoPablo, materiaProgramacionII)).aprobado());
    }
}
