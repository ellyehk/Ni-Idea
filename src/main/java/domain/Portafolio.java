/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase: Portafolio
 * Proyecto: Ni Idea 
 * Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 *
 * <p>Esta clase representa un portafolio que contiene información
 * sobre un alumno, incluyendo una descripción general y una lista
 * de logros asociados.</p>
 */
public class Portafolio {

    /**
     * Identificador único del portafolio.
     */
    private int id;

    /**
     * Descripción del portafolio.
     */
    private String descripcion;

    /**
     * Alumno al que pertenece el portafolio.
     */
    private Alumno alumno;

    /**
     * Lista de logros asociados al portafolio.
     */
    private List<Logro> logros;

    /**
     * Constructor vacío que inicializa la lista de logros.
     */
    public Portafolio() {
        this.logros = new ArrayList<>();
    }

    /**
     * Constructor que inicializa un objeto Portafolio con los valores
     * proporcionados y una lista vacía de logros.
     *
     * @param id identificador único del portafolio
     * @param descripcion descripción del portafolio
     * @param alumno alumno asociado al portafolio
     */
    public Portafolio(int id, String descripcion, Alumno alumno) {
        this.id = id;
        this.descripcion = descripcion;
        this.alumno = alumno;
        this.logros = new ArrayList<>();
    }

    /**
     * Obtiene el identificador único del portafolio.
     *
     * @return identificador del portafolio
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del portafolio.
     *
     * @param id identificador a asignar
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la descripción del portafolio.
     *
     * @return descripción del portafolio
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del portafolio.
     *
     * @param descripcion descripción a asignar
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el alumno al que pertenece el portafolio.
     *
     * @return objeto Alumno asociado
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * Establece el alumno asociado al portafolio.
     *
     * @param alumno objeto Alumno a asignar
     */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    /**
     * Obtiene la lista de logros del portafolio.
     *
     * @return lista de logros
     */
    public List<Logro> getLogros() {
        return logros;
    }

    /**
     * Agrega un logro al portafolio.
     *
     * @param logro objeto Logro a añadir
     */
    public void addLogro(Logro logro) {
        this.logros.add(logro);
    }
}
