package com.jogadoresRestApi.jogadores_api.controller;

import com.jogadoresRestApi.jogadores_api.model.Jogador;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/jogadores")
public class JogadorController {

    private List<Jogador> jogadores = new ArrayList<>();

    @GetMapping(produces = "application/json")
    public List<Jogador> listarJogadores() {
        return jogadores;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<Jogador> criarJogador(@RequestBody Jogador jogador) {
        jogadores.add(jogador);
        return ResponseEntity.status(HttpStatus.CREATED).body(jogador);
    }
}
