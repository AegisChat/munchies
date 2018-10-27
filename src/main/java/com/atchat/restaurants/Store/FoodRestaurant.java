package com.atchat.restaurants.Store;

import com.atchat.restaurants.Tag.Tag;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class FoodRestaurant implements Restaurant {

    private List<Tag> tagList;
    private String name;
    private UUID id;

    public FoodRestaurant(){

    }

    public FoodRestaurant(String name){
        id = UUID.randomUUID();
        this.name = name;
    }

    @Override
    public List<Tag> getTagList() {
        return Collections.unmodifiableList(tagList);
    }

    @Override
    public void setTagList(List<Tag> tagList) {
        if(tagList == null){
            throw new NullPointerException("tagList must not be null");
        }
        this.tagList = tagList;
    }

    @Override
    public boolean addTag(Tag tag) {
        if(tag == null || tag.getTag().equals("") || tagList.contains(tag))
            return false;
        return tagList.add(tag);
    }

    @Override
    public boolean removeTag(Tag tag) {
        if(tag == null || tag.getTag().equals("") || !tagList.contains(tag))
            return false;
        return tagList.remove(tag);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if(name == null || name.equals("")){
            return;
        }
        this.name = name;
    }

    @Override
    public String getPostalCode() {
        return null;
    }

    @Override
    public void setPostalCode() {

    }
}
