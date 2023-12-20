package com.pedro.APIanime.controller;
import com.pedro.APIanime.Anime.Anime;
import com.pedro.APIanime.Anime.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/animes")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @PostMapping
    public ResponseEntity<Anime> createAnime(@RequestBody Anime anime) {
        Anime savedAnime = animeService.saveAnime(anime);
        return new ResponseEntity<>(savedAnime, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Anime>> getAllAnimes() {
        List<Anime> animes = animeService.getAllAnimes();
        return new ResponseEntity<>(animes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anime> getAnimeById(@PathVariable Long id) {
        Optional<Anime> anime = animeService.getAnimeById(id);
        return anime.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Adicione outros métodos conforme necessário, como para atualizar e excluir animes
}

