/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Clase: ReporteTutorTest 
 * Proyecto: Ni Idea Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReporteTutorTest {

    @Test
    public void testConstructorConParametros() {
        ReporteTutor r = new ReporteTutor(1, "Reporte del tutor sobre desempeño");
        assertEquals(1, r.getId());
        assertEquals("Reporte del tutor sobre desempeño", r.getContenido());
    }

    @Test
    public void testSetters() {
        ReporteTutor r = new ReporteTutor();
        r.setId(2);
        r.setContenido("Nuevo reporte del tutor");

        assertEquals(2, r.getId());
        assertEquals("Nuevo reporte del tutor", r.getContenido());
    }
}
