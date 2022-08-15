package com.mycompany.listasigor;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero = 0;
        int maior = numero;
        
        for (int i = 1 ; i <= 5 ; i++) {
            
            System.out.println("n" + i + ": ");
            numero = sc.nextInt();
            
            if (numero >= maior) {
                maior = numero;
            }
        }
        
        System.out.println("O maior número é o: " + maior);
    }
    
}