package com.pedro.APIanime.Anime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface animeRepository extends JpaRepository<Anime, Long> {

}
