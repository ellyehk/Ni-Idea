/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Clase: PortafolioTest
 * Proyecto: Ni Idea Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PortafolioTest {

    @Test
    public void testConstructorConParametros() {
        Alumno alumno = new Alumno(); // crea un alumno 
        Portafolio p = new Portafolio(1, "Proyecto de sistemas", alumno);

        assertEquals(1, p.getId());
        assertEquals("Proyecto de sistemas", p.getDescripcion());
        assertEquals(alumno, p.getAlumno());
    }

    @Test
    public void testSetters() {
        Portafolio p = new Portafolio();
        Alumno alumno = new Alumno();

        p.setId(2);
        p.setDescripcion("Portafolio de diseño");
        p.setAlumno(alumno);

        assertEquals(2, p.getId());
        assertEquals("Portafolio de diseño", p.getDescripcion());
        assertEquals(alumno, p.getAlumno());
    }
}
