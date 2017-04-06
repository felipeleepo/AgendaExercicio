package entidades;

/**
 *
 * @author Felipe
 */
public class PessoaFisica extends Pessoa {
    private int cpf;
        
    public PessoaFisica(int cpf, String nome, String sobrenome, int idade){
        super(nome, sobrenome, idade);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public String toString(){
       return "\nCPF: " + cpf;
    }
}
