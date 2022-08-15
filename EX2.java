package com.mycompany.listasigor;

import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean infoValidas = false;
        
        do {
            System.out.println("Nome do Usuário: ");
            String nomeUser = sc.next();
            
            System.out.println("Senha: ");
            String senha = sc.next();
            
            if (nomeUser.equals(senha)){
                infoValidas = false;
                System.out.println("Senha igual ao Usuário, digite novamente!");
            } else {
                infoValidas = true;
                System.out.println("Senha e Usuário válidos!");
            }

        } while(!infoValidas);
    }
}
