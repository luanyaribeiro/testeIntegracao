package br.com.engsoftware.teste_unitario.repository_interface;

import br.com.engsoftware.teste_unitario.model.Emprestimo;
import br.com.engsoftware.teste_unitario.model.Livro;

import java.util.List;

public interface EmprestimoRepositoryInterface {
    public Emprestimo salva();
    public List<Livro> getLivrosEmprestados();
    public List<Livro> getLivrosAtrasados();

}
