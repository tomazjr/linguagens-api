package br.com.alura.linguagens.api;

import org.springframework.data.mongodb.repository.MongoRepository;

// MongoRepository do tipo Linguagem e o tipo do id é String
public interface LinguagemRepository extends MongoRepository<Linguagem, String> {
    
}
