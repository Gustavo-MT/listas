package exercicio2;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2, soma, subtracao, produto;
        float divisao;

        System.out.print("Digite o primeiro numero: ");
        num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();

        soma = num1 + num2;
        subtracao = num1 - num2;
        produto = num1 * num2;
        divisao = num1 / num2;

        System.out.println("================================    ");
        System.out.println("Soma dos numeros: " + soma);
        System.out.println("Subtracao dos numeros: " + subtracao);
        System.out.println("Produto dos numeros: " + produto);
        System.out.println("Divisao dos numeros: " + divisao);
    }
    
}
