/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase2.calculadorapromedio.dominio.calculo;

import com.unab.clase2.calculadorapromedio.dominio.calificacion;

public class logica {

    calificacion atr = new calificacion();

    public void calificacion1(calificacion atr) {
        double lab1 = Double.parseDouble(atr.getLab1()) * 0.40;
        double parcial1 = Double.parseDouble(atr.getParcial1()) * 0.60;
        double promedio1 = lab1 + parcial1;
        promedio1 /= 3;
        atr.setResultado1(promedio1);

    }

    public void calificacion2(calificacion atr) {
        double lab2 = Double.parseDouble(atr.getLab2()) * 0.40;
        double parcial2 = Double.parseDouble(atr.getParcial1()) * 0.60;
        double promedio2 = lab2 + parcial2;
        promedio2 /= 3;
        atr.setResultado2(promedio2);

    }

    public void calificacion3(calificacion atr) {
        double lab1 = Double.parseDouble(atr.getLab3()) * 0.40;
        double parcial3 = Double.parseDouble(atr.getParcial3()) * 0.60;
        double promedio3 = lab1 + parcial3;
        promedio3 /= 3;
        atr.setResultado3(promedio3);

    }
    double mostrarpromfinal = 0.0;

    public void promfinal(calificacion atr) {
        double promfinal;
        promfinal = atr.getResultado1() + atr.getResultado2() + atr.getResultado3();
        atr.setPromfinal(promfinal);

        this.mostrarpromfinal = promfinal;
    }

    

}
