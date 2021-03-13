package de.dhbw.bds.RESTWebservice.repository;

import de.dhbw.bds.RESTWebservice.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantRepository extends MongoRepository<Restaurant, String> {

}
