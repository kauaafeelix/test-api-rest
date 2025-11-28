package com.jogadores.jogadores_api.controller;

import com.jogadoresRestApi.jogadores_api.model.Jogador;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/jogadores")
public class JogadorController {

    private List<Jogador> jogadores = new ArrayList<>();

    @GetMapping
    public List<Jogador> listar() {
        return jogadores;
    }

    @PostMapping
    public Jogador criar(@RequestBody Jogador jogador) {
        jogadores.add(jogador);
        return jogador;
    }
}
