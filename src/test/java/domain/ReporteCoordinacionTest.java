/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Clase: ReporteCoordinacionTest
 * Proyecto: Ni Idea 
 * Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 *
 * <p>Esta clase contiene las pruebas unitarias para la clase
 * {@link ReporteCoordinacion}, verificando el correcto funcionamiento
 * de sus constructores, getters y setters. Los ejemplos de prueba
 * están relacionados con reportes de coordinación de proyectos.</p>
 */
public class ReporteCoordinacionTest {

    /**
     * Prueba unitaria que verifica el correcto funcionamiento
     * del constructor con parámetros y de los métodos getters
     * de la clase {@link ReporteCoordinacion}.
     */
    @Test
    public void testConstructorConParametros() {
        ReporteCoordinacion rc = new ReporteCoordinacion(1, "Coordinación revisó avance del proyecto");
        assertEquals(1, rc.getId());
        assertEquals("Coordinación revisó avance del proyecto", rc.getDetalle());
    }

    /**
     * Prueba unitaria que verifica el correcto funcionamiento
     * de los métodos setters de la clase {@link ReporteCoordinacion}.
     */
    @Test
    public void testSetters() {
        ReporteCoordinacion rc = new ReporteCoordinacion();
        rc.setId(2);
        rc.setDetalle("Se aprobó el portafolio final");

        assertEquals(2, rc.getId());
        assertEquals("Se aprobó el portafolio final", rc.getDetalle());
    }
}
