package com.mycompany.listasigor;

import java.util.Scanner;

public class EX11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        int n1 = sc.nextInt();

        System.out.println("Informe o segundo número");
        int n2 = sc.nextInt();
        
        int soma = 0;

        for (int i = n1 + 1; i <= n2 - 1; i++) {
            soma += i;
        }
        System.out.println("Soma: " + soma);
    }
}
