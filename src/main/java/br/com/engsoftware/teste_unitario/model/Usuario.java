package br.com.engsoftware.teste_unitario.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Builder
public class Usuario {

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Integer id;
  private String nome;
  private String matricula;

  public Usuario() {}

  public Usuario(Integer id, String nome, String matricula) {
    this.nome = nome;
    this.matricula = matricula;
  }

  public Usuario(String nome){
    this.nome = nome;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
}
