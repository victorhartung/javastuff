package ex;

import java.util.Locale;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] alturas = new double[n];
        String[] nomes = new String[n];
        int[] idades = new int[n];

        System.out.println("Quantas pessoas? ");

        for(int i = 0; i<n; i++) {
            System.out.println("Dados da " +(i+1)+"a pessoa");
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idades: ");
            idades[i] = sc.nextInt();
            System.out.println("Alturas: ");
            alturas[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for(int i=0; i< n; i++) {
            soma = soma + alturas[i];
        }
        double mediaAlturas = soma / n;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", mediaAlturas);

        int cont = 0;
        for(int i=0; i< n; i++) {
            if(idades[i] < 16){
                cont++;
            }
        }
        double percent = cont * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        for(int i = 0; i<n; i++) {
            if(idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();

    }
}
