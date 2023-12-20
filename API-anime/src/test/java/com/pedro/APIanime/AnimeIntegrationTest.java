package com.pedro.APIanime;

import com.pedro.APIanime.Anime.Anime;
import com.pedro.APIanime.Anime.AnimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class AnimeIntegrationTest {

    @Autowired
    private AnimeService animeService;

    @Test
    public void testInsertAndDeleteAnime() {
        // Cria um Anime para inserir
        Anime anime = new Anime("Novo Anime", "Ação");

        // Insere o Anime no banco de dados
        animeService.saveAnime(anime);

        // Recupera a lista de animes
        List<Anime> animes = animeService.getAllAnimes();

        // Verifica se o Anime está na lista
        assertTrue(animes.contains(anime), "O Anime foi inserido corretamente.");

        // Exclui o Anime do banco de dados
        animeService.deleteAnime(anime.getId());

        // Recupera a lista de animes após a exclusão
        List<Anime> updatedAnimes = animeService.getAllAnimes();

        // Verifica se o Anime foi removido
        assertFalse(updatedAnimes.contains(anime), "O Anime foi removido corretamente.");
    }
}

