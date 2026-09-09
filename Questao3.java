// Leia os elementos de uma matriz 6x6. O algoritmo deve:
// a) Apresentar a matriz informada
// b) Somar os elementos das colunas pares
// c) Somar os elementos das colunas ímpares
// d) Calcular a diferença entre as duas somas
// e) Apresentar os valores calculados na tela

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[6][6];

        // Leitura da matriz
        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 6; coluna++) {
                System.out.print("Digite o elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // a) Apresenta a matriz informada
        System.out.println();
        System.out.println("Matriz informada:");
        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 6; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        // b) Soma das colunas pares
        int somaColunasPares = 0;
        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 6; coluna++) {
                if (coluna % 2 == 0) {
                    somaColunasPares = somaColunasPares + matriz[linha][coluna];
                }
            }
        }

        // c) Soma das colunas ímpares
        int somaColunasImpares = 0;
        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 6; coluna++) {
                if (coluna % 2 != 0) {
                    somaColunasImpares = somaColunasImpares + matriz[linha][coluna];
                }
            }
        }

        // d) Diferença entre as somas
        int diferenca = somaColunasPares - somaColunasImpares;

        // e) Apresenta os valores calculados
        System.out.println();
        System.out.println("Soma das colunas pares: " + somaColunasPares);
        System.out.println("Soma das colunas ímpares: " + somaColunasImpares);
        System.out.println("Diferença entre as somas: " + diferenca);

        input.close();

    }
}