/*
Autor: Beatriz França

4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53
Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora. */

import java.util.Scanner;

public class Ex4
{
    public static void main(String[] args) {
        float total, estado;

       float porcentagem;
       Scanner inputNumScanner = new Scanner(System.in);

       System.out.println("Digite a soma do valor total : ");
       total = inputNumScanner.nextInt();

       System.out.println("Digite o valor do estado: ");
       estado = inputNumScanner.nextInt();

       porcentagem = (estado * 100/ total);

       System.out.println("A porcentagem desse estado é = " + porcentagem + " %");
    }
}