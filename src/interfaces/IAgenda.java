package interfaces;

import java.util.List;
import excecoes.AgendaException;
import entidades.Pessoa;

/**
 *
 * @author Felipe
 */
public interface IAgenda {
   
    public void gravar(Pessoa p);
    public void remover (Pessoa p);
    public Pessoa getByNome(String nome) throws AgendaException;
    public List<Pessoa> listaTodos()throws AgendaException;
}
