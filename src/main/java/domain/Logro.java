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
 *
 * <p>Esta clase representa un logro obtenido por un alumno o entidad,
 * incluyendo su identificador, categoría y descripción.</p>
 */
public class Logro {

    /**
     * Identificador único del logro.
     */
    private int id;

    /**
     * Categoría a la que pertenece el logro.
     */
    private String categoria;

    /**
     * Descripción del logro.
     */
    private String descripcion;

    /**
     * Constructor vacío que permite crear un objeto de tipo Logro
     * sin inicializar sus atributos.
     */
    public Logro() {}

    /**
     * Constructor que inicializa un objeto de tipo Logro con los valores
     * proporcionados.
     *
     * @param id identificador único del logro
     * @param categoria categoría del logro
     * @param descripcion descripción detallada del logro
     */
    public Logro(int id, String categoria, String descripcion) {
        this.id = id;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el identificador único del logro.
     *
     * @return identificador del logro
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del logro.
     *
     * @param id identificador a asignar
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la categoría del logro.
     *
     * @return categoría del logro
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del logro.
     *
     * @param categoria categoría a asignar
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene la descripción del logro.
     *
     * @return descripción del logro
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del logro.
     *
     * @param descripcion descripción a asignar
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}