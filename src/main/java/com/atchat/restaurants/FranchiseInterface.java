package com.atchat.restaurants;

import java.util.List;

public interface FranchiseInterface extends RestaurantInterface {
    public abstract List<RestaurantInterface> getRestaurants();
    public abstract void setRestaurants(List<RestaurantInterface> restaurants);
    public abstract boolean addRestaurant(RestaurantInterface restaurant);
    public abstract boolean removeRestaurant(RestaurantInterface restaurantInterface);
    public abstract List<RestaurantInterface> sortByLocation();
}
