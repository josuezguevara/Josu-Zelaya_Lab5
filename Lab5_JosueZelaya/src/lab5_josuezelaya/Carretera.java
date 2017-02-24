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
class Carretera {
    private int numero;
    private double kilometros;
    private Lugar lugar_inicio;
    private Lugar lugar_final;

    public Carretera() {
    }

    public Carretera(int numero, double kilometros, Lugar lugar_inicio, Lugar lugar_final) {
        this.numero = numero;
        this.kilometros = kilometros;
        this.lugar_inicio = lugar_inicio;
        this.lugar_final = lugar_final;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public Lugar getLugar_inicio() {
        return lugar_inicio;
    }

    public void setLugar_inicio(Lugar lugar_inicio) {
        this.lugar_inicio = lugar_inicio;
    }

    public Lugar getLugar_final() {
        return lugar_final;
    }

    public void setLugar_final(Lugar lugar_final) {
        this.lugar_final = lugar_final;
    }

    @Override
    public String toString() {
        return Integer.toString(numero);
    }
    
}
