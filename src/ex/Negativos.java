package ex;

import java.util.Scanner;

public class Negativos {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar?: ");
        int n = sc.nextInt();
        int[] vet = new int[n];

        for(int i = 0;i < n; i++) {
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for(int i = 0; i<n; i++) {
            if(vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }
        sc.close();
    }
}
