/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Clase: ReporteCoordinacion
 * Proyecto: Ni Idea 
 * Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 *
 * <p>Esta clase representa un reporte de coordinación, el cual contiene
 * un identificador y un detalle descriptivo.</p>
 */
public class ReporteCoordinacion {

    /**
     * Identificador único del reporte.
     */
    private int id;

    /**
     * Detalle o descripción del reporte de coordinación.
     */
    private String detalle;

    /**
     * Constructor vacío que permite crear un objeto de tipo
     * ReporteCoordinacion sin inicializar sus atributos.
     */
    public ReporteCoordinacion() {}

    /**
     * Constructor que inicializa un objeto ReporteCoordinacion con los valores
     * proporcionados.
     *
     * @param id identificador único del reporte
     * @param detalle detalle o descripción del reporte
     */
    public ReporteCoordinacion(int id, String detalle) {
        this.id = id;
        this.detalle = detalle;
    }

    /**
     * Obtiene el identificador único del reporte.
     *
     * @return identificador del reporte
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del reporte.
     *
     * @param id identificador a asignar
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el detalle o descripción del reporte.
     *
     * @return detalle del reporte
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * Establece el detalle o descripción del reporte.
     *
     * @param detalle detalle a asignar
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
