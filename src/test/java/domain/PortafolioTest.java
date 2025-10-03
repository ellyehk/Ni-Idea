/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Clase: PortafolioTest
 * Proyecto: Ni Idea 
 * Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 *
 * <p>Esta clase contiene las pruebas unitarias para la clase
 * {@link Portafolio}, verificando el correcto funcionamiento de
 * sus constructores, getters y setters. Los ejemplos de prueba
 * están relacionados con proyectos de ciberseguridad y redes.</p>
 */
public class PortafolioTest {

    /**
     * Prueba unitaria que verifica el correcto funcionamiento
     * del constructor con parámetros y de los métodos getters
     * de la clase {@link Portafolio}.
     */
    @Test
    public void testConstructorConParametros() {
        Alumno alumno = new Alumno(); // crea un alumno 
        Portafolio p = new Portafolio(1, "Proyecto de ciberseguridad", alumno);

        assertEquals(1, p.getId());
        assertEquals("Proyecto de ciberseguridad", p.getDescripcion());
        assertEquals(alumno, p.getAlumno());
    }

    /**
     * Prueba unitaria que verifica el correcto funcionamiento
     * de los métodos setters de la clase {@link Portafolio}.
     */
    @Test
    public void testSetters() {
        Portafolio p = new Portafolio();
        Alumno alumno = new Alumno();

        p.setId(2);
        p.setDescripcion("Portafolio de redes");
        p.setAlumno(alumno);

        assertEquals(2, p.getId());
        assertEquals("Portafolio de redes", p.getDescripcion());
        assertEquals(alumno, p.getAlumno());
    }
}
