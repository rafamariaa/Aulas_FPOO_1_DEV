package orientacaoobjetos;

public class Cliente implements AluguelFilme{
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        if (this.email == null) {
             return "Cliente{" + "nome=" + nome + '}';      
        } else {
             return "Cliente{" + "nome=" + nome + ", email=" + email + '}';
        }
       
    }
    /**
     * Calcula o valor total da locação do filme
     * Regra para filmes comuns.
     * @param qtdeDias
     * @return 
     */
    public double calcularlocacao(int qtdeDias){
        return qtdeDias * VALOR_FILME_SIMPLES;
    }
    
    /**
     * Calcula o valor total da locação do filme
     * Regra para filmes novos.
     * @param qtdeDias
     * @param lancamento
     * @return 
     */
    public double calcularlocacao(int qtdeDias, boolean lancamento){
        return qtdeDias * VALOR_FILME_LANCAMENTO;
    }
}
