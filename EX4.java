package com.mycompany.listasigor;

//import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        
        long popA = 80000;
        long popB = 200000;
        int i = 0;
       
        while (popA <= popB){
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            i++;
        }
        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("QNT ANOS: " + i);
    }
}
