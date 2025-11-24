package com.jogadoresRestApi.jogadores_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data              // Gera getters, setters, toString, equals e hashCode
@NoArgsConstructor  // Construtor vazio
@AllArgsConstructor // Construtor com todos os atributos
public class Jogador {
    private String nome;
    private int idade;
    private String posicao;
    private int numero;
}


