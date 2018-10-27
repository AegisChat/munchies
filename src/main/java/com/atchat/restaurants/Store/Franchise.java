package com.atchat.restaurants.Store;

import java.util.List;

public interface Franchise extends Restaurant {
    public abstract List<Restaurant> getRestaurants();
    public abstract void setRestaurants(List<Restaurant> restaurants);
    public abstract boolean addRestaurant(Restaurant restaurant);
    public abstract boolean removeRestaurant(Restaurant restaurant);
    public abstract List<Restaurant> sortByLocation();
}


