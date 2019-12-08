package br.com.engsoftware.teste_unitario.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Emprestimo {
  private LocalDate dataEmprestimo;
  private LocalDate dataPrevista;
  private LocalDate dataDevolucao;

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Integer id;

  @ManyToOne (cascade = {CascadeType.MERGE, CascadeType.PERSIST})
  private Usuario usuario;

  @ManyToMany (cascade = CascadeType.ALL)
  private List<Livro> livros = new ArrayList<>();

  @ManyToOne (cascade = {CascadeType.MERGE, CascadeType.PERSIST})
  private Pagamento pagamento;

  private double valorPago;

  public static double valorPadraoEmprestimo = 5;
  public static int limitePorUsuario = 2;
  public static int diasDeEmprestimo = 7;

  public double getValorAPagar(){
    double valor = valorPadraoEmprestimo;
    if(dataDevolucao.isAfter(dataPrevista)){
      Period periodo  = Period.between(dataDevolucao, dataPrevista);
      int diasAtraso = periodo.getDays();
      if(diasAtraso * 0.4 > (valorPadraoEmprestimo * 0.6)){
        valor = valor + (valorPadraoEmprestimo * 0.6);
      }else if(diasAtraso > 0){
        valor = valor + (diasAtraso * 0.4);
      }
    }
    return valor;
  }

  public void setDataEmprestimo(LocalDate dataEmprestimo) {
    this.dataEmprestimo = dataEmprestimo;
  }

  public void setDataPrevista(LocalDate dataPrevista) {
    this.dataPrevista = dataPrevista;
  }

  public void setDataDevolucao(LocalDate dataDevolucao){
    this.dataDevolucao = dataDevolucao;
  }

  public void setLivroLocado(Livro livro) {
    this.livros.add(livro);
  }
}
