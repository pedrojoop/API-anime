package com.pedro.APIanime;

import com.pedro.APIanime.Anime.Anime;
import com.pedro.APIanime.Anime.AnimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class DatabaseConnectionTest {
    @Autowired
    private AnimeService animeService;

    @Test
    public void testDatabaseConnection() {
        List<Anime> animes = animeService.getAllAnimes();
        assertFalse(animes.isEmpty(), "A conexão com o banco de dados foi estabelecida e há animes na lista.");
    }
}

