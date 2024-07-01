package com.bd2024.repository;

import com.bd2024.model.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

//Extendemos de ReactiveMongoRepository para bd nosql(MONGODB)
//Acceso a datos
public interface PersonRepository extends ReactiveMongoRepository<Person, String> {

    Mono<Person> findByDni(String dni);

}
