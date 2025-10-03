/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Clase: Usuario
 * Proyecto: Ni Idea 
 * Materia: Taller de Investigación I
 * Docente: Francisco Javier Montecillo Pueste 
 * Programador: Leslye Hernández Jiménez
 * Fecha: 02/10/2025
 *
 * <p>Esta clase representa a un usuario del sistema, con atributos 
 * básicos como identificador, nombre y correo electrónico.</p>
 */
public class Usuario {

    /**
     * Identificador único del usuario.
     */
    private int id;

    /**
     * Nombre del usuario.
     */
    private String nombre;

    /**
     * Correo electrónico del usuario.
     */
    private String correo;

    /**
     * Constructor vacío que permite crear un objeto Usuario
     * sin inicializar sus atributos.
     */
    public Usuario() {}

    /**
     * Constructor que inicializa un objeto Usuario con los valores
     * proporcionados.
     *
     * @param id identificador único del usuario
     * @param nombre nombre del usuario
     * @param correo correo electrónico del usuario
     */
    public Usuario(int id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    /**
     * Obtiene el identificador único del usuario.
     *
     * @return identificador del usuario
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del usuario.
     *
     * @param id identificador a asignar
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     *
     * @return correo del usuario
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del usuario.
     *
     * @param correo correo a asignar
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
