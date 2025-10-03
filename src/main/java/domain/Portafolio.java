/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Clase: Portafolio 
 * Proyecto: Ni Idea Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 */
import java.util.ArrayList;
import java.util.List;

public class Portafolio {
    private int id;
    private String descripcion;
    private Alumno alumno;
    private List<Logro> logros;

    // Constructor vacío
    public Portafolio() {
        this.logros = new ArrayList<>();
    }

    // Constructor con parámetros
    public Portafolio(int id, String descripcion, Alumno alumno) {
        this.id = id;
        this.descripcion = descripcion;
        this.alumno = alumno;
        this.logros = new ArrayList<>();
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Logro> getLogros() {
        return logros;
    }

    // Método para agregar logros
    public void addLogro(Logro logro) {
        this.logros.add(logro);
    }
}
