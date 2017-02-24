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
public class Casa extends Lugar{

    public Casa() {
        super();
    }

    
    public Casa(String nombre, String dirreccion, int nivel_seguridad, Carretera carretera_entrada, Carretera carretera_salida) {
        super(nombre, dirreccion, nivel_seguridad, carretera_entrada, carretera_salida);
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

   
    
}
