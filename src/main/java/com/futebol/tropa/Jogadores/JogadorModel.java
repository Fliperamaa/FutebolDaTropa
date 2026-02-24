package com.futebol.tropa.Jogadores;

import com.futebol.tropa.Jogos.JogosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class JogadorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome", unique = true, nullable = false)
    private String nome;
    @Column(name = "pago")
    private boolean pago;

    // @ManyToOne Um jogador participa de um único jogo por vez.
    @ManyToOne
    @JoinColumn(name = "jogos_id") // Foreign Key / Chave Estrangeira
    private JogosModel jogos;
}
