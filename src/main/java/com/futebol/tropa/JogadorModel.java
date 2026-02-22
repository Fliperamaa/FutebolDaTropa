package com.futebol.tropa;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class JogadorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    boolean pago;

    public JogadorModel(String nome, boolean pago) {
        this.nome = nome;
        this.pago = pago;
    }

    public JogadorModel() {

    }
}
