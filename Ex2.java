package controller;
import java.util.Random;

public class Ex2 extends Thread {
    private int[] linha;
    private int indice;

    public Ex2(int[] linha, int indice) {
        this.linha = linha;
        this.indice = indice;
    }

    @Override
    public void run() {
        int soma = 0;
        for (int num : linha) {
            soma += num;
        }
        System.out.println("Linha " + indice + " - Soma: " + soma);
    }
}