package exercicio3;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int distancia, gasosa;
        float gasto;

        System.out.print("Digite a distancia percorrida pelo automovel (Km): ");
        distancia = entrada.nextInt();

        System.out.print("Digite a quantidade de combustível gasta (L): ");
        gasosa = entrada.nextInt();

        gasto = distancia / gasosa;

        System.out.println("O gasto medio de combustivel é de " + gasto + "Km/L.");

    }

}