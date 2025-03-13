package controller;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Ex4 extends Thread {
    private static final int DISTANCIA_TOTAL = 50;
    private static final int SALTO_MAXIMO = 5;
    private static AtomicInteger colocacaoAtual = new AtomicInteger(1);
    
    private String nome;
    private int distanciaPercorrida = 0;
    private Random random = new Random();
    
    public Ex4(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        while (distanciaPercorrida < DISTANCIA_TOTAL) {
            int salto = random.nextInt(SALTO_MAXIMO + 1);
            distanciaPercorrida += salto;
            
            if (distanciaPercorrida > DISTANCIA_TOTAL) {
                distanciaPercorrida = DISTANCIA_TOTAL;
            }
            
            System.out.println(nome + " saltou " + salto + " metros. Distância percorrida: " + distanciaPercorrida + " metros.");
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        int colocacao = colocacaoAtual.getAndIncrement();
        System.out.println(nome + " chegou em " + colocacao + "º lugar!");
    }
}
