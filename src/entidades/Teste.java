package agenda;

import java.util.Scanner;
import entidades.*;
import excecoes.AgendaException;
/**
 *
 * @author Felipe
 */
public class Teste {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);
        PessoaFisica pf;
        PessoaJuridica pj;
        Pessoa p;
        boolean sair = true;
        
        while(sair){
            agenda.menu();
            int x = sc.nextInt();
            switch (x)
            {
                case 1:
                    System.out.println("Digite o nome:");
                    String nome = sc.next();
                    System.out.println("Digite o sobrenome:");
                    String sobrenome = sc.next();
                    System.out.println("Digite a idade:");
                    int idade = sc.nextInt();
                    System.out.println("Digite o CPF:");
                    int cpf = sc.nextInt();
                    pf = new PessoaFisica(cpf, nome, sobrenome, idade);
                    agenda.gravar(pf);
                    break;
                    
                case 2:
                    System.out.println("Digite o nome:");
                    nome = sc.next();
                    System.out.println("Digite o sobrenome:");
                    sobrenome = sc.next();
                    System.out.println("Digite a idade:");
                    idade = sc.nextInt();
                    System.out.println("Digite o CNPJ:");
                    int cnpj= sc.nextInt();
                    pj = new PessoaJuridica(cnpj, nome, sobrenome, idade);
                    agenda.gravar(pj);
                    break;
                    
                // Caso a lista esteja vazia (checado em listaTodos()), a Exceção é executada
                case 3:
                    try{
                        System.out.println("-----LISTA DE CONTATOS-----");                       
                        for(Pessoa aux : agenda.listaTodos()){
                            aux.print();
                            System.out.println("------------------------");
                        }                        
                    } catch (AgendaException a){
                        System.err.println(a.getMessage());
                    }
                    break;
                
                // Caso a busca não for efetiva (checado em getByNome()), a Exceção é executada    
                case 4:
                    try{
                        System.out.println("Digite o nome que queira buscar:111");
                        p = agenda.getByNome(sc.next());
                        System.out.println("----RESULTADO----");
                        p.print();                        
                    }catch (AgendaException a){
                        System.err.println(a.getMessage());
                    }
                    break;
                    
                // Caso a busca não for efetiva (checado em getByNome()), a Exceção é executada
                case 5:
                    try{
                        System.out.println("Digite o nome que queira buscar:222");
                        p = agenda.getByNome(sc.next());
                        agenda.remover(p);
                        System.out.println("----REMOVIDO----");
                        
                    }catch (AgendaException a){
                        System.err.println(a.getMessage());
                    }
                    break;
                    
                case 0:
                    sair = false;
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Digite um valor correto!");
                    break;
            }
        }
    }
}
