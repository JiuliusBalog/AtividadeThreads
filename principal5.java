package view;
import controller.Ex5;
public class principal5 {
    public static void main(String[] args) {
        String os = System.getProperty("os.name").toLowerCase();
        if (!os.contains("linux")) {
            System.out.println("Este programa só pode ser executado em sistemas Linux.");
            return;
        }
        
        Ex5 uol = new Ex5("www.uol.com.br", "UOL");
        Ex5 terra = new Ex5("www.terra.com.br", "Terra");
        Ex5 google = new Ex5("www.google.com.br", "Google");
        
        uol.start();
        terra.start();
        google.start();
        
        try {
            uol.join();
            terra.join();
            google.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Teste de ping finalizado.");
    }
}
