/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.quest1fachada;

/**
 *
 * @author fleme
 */
public class Quest1fachada {

    public static void main(String... args) {

        Amplificador amp = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaPipoca pipoqueira = new MaquinaPipoca();
        Projetor projetor = new Projetor();
        StreamingPlayer player = new StreamingPlayer();
        Telao telao = new Telao();

        HomeTheaterFachada homeTheater
                = new HomeTheaterFachada(amp, player, projetor, luzes, telao, pipoqueira);

        homeTheater.assistirFilme("Barbie");
        homeTheater.fimDoFilme();
    }
}
