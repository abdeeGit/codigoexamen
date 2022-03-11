package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alumno
 */
public class Examen {

    /* dejamos un comentario para la parte de documentacion */
    private String nombre;
    private String asignatura;
    private String evaluación;

    public Examen(String nombre, String asignatura, String evaluación) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.evaluación = evaluación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getEvaluación() {
        return evaluación;
    }

    public void setEvaluación(String evaluación) {
        this.evaluación = evaluación;
    }

    @Override
    public String toString() {
        return "Examen{" + "nombre=" + nombre + ", asignatura=" + asignatura + ", evaluaci\u00f3n=" + evaluación + '}';
    }

}
