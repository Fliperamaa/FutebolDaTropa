package com.futebol.tropa.Jogadores;

import com.futebol.tropa.Jogos.JogosModel;
import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class JogadorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private boolean pago;

    // @ManyToOne Um jogador participa de um único jogo por vez.
    @ManyToOne
    @JoinColumn(name = "jogos_id") // Foreign Key / Chave Estrangeira
    private JogosModel jogo;

    public JogadorModel(String nome, boolean pago) {
        this.nome = nome;
        this.pago = pago;
    }

    public JogadorModel() {

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isPago() {
        return pago;
    }
    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
