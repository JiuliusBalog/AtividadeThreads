package controller;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5 extends Thread {
    private String servidor;
    private String nomeServidor;
    
    public Ex5(String servidor, String nomeServidor) {
        this.servidor = servidor;
        this.nomeServidor = nomeServidor;
    }

    @Override
    public void run() {
        try {
            ProcessBuilder pb = new ProcessBuilder("ping", "-4", "-c", "10", servidor);
            Process processo = pb.start();
            BufferedReader leitor = new BufferedReader(new InputStreamReader(processo.getInputStream()));
            String linha;
            Pattern pattern = Pattern.compile("time=(\\d+\\.\\d+) ms");
            double somaTempos = 0;
            int count = 0;

            while ((linha = leitor.readLine()) != null) {
                Matcher matcher = pattern.matcher(linha);
                if (matcher.find()) {
                    double tempo = Double.parseDouble(matcher.group(1));
                    somaTempos += tempo;
                    count++;
                    System.out.println(nomeServidor + " - Tempo: " + tempo + " ms");
                }
            }
            
            if (count > 0) {
                double media = somaTempos / count;
                System.out.println(nomeServidor + " - Tempo médio: " + media + " ms");
            } else {
                System.out.println(nomeServidor + " - Falha ao obter tempos de resposta.");
            }
            
        } catch (Exception e) {
            System.err.println("Erro ao executar ping para " + nomeServidor);
            e.printStackTrace();
        }
    }
}
