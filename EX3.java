package com.mycompany.listasigor;

import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo, ec;
        int idade;
        double salario;
        

        boolean infoValida = false;

        do {
            System.out.println("Informe o nome: ");
            nome = sc.next();

            if (nome.length() >= 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa no mínimo 3 caracteres.");
            }
        } while(!infoValida);
        
        infoValida = false;
        
        do {
            System.out.println("Informe a idade: ");
            idade = sc.nextInt();

            if (idade >= 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        } while(!infoValida);
        
        infoValida = false;
        
        do {
            System.out.println("Informe o salário: ");
            salario = sc.nextDouble();

            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0.");
            }
        } while(!infoValida);
        
        infoValida = false;
        
        do {
            System.out.println("Informe o sexo: ");
            sexo = sc.next();

            if (sexo.equals("f") || sexo.equals("m")) {
                infoValida = true;
            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm'.");
            }
        } while(!infoValida);
        
        infoValida = false;
        
        do {
            System.out.println("Informe o estado civil: ");
            ec = sc.next();

            if (ec.equals("s") || sexo.equals("c") || sexo.equals("v") || sexo.equals("d")) {
                infoValida = true;
            } else {
                System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'.");
            }
        } while(!infoValida);
        
        System.out.println("Informações: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + ec);
        
    }
}
