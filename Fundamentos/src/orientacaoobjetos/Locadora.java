package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Locadora {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Cliente c1 = new Cliente("Zulady");
        System.out.println(c1);
        double valorlocacaoSimples = c1.calcularlocacao(3);
        System.out.println("O valor para a locação do filme simple é:" + valorlocacaoSimples);
        
        Cliente c2 = new Cliente("Rafaella Fávero", "rafaella@gmail.com");
        System.out.println(c2);
        double valorlocacaoLancamento = c2.calcularlocacao(3, true);
        System.out.println("O valor para a locação do filme lançamento é:" + valorlocacaoLancamento);
    }
    
}
