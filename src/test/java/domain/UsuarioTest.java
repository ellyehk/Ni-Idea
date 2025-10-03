/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Clase: UsuarioTest
 * Proyecto: Ni Idea Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void testConstructorConParametros() {
        Usuario u = new Usuario(1, "Leslye", "Leslye@mail.com");
        assertEquals(1, u.getId());
        assertEquals("Leslye", u.getNombre());
        assertEquals("Leslye@mail.com", u.getCorreo());
    }

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

