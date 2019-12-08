package br.com.engsoftware.teste_unitario.repository;

import br.com.engsoftware.teste_unitario.model.Emprestimo;
import br.com.engsoftware.teste_unitario.model.Livro;
import br.com.engsoftware.teste_unitario.repository_interface.EmprestimoRepositoryInterface;

import java.util.List;

public class EmprestimoRepository implements EmprestimoRepositoryInterface {

    @Override
    public Emprestimo salva() {
        return null;
    }

    @Override
    public List<Livro> getLivrosEmprestados() {
        return null;
    }

    @Override
    public List<Livro> getLivrosAtrasados() {
        return null;
    }
}
