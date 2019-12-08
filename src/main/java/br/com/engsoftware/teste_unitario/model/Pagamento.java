package br.com.engsoftware.teste_unitario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pagamento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    double valorPago;

    public Pagamento(){}

    public Pagamento (double valorPago){
        this.valorPago = valorPago;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
}
