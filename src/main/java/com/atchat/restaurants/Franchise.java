package com.atchat.restaurants;

import java.util.Collections;
import java.util.List;

public abstract class Franchise implements FranchiseInterface {
    private String name;
    private List<RestaurantInterface> restaurantList;
    private List<Tag> tagList;

    public Franchise(String name){
        this.name = name;
    }

    @Override
    public List<RestaurantInterface> getRestaurants() {
        return Collections.unmodifiableList(restaurantList);
    }

    @Override
    public void setRestaurants(List<RestaurantInterface> restaurants) {
        this.restaurantList = restaurants;
    }

    @Override
    public boolean addRestaurant(RestaurantInterface restaurant) {
        return restaurantList.add(restaurant);
    }

    @Override
    public boolean removeRestaurant(RestaurantInterface restaurantInterface) {
        return restaurantList.remove(restaurantInterface);
    }

    @Override
    public List<RestaurantInterface> sortByLocation() {
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
