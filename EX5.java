package com.mycompany.listasigor;

import java.util.Scanner;

public class EX5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valido = false;

        double popA;
        double popB;
        double taxaA;
        double taxaB;

        do {
            System.out.println("Informe a população A: ");
            popA = sc.nextDouble();

            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("População A precisa ser maior que 0.");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Informe a população B: ");
            popB = sc.nextDouble();

            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("População B precisa ser maior que 0.");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Informe a taxa de crescimento da população A: ");
            taxaA = sc.nextDouble();

            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("Taxa de crescimento da população A precisa ser maior que 0.");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Informe a taxa de crescimento da população B: ");
            taxaB = sc.nextDouble();

            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("Taxa de crescimento da população B precisa ser maior que 0.");
            }

        } while (!valido);

        int i = 0;

        while (popA <= popB) {
            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            i++;
        }
        System.out.println("População A: " + popA);
        System.out.println("Taxa da população A: " + taxaA);
        System.out.println("População B: " + popB);
        System.out.println("Taxa da população B: " + taxaB);
        System.out.println("QNT ANOS: " + i);
    }
}
