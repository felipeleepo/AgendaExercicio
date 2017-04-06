package entidades;

/**
 *
 * @author Felipe
 */
public class PessoaJuridica extends Pessoa{
    private int cnpj;
    public PessoaJuridica(int cnpj, String nome, String sobrenome, int idade){
        super(nome, sobrenome, idade);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    
    public String toString() {
        return "\nCNPJ: " + cnpj;
    }
}
