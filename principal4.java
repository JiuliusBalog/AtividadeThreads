package view;
import controller.Ex4;

public class principal4 {
    public static void main(String[] args) {
        Ex4[] sapos = {
            new Ex4("Sapo 1"),
            new Ex4("Sapo 2"),
            new Ex4("Sapo 3"),
            new Ex4("Sapo 4"),
            new Ex4("Sapo 5")
        };
        
        for (Ex4 sapo : sapos) {
            sapo.start();
        }
    }
}
