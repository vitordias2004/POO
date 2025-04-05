public class Cliente {
    String nome;
    long cpf;
    Computador[] computadores_comprados = new Computador[3];

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    float calculaTotalCompra(){
        float total = 0;
        for(Computador c : computadores_comprados){
            if(c != null){
                total += c.preco;
            }
        }
        return total;
    }
}
