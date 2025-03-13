package view;
import controller.Ex2;
import java.util.Random;

public class principal2 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        Random random = new Random();
        
        // Preenche a matriz com números aleatórios e exibe a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(10) + 1; // Números entre 1 e 10
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Criando e iniciando as threads
        for (int i = 0; i < 3; i++) {
            new Ex2(matriz[i], i).start();
        }
    }
}