/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade01;

/**
 *
 * @author Aluno
 */
public enum ProdutosCantina {
    PRODUTO1("Sal"), 
    PRODUTO2("Açucar"), 
    PRODUTO3("Hamburguer"), 
    PRODUTO4("Coca-Cola"), 
    PRODUTO5("Guaraná"), 
    PRODUTO6("Salgadinho"),
    PRODUTO7("Coxinha"),
    PRODUTO8("Suco");
    
    private String status;

    private ProdutosCantina(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
    
    
}
