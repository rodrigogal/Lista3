package com.mycompany.listasigor;

import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Informe uma nota: ");

            double nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Nota: " + nota);
            } else {
                System.out.println("Nota inválida, digite novamente. ");
            }
        } while (!notaValida);

    }

}
