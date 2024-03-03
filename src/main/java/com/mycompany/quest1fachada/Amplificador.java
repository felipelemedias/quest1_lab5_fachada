/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quest1fachada;

/**
 *
 * @author fleme
 */
public class Amplificador {

    private int volume;

    public void liga() {
        System.out.println("Ligando amplificador..");
    }
    
    public void Desliga() {
        System.out.println("Desligando amplificador..");
    }

    public void ajustaVolume(int nivel) {
        if (nivel >= 0 && nivel <= 100) { 
            this.volume = nivel;
            System.out.println("Volume ajustado para: " + this.volume);
        } else {
            System.out.println("Nível de volume inválido. O nível deve estar entre 0 e 100.");
        }
    }
}
