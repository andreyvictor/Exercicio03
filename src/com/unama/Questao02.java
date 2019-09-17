package com.unama;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de pacientes: ");
        int quantidadePaciente = scanner.nextInt();
        int idadePaciente;
        int idadeMaisVelho = 0;
        for (int i = 1; i <= quantidadePaciente; i++) {
            System.out.println("Informe a idade: " + i);
            idadePaciente = scanner.nextInt();
            if (idadePaciente > idadeMaisVelho) {
                idadeMaisVelho = idadePaciente ;
            }
        }
        System.out.println("Idade do mais velho é: " +idadeMaisVelho);
    }
}