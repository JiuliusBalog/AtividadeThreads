package controller;
import java.util.Random;

public class Ex3 extends Thread {
    private int num;
    private int[] vet;

    public Ex3(int num, int[] vet) {
        this.num = num;
        this.vet = vet;
    }

    @Override
    public void run() {
        long inicio = System.nanoTime();
        
        if (num % 2 == 0) {
            for (int i = 0; i < vet.length; i++) {
                int temp = vet[i]; // Simulação de processamento
            }
        } else {
            for (int valor : vet) {
                int temp = valor; // Simulação de processamento
            }
        }
        
        long fim = System.nanoTime();
        double tempoSegundos = (fim - inicio) / 1_000_000_000.0;
        System.out.println("Thread " + num + " - Tempo: " + tempoSegundos + " segundos");
    }
}