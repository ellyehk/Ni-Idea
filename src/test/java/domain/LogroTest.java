/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Clase: LogroTest 
 * Proyecto: Ni Idea Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LogroTest {

    @Test
    public void testConstructorAndGetters() {
        Logro logro = new Logro(1, "Académico", "Primer lugar en matemáticas");

        assertEquals(1, logro.getId());
        assertEquals("Académico", logro.getCategoria());
        assertEquals("Primer lugar en matemáticas", logro.getDescripcion());
    }

    @Test
    public void testSetters() {
        Logro logro = new Logro();
        logro.setId(2);
        logro.setCategoria("Deportivo");
        logro.setDescripcion("Medalla de oro en fútbol");

        assertEquals(2, logro.getId());
        assertEquals("Deportivo", logro.getCategoria());
        assertEquals("Medalla de oro en fútbol", logro.getDescripcion());
    }
}
