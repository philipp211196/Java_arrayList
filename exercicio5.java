package Javalista9;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 numeros , mostraremos a ordem inversa.");
        int[] n = new int[5];
        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println("seus numeros sao " + n[4] + " - " + n[3] + " - " + n[2] + " - " + n[1] + " - " + n[0]);
        sc.close();
    }
}
