/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Clase: ReporteCoordinacionTest 
 * Proyecto: Ni Idea Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReporteCoordinacionTest {

    @Test
    public void testConstructorConParametros() {
        ReporteCoordinacion rc = new ReporteCoordinacion(1, "Coordinación revisó avance del proyecto");
        assertEquals(1, rc.getId());
        assertEquals("Coordinación revisó avance del proyecto", rc.getDetalle());
    }

    @Test
    public void testSetters() {
        ReporteCoordinacion rc = new ReporteCoordinacion();
        rc.setId(2);
        rc.setDetalle("Se aprobó el portafolio final");

        assertEquals(2, rc.getId());
        assertEquals("Se aprobó el portafolio final", rc.getDetalle());
    }
}
