# API Anime

Bem-vindo ao projeto API Anime! Este é um projeto open-source que fornece uma API para gerenciar informações sobre animes.

## Objetivos

O objetivo principal deste projeto é oferecer uma solução fácil de usar para a gestão de animes, permitindo operações como inserção, recuperação, atualização e exclusão de registros de animes.

## Funcionalidades Principais

- Inserção de novos animes
- Recuperação da lista de todos os animes
- Recuperação de informações detalhadas de um anime específico

## Configuração e Execução

Para configurar e executar este projeto, siga estas instruções:

1. **Pré-requisitos:**
   - Certifique-se de ter o Java e o PostgreSQL instalados em sua máquina.

2. **Configuração do Banco de Dados:**
   - Crie um banco de dados PostgreSQL chamado `anime_db`.
   - Atualize as configurações de conexão com o banco de dados no arquivo `application.properties`.

3. **Execução do Projeto:**
   - Execute o projeto utilizando o comando `./mvnw spring-boot:run` (ou `mvnw.cmd` no Windows).
   - Acesse a API em [http://localhost:8080/api/animes](http://localhost:8080/api/animes).

## Dependências

- Spring Boot 2.5.4
- PostgreSQL Driver 42.2.24
- Spring Data JPA
- PostgreSQL
- Hibernate

## Exemplos de Uso

### Inserir um Novo Anime

```bash
curl -X POST -H "Content-Type: application/json" -d '{"nome": "Naruto", "genero": "Ação"}' http://localhost:8080/api/animes
