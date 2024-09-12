package DigiteSeusDados;

import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {

        Scanner escreva = new Scanner(System.in);

        String nome;
        String sobrenome;
        int idade;
        double altura;
        String comida;

        System.out.print("Escreva o seu nome: ");
        nome = escreva.next();

        System.out.print("Escreva o seu sobrenome: ");
        sobrenome = escreva.next();

        System.out.print("Idade: ");
        idade = escreva.nextInt();

        System.out.print("Altura: ");
        altura = escreva.nextDouble();

        System.out.print("Comida preferida: ");
        comida = escreva.next();

        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Eu tenho " + idade + " anos de idade.");
        System.out.println("Tenho " + altura + "cm de altura.");
        System.out.println("E minha comida preferida é " + comida );

    }
}
