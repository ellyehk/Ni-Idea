/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Clase: ReporteTutor
 * Proyecto: Ni Idea 
 * Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 *
 * <p>Esta clase representa un reporte generado por un tutor, el cual
 * incluye un identificador único y un contenido descriptivo.</p>
 */
public class ReporteTutor {

    /**
     * Identificador único del reporte del tutor.
     */
    private int id;

    /**
     * Contenido o descripción del reporte del tutor.
     */
    private String contenido;

    /**
     * Constructor vacío que permite crear un objeto ReporteTutor
     * sin inicializar sus atributos.
     */
    public ReporteTutor() {}

    /**
     * Constructor que inicializa un objeto ReporteTutor con los valores
     * proporcionados.
     *
     * @param id identificador único del reporte
     * @param contenido contenido o descripción del reporte
     */
    public ReporteTutor(int id, String contenido) {
        this.id = id;
        this.contenido = contenido;
    }

    /**
     * Obtiene el identificador único del reporte del tutor.
     *
     * @return identificador del reporte
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del reporte del tutor.
     *
     * @param id identificador a asignar
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el contenido o descripción del reporte del tutor.
     *
     * @return contenido del reporte
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Establece el contenido o descripción del reporte del tutor.
     *
     * @param contenido contenido a asignar
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
