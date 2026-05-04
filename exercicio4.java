package treinamento;

import java.util.Scanner;

public class exercicio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] a = {25,27,9,19,10};
        System.out.println("Digite um numero entre 1 e 30 para conferir se voce ganhou.");
        int numero = sc.nextInt();
        boolean encontrado = false;
        for (int j : a) {
            if (j == numero) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Parabens voce ganhou !" +numero);
        } else {
            System.out.println("Não foi desta vez, boa sorte na proxima.!");
        }

        sc.close();
    }}