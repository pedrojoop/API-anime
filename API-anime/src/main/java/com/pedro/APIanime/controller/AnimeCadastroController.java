package com.pedro.APIanime.controller;

import com.pedro.APIanime.Anime.AnimeCadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cadastro-animes")
public class AnimeCadastroController {

    @Autowired
    private AnimeCadastroService animeCadastroService;

    @PostMapping("/em-lote")
    public void cadastrarAnimesEmLote() {
        animeCadastroService.cadastrarAnimes();
    }
}