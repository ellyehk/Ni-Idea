/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Clase: UsuarioTest
 * Proyecto: Ni Idea 
 * Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 *
 * <p>Esta clase contiene las pruebas unitarias para la clase
 * {@link Usuario}, verificando el correcto funcionamiento de
 * sus constructores, getters y setters. Los ejemplos de prueba
 * simulan usuarios relacionados con la gestión de proyectos de
 * ciberseguridad y redes.</p>
 */
public class UsuarioTest {

    /**
     * Prueba unitaria que verifica el correcto funcionamiento
     * del constructor con parámetros y de los métodos getters
     * de la clase {@link Usuario}.
     */
    @Test
    public void testConstructorConParametros() {
        Usuario u = new Usuario(1, "Leslye", "Leslye@mail.com");
        assertEquals(1, u.getId());
        assertEquals("Leslye", u.getNombre());
        assertEquals("Leslye@mail.com", u.getCorreo());
    }

    /**
     * Prueba unitaria que verifica el correcto funcionamiento
     * de los métodos setters de la clase {@link Usuario}.
     */
    @Test
    public void testSetters() {
        Usuario u = new Usuario();
        u.setId(2);
        u.setNombre("Carlos");
        u.setCorreo("carlos@mail.com");

        assertEquals(2, u.getId());
        assertEquals("Carlos", u.getNombre());
        assertEquals("carlos@mail.com", u.getCorreo());
    }
}
