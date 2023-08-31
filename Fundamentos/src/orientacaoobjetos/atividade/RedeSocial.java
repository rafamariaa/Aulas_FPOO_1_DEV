package orientacaoobjetos.atividade;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class RedeSocial {
    public static void main(String[] args) throws UnsupportedEncodingException{
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Post post1 = new Post("foto ", 334, 543 ); 
        post1.classificarEstrela(post1.getClassificacaoPost());
        System.out.println(post1);
        
        
    }
    
}
