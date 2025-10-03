/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Clase: AlumnoTest
 * Proyecto: Ni Idea 
 * Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 *
 * <p>Esta clase contiene las pruebas unitarias para la clase
 * {@link Alumno}, verificando el correcto funcionamiento de sus
 * constructores, getters y setters.</p>
 */
public class AlumnoTest {

    /**
     * Prueba unitaria que verifica el correcto funcionamiento
     * del constructor con parámetros y de los métodos getters
     * de la clase {@link Alumno}.
     */
    @Test
    public void testConstructorAndGetters() {
        Alumno alumno = new Alumno("12345", "Carlos");

        assertEquals("12345", alumno.getNumeroControl());
        assertEquals("Carlos", alumno.getNombre());
    }

    /**
     * Prueba unitaria que verifica el correcto funcionamiento
     * de los métodos setters de la clase {@link Alumno}.
     */
    @Test
    public void testSetters() {
        Alumno alumno = new Alumno();
        alumno.setNumeroControl("67890");
        alumno.setNombre("Leslye");

        assertEquals("67890", alumno.getNumeroControl());
        assertEquals("Leslye", alumno.getNombre());
    }
}
