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
public class Lugar {
    private String nombre;
    private String dirreccion;
    private int nivel_seguridad;
    private Carretera carretera_entrada;
    private Carretera carretera_salida;

    public Lugar() {
    }

    public Lugar(String nombre, String dirreccion, int nivel_seguridad, Carretera carretera_entrada, Carretera carretera_salida) {
        this.nombre = nombre;
        this.dirreccion = dirreccion;
        this.nivel_seguridad = nivel_seguridad;
        this.carretera_entrada = carretera_entrada;
        this.carretera_salida = carretera_salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public int getNivel_seguridad() {
        return nivel_seguridad;
    }

    public void setNivel_seguridad(int nivel_seguridad) {
        this.nivel_seguridad = nivel_seguridad;
    }

    public Carretera getCarretera_entrada() {
        return carretera_entrada;
    }

    public void setCarretera_entrada(Carretera carretera_entrada) {
        this.carretera_entrada = carretera_entrada;
    }

    public Carretera getCarretera_salida() {
        return carretera_salida;
    }

    public void setCarretera_salida(Carretera carretera_salida) {
        this.carretera_salida = carretera_salida;
       
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
