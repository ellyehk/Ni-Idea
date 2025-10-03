/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Clase: Alumno
 * Proyecto: Ni Idea
 * Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 *
 * <p>Esta clase representa a un alumno con atributos básicos como 
 * número de control y nombre. Permite la creación de instancias de 
 * alumnos, ya sea sin inicializar datos o con valores específicos.</p>
 */
public class Alumno {

    /**
     * Número de control del alumno.
     */
    private String numeroControl;

    /**
     * Nombre del alumno.
     */
    private String nombre;

    /**
     * Constructor vacío que permite crear un objeto de tipo Alumno
     * sin inicializar sus atributos.
     */
    public Alumno() {
    }

    /**
     * Constructor que inicializa un objeto de tipo Alumno con los valores
     * proporcionados.
     *
     * @param numeroControl número de control del alumno
     * @param nombre nombre completo del alumno
     */
    public Alumno(String numeroControl, String nombre) {
        this.numeroControl = numeroControl;
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de control del alumno.
     *
     * @return número de control del alumno
     */
    public String getNumeroControl() {
        return numeroControl;
    }

    /**
     * Establece el número de control del alumno.
     *
     * @param numeroControl número de control a asignar
     */
    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    /**
     * Obtiene el nombre del alumno.
     *
     * @return nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno.
     *
     * @param nombre nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
