package pra.learn.microservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import pra.learn.microservice.entity.Country;

public interface CountryRepo extends MongoRepository<Country, String> {
    Country getByCountryName(String nname);
}
