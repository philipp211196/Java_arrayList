package Javalista9;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]n=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Digite o "+(i+1)+" numero.");
            n[i] = sc.nextInt();
        }
        int maior = n[0];
        int menor = n[0];
        for (int i=1;i<5;i++){
            maior=Math.max(maior,n[i]);
            menor=Math.min(menor,n[i]);
        }
        System.out.println("Maior numero é: "+maior);
        System.out.println("Menor numero é: "+menor);
        sc.close();
    }
}
