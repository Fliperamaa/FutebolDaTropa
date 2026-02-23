package com.futebol.tropa.Jogos;

import com.futebol.tropa.Jogadores.JogadorModel;
import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_jogos")
public class JogosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date data;
    private Time hora;
    private String time1;
    private String time2;

    // @OneToMany Um jogo tem vários jogadores participantes.
    @OneToMany(mappedBy = "jogos")
    private List<JogadorModel> jogadores;
}

