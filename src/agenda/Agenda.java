package agenda;

import entidades.Pessoa;
import excecoes.AgendaException;
import interfaces.IAgenda;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Felipe
 */
public class Agenda implements IAgenda{

    private List<Pessoa> l = new ArrayList<>();
    
    @Override
    public void gravar(Pessoa p) {
        l.add(p);
    }

    @Override
    public void remover(Pessoa p) {
        l.remove(p);
    }

    @Override
    public Pessoa getByNome(String nome) throws AgendaException {
        AgendaException e = new AgendaException("Usuário não encontrado.");
        for(Pessoa aux : l)
            if(aux.getNome().equals(nome))
                return aux;
        throw e;
    }

    @Override
    public List<Pessoa> listaTodos() throws AgendaException {
        if(l.isEmpty())
            throw new AgendaException("Não há contatos na agenda");
        return l;
    }
    
    public void menu(){
        System.out.println("----AGENDA-----");
        System.out.println("1 - Adicionar Pessoa Física");
        System.out.println("2 - Adicionar Pessoa Jurídica");
        System.out.println("3 - Listar Contatos");
        System.out.println("4 - Listar por Nome");
        System.out.println("5 - Remover Contato");
        System.out.println("0 - Sair");
        System.out.println("Digite a opção:");
    }
    
   
    
    
}
