package view;
import controller.Ex3;
import java.util.Random;

public class principal3 {
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        Random random = new Random();
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1;
        }
        
        Ex3 thread1 = new Ex3(1, vetor);
        Ex3 thread2 = new Ex3(2, vetor);
        
        thread1.start();
        thread2.start();
    }
}

