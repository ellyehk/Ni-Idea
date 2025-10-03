/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Clase: ALumnoTest 
 * Proyecto: Ni Idea Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AlumnoTest {

    @Test
    public void testConstructorAndGetters() {
        Alumno alumno = new Alumno("12345", "Carlos");

        assertEquals("12345", alumno.getNumeroControl());
        assertEquals("Carlos", alumno.getNombre());
    }

    @Test
    public void testSetters() {
        Alumno alumno = new Alumno();
        alumno.setNumeroControl("67890");
        alumno.setNombre("Leslye");

        assertEquals("67890", alumno.getNumeroControl());
        assertEquals("Leslye", alumno.getNombre());
    }
}
