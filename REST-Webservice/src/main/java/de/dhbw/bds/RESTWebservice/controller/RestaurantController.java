package de.dhbw.bds.RESTWebservice.controller;

import de.dhbw.bds.RESTWebservice.model.Restaurant;
import de.dhbw.bds.RESTWebservice.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Restaurant")
public class RestaurantController {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Restaurant add(@RequestBody Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }
}
