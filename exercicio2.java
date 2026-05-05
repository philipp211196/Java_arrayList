package Javalista9;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma=0;
        int[] n = new int[5];
        System.out.println("Digite 5 numeros.");
        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
            soma += n[i];
        }
        System.out.println(n[0]+"+"+n[1]+"+"+n[2]+"+"+n[3]+"+"+n[4]+"="+soma);
        sc.close();
    }}

