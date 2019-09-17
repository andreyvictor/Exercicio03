package com.unama;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de notas: ");
        int avaliacoes = scanner.nextInt();
        double media = 0;
        for(int i=1; i<=avaliacoes; i++){
            System.out.println("Informe a nota " +i);
            double nota = scanner.nextDouble();
            media=media+nota;
        }
        media=media/avaliacoes;
        System.out.println("A média de sua turma é: " +media);
    }
}
