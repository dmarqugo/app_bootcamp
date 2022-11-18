package com.nttdata.ministerio_educacao.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    private Long nif;
    private String nome;
    private Integer idade;
    private Integer escolaridade;

    public Aluno(Long nif, String nome, Integer idade, Integer escolaridade) {
        this.nif = nif;
        this.nome = nome;
        this.idade = idade;
        this.escolaridade = escolaridade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nif=" + nif +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", escolaridade=" + escolaridade +
                '}';
    }
}
