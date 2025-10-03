/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Clase: Logro
 * Proyecto: Ni Idea
 * Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 */

public class Logro {
    private int id;
    private String categoria;
    private String descripcion;

    // Constructor vacío
    public Logro() {}

    // Constructor con parámetros
    public Logro(int id, String categoria, String descripcion) {
        this.id = id;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

