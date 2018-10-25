package com.atchat.munchies.RestControllers;

import com.atchat.restaurants.Restaurant;
import org.springframework.web.bind.annotation.*;

//TODO: Figure out how to use AWS DynamoDB

@RestController("/api/restaurant")
public class RestaurantRestController {
    @PutMapping("/{restaurantName}")
    public void addRestaurant(@PathVariable String restaurantName, @RequestBody Restaurant restaurant){
        //TODO: See if we already have a restaurant with that name: if not add it to the database
    }

    @GetMapping("/getTags/{restaurantId}")
    public String getRestaurantTags(@PathVariable String restaurantId){
        //TODO: Search for restaurant with the same id and return the restaurants tags
        //TODO: If no id found return empty error object
        return null;
    }

    @GetMapping("/getLocation/{restaurantId}")
    public String getRestaurantLocation(@PathVariable String restaurantId){
        //TODO: Search for restaurant with the same id and return the restaurant's location
        //TODO: Check if Id is for restaurant AND NOT FOR RestaurantFranchise
        //TODO: If no id found return empty error object
        return null;
    }

    //TODO: See how to designate certain permissions to users with Spring

    @PostMapping("/addRestaurantToFranchise")
    public boolean addRestaurantToFranchise(@RequestBody Restaurant restaurant){
        //TODO: See if a restaurant at the specified location exists, if yes disregard the comment return false| if no
        //TODO: Find franchise and add restaurant to the list, return true
        return false;
    }

//    @PostMapping("/addFranchise")




}
