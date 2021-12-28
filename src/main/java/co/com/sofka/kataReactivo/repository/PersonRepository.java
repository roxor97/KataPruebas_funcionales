package co.com.sofka.kataReactivo.repository;

import co.com.sofka.kataReactivo.model.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveMongoRepository<Person, String> {
    Mono<Person> findByName(String name);
}
