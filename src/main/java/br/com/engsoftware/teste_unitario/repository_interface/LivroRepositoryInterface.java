package br.com.engsoftware.teste_unitario.repository_interface;

import br.com.engsoftware.teste_unitario.model.Livro;

public interface LivroRepositoryInterface {

    public Livro salva(Livro livro);
    public Livro atualiza(Livro livro);
}
