package com.pedro.APIanime.Anime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimeService {

    @Autowired
    private animeRepository animeRepository;

    public Anime saveAnime(Anime anime) {
        return animeRepository.save(anime);
    }

    public List<Anime> getAllAnimes() {
        return animeRepository.findAll();
    }

    public Optional<Anime> getAnimeById(Long id) {
        return animeRepository.findById(id);
    }

    public void saveAllAnimes(List<Anime> animes) {
        animeRepository.saveAll(animes);
    }

    public void deleteAnime(Long id) {
        animeRepository.deleteById(id);
    }
}
