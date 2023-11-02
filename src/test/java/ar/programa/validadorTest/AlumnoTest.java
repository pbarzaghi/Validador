package ar.programa.validadorTest;

import ar.programa.validador.Alumno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlumnoTest {

@Test
 public void imprimirPabloNombreAlumno(){
     Alumno alumnoPablo=new Alumno("Pablo",new Integer(1));
     Assertions.assertEquals("Pablo",alumnoPablo.toString());

 }


}
