package com.pedro.APIanime.Anime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeCadastroService {

    @Autowired
    private AnimeService animeService;

    public void cadastrarAnimes() {
        // Dados dos animes a serem cadastrados
        List<Anime> animesParaCadastrar = List.of(
                new Anime("Anime 1", "Ação"),
                new Anime("Anime 2", "Aventura"),
                new Anime("Anime 3", "Comédia")
        );

        // Salvar todos os animes no banco de dados
        animeService.saveAllAnimes(animesParaCadastrar);
    }
}
