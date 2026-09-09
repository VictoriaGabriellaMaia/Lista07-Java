// Leia os elementos de uma matriz 5x5 a partir do teclado. O algoritmo deve:
// a) Imprimir a matriz informada
// b) Imprimir os elementos em que o índice da linha é par e o índice da coluna é ímpar

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        // Leitura da matriz
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print("Digite o elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // a) Imprime a matriz informada
        System.out.println();
        System.out.println("Matriz informada:");
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        // b) Elementos onde linha é par e coluna é ímpar
        System.out.println();
        System.out.println("Elementos com linha par e coluna ímpar:");
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (linha % 2 == 0 && coluna % 2 != 0) {
                    System.out.println("Posição [" + linha + "][" + coluna + "]: " + matriz[linha][coluna]);
                }
            }
        }

        input.close();

    }
}