/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josuezelaya;

/**
 *
 * @author usuario
 */
public class Restaurante extends Lugar{
    private String categoria;
    private int calificacion;

    public Restaurante() {
        super();
    }

    public Restaurante(String categoria, int calificacion, String nombre, String dirreccion, int nivel_seguridad, Carretera carretera_entrada, Carretera carretera_salida) {
        super(nombre, dirreccion, nivel_seguridad, carretera_entrada, carretera_salida);
        this.categoria = categoria;
        this.calificacion = calificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
}
