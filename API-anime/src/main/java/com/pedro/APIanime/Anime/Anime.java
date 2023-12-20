package com.pedro.APIanime.Anime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 255, message = "O nome do anime não pode exceder 255 caracteres.")
    @NotBlank(message = "O nome do anime é obrigatório.")
    private String nome;
    @NotBlank(message = "O gênero do anime é obrigatório.")
    @Size(max = 255, message = "O gênero do anime não pode exceder 255 caracteres.")
    private String genero;
    // Adicione outros campos conforme necessário

    // Construtores, getters e setters

    // Exemplo de construtor vazio e getters/setters
    public Anime() {
    }

    public Anime(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return Objects.equals(id, anime.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}

