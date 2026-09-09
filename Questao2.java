// Leia duas matrizes 2x2, some as duas matrizes e apresente a matriz resultante.

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] matrizC = new int[2][2];

        // Leitura da matriz A
        System.out.println("Preenchendo a Matriz A:");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print("Digite o elemento A[" + linha + "][" + coluna + "]: ");
                matrizA[linha][coluna] = input.nextInt();
            }
        }

        // Leitura da matriz B
        System.out.println();
        System.out.println("Preenchendo a Matriz B:");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print("Digite o elemento B[" + linha + "][" + coluna + "]: ");
                matrizB[linha][coluna] = input.nextInt();
            }
        }

        // Soma das matrizes (posição a posição)
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                matrizC[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
            }
        }

        // Apresenta a Matriz A
        System.out.println();
        System.out.println("Matriz A:");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print(matrizA[linha][coluna] + "\t");
            }
            System.out.println();
        }

        // Apresenta a Matriz B
        System.out.println();
        System.out.println("Matriz B:");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print(matrizB[linha][coluna] + "\t");
            }
            System.out.println();
        }

        // Apresenta a Matriz C (resultado da soma)
        System.out.println();
        System.out.println("Matriz C (A + B):");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print(matrizC[linha][coluna] + "\t");
            }
            System.out.println();
        }

        input.close();

    }
}