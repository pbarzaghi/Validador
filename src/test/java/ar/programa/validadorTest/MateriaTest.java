package ar.programa.validadorTest;

import ar.programa.validador.Alumno;
import ar.programa.validador.Materia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MateriaTest {
    @Test
    public void algebraNoTieneCorrelativa(){

        Materia algebra=new Materia("Algebra");
        Assertions.assertFalse(algebra.tieneCorrelativas());

    }
   @Test
    public void programacionIITieneCorrelativa(){
        Materia programacioI=new Materia("Programacion I");

        Materia programacioII=new Materia("Programacion II");
        programacioII.addCorrelativa(programacioI);
        Assertions.assertTrue(programacioII.tieneCorrelativas());

    }
    @Test
    public void pabloNoPuedeCursarProgramacionII(){
        Materia programacioI=new Materia("Programacion I");
        Materia programacioII=new Materia("Programacion II");
        programacioII.addCorrelativa(programacioI);

        Alumno alumnoPablo =new Alumno("Pablo",new Integer(1));
        Assertions.assertFalse(programacioII.puedoCursar(alumnoPablo));

    }
    @Test
    public void pabloPuedeCursarProgramacionI(){
        Materia programacioI=new Materia("Programacion I");

        Alumno alumnoPablo =new Alumno("Pablo",new Integer(1));
        Assertions.assertTrue(programacioI.puedoCursar(alumnoPablo));

    }
    @Test
    public void imprimoProgracmacionIComoNombreDeLaMateria(){
        Materia programacioI=new Materia("Programacion I");
        Assertions.assertEquals("Programacion I",programacioI.toString());


    }
}
