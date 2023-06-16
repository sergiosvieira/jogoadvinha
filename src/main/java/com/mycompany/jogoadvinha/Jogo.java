/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogoadvinha;

/**
 *
 * @author Alunos
 */
public class Jogo {
    enum Palpite {Acertou, Maior, Menor};
    private int numeroSecreto = 0;
    private int totalErros = 0;
    private int totalChances = 0;
    public Jogo(int totalChances) {
        this.totalChances = totalChances;
        this.numeroSecreto = gerarNumeroSecreto();
    }
    private int gerarNumeroSecreto() {
        return (int)(Math.random() * 100.0) + 1;
    }
    public int getNumeroSecreto() {
        return numeroSecreto;
    }
    public Palpite testar(int valor) {
        if (valor == numeroSecreto) return Palpite.Acertou;
        else if (valor < numeroSecreto) return Palpite.Menor;
        else return Palpite.Maior;
    }
}
