package com.atchat.restaurants.Store;

import com.atchat.restaurants.Tag.Tag;

import java.util.Collections;
import java.util.List;

public abstract class RestaurantFranchise implements Franchise {
    private String name;
    private List<Restaurant> restaurantList;
    private List<Tag> tagList;

    public RestaurantFranchise(String name){
        this.name = name;
    }

    @Override
    public List<Restaurant> getRestaurants() {
        return Collections.unmodifiableList(restaurantList);
    }

    @Override
    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurantList = restaurants;
    }

    @Override
    public boolean addRestaurant(Restaurant restaurant) {
        return restaurantList.add(restaurant);
    }

    @Override
    public boolean removeRestaurant(Restaurant restaurant) {
        return restaurantList.remove(restaurant);
    }

    @Override
    public List<Restaurant> sortByLocation() {
        return null;
    }

    @Override
    public List<Tag> getTagList() {
        return Collections.unmodifiableList(tagList);
    }

    @Override
    public void setTagList(List<Tag> tagList){
        this.tagList = tagList;
    }

    @Override
    public boolean addTag(Tag tag) {
        return tagList.add(tag);
    }

    @Override
    public boolean removeTag(Tag tag) {
        return tagList.remove(tag);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
