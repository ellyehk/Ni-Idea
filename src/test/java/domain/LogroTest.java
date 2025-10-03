/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Clase: LogroTest
 * Proyecto: Ni Idea 
 * Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 *
 * <p>Esta clase contiene las pruebas unitarias para la clase
 * {@link Logro}, verificando el correcto funcionamiento de sus
 * constructores, getters y setters. Los ejemplos de prueba están
 * relacionados con cursos de ciberseguridad y redes.</p>
 */
public class LogroTest {

    /**
     * Prueba unitaria que verifica el correcto funcionamiento
     * del constructor con parámetros y de los métodos getters
     * de la clase {@link Logro}.
     */
    @Test
    public void testConstructorAndGetters() {
        Logro logro = new Logro(1, "Ciberseguridad", "Certificación en Ethical Hacking");

        assertEquals(1, logro.getId());
        assertEquals("Ciberseguridad", logro.getCategoria());
        assertEquals("Certificación en Ethical Hacking", logro.getDescripcion());
    }

    /**
     * Prueba unitaria que verifica el correcto funcionamiento
     * de los métodos setters de la clase {@link Logro}.
     */
    @Test
    public void testSetters() {
        Logro logro = new Logro();
        logro.setId(2);
        logro.setCategoria("Redes");
        logro.setDescripcion("Curso avanzado en Configuración de Redes Cisco");

        assertEquals(2, logro.getId());
        assertEquals("Redes", logro.getCategoria());
        assertEquals("Curso avanzado en Configuración de Redes Cisco", logro.getDescripcion());
    }
}
