/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Clase: ReporteTutorTest
 * Proyecto: Ni Idea 
 * Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 *
 * <p>Esta clase contiene las pruebas unitarias para la clase
 * {@link ReporteTutor}, verificando el correcto funcionamiento
 * de sus constructores, getters y setters. Los ejemplos de prueba
 * simulan reportes generados por tutores sobre desempeño académico
 * o en proyectos de ciberseguridad y redes.</p>
 */
public class ReporteTutorTest {

    /**
     * Prueba unitaria que verifica el correcto funcionamiento
     * del constructor con parámetros y de los métodos getters
     * de la clase {@link ReporteTutor}.
     */
    @Test
    public void testConstructorConParametros() {
        ReporteTutor r = new ReporteTutor(1, "Reporte del tutor sobre desempeño");
        assertEquals(1, r.getId());
        assertEquals("Reporte del tutor sobre desempeño", r.getContenido());
    }

    /**
     * Prueba unitaria que verifica el correcto funcionamiento
     * de los métodos setters de la clase {@link ReporteTutor}.
     */
    @Test
    public void testSetters() {
        ReporteTutor r = new ReporteTutor();
        r.setId(2);
        r.setContenido("Nuevo reporte del tutor");

        assertEquals(2, r.getId());
        assertEquals("Nuevo reporte del tutor", r.getContenido());
    }
}
