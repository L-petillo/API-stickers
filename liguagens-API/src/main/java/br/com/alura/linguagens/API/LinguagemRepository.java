package br.com.alura.linguagens.API;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem, String>{
    
}
