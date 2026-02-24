package com.futebol.tropa.Jogos;

import com.futebol.tropa.Jogadores.JogadorModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_jogos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class JogosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "data")
    private Date data;
    @Column(name = "hora")
    private Time hora;
    @Column(name = "time_1")
    private String time1;
    @Column(name = "time_2")
    private String time2;

    // @OneToMany Um jogo tem vários jogadores participantes.
    @OneToMany(mappedBy = "jogos")
    private List<JogadorModel> jogadores;
}

