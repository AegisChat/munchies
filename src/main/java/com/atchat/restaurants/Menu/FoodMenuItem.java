package com.atchat.restaurants.Menu;

import com.atchat.restaurants.Tag.Tag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class FoodMenuItem implements MenuItem{
    private final UUID uuid;
    private final String name;
    private final String awsS3BucketImageURL;
    private final String description;
    private final int likes;
    private final List<Tag> tagList;
    private final UUID restaurantUUID;

    private FoodMenuItem(FoodMenuItemBuilder foodMenuItemBuilder){
        this.uuid = foodMenuItemBuilder.uuid;
        this.name = foodMenuItemBuilder.name;
        this.awsS3BucketImageURL = foodMenuItemBuilder.awsS3BucketImageURL;
        this.description = foodMenuItemBuilder.description;
        this.likes = foodMenuItemBuilder.likes;
        this.tagList = foodMenuItemBuilder.tagList;
        this.restaurantUUID = foodMenuItemBuilder.restaurantUUID;
    }

    public static class FoodMenuItemBuilder{
        private UUID uuid;
        private String name;
        private String awsS3BucketImageURL;
        private String description;
        private int likes;
        private List<Tag> tagList;
        private UUID restaurantUUID;

        public FoodMenuItemBuilder generateUUID(){
            uuid = UUID.randomUUID();
            return this;
        }

        public FoodMenuItemBuilder name(String name){
            this.name = name;
            return this;
        }

        public FoodMenuItemBuilder awsS3BucketImageURL(String url){
            this.awsS3BucketImageURL = url;
            return this;
        }

        public FoodMenuItemBuilder description(String description){
            this.description = description;
            return this;
        }

        public FoodMenuItemBuilder likes(int likes){
            this.likes = likes;
            return this;
        }

        public FoodMenuItemBuilder restaurantUUID(UUID uuid){
            this.restaurantUUID = uuid;
            return this;
        }

        public FoodMenuItem build(){
            this.tagList = new ArrayList<>();
            return new FoodMenuItem(this);
        }
    }

    @Override
    public UUID getUUID() {
        return uuid;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAwsS3BucketImageURL() {
        return awsS3BucketImageURL;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getLikes() {
        return likes;
    }

    @Override
    public List<Tag> getTagList() {
        return Collections.unmodifiableList(tagList);
    }

    @Override
    public UUID getRestaurantUUID() {
        return restaurantUUID;
    }

    @Override
    public boolean addTag(Tag tag) {
        if(tag == null){
            throw new NullPointerException("Tag cannot be null");
        }

        if (tag.getTag().equals("")){
            throw new IllegalArgumentException("Tag cannot be empty");
        }


        return tagList.add(tag);
    }

    @Override
    public boolean removeTag(Tag tag) {
        if(tag == null){
            throw new NullPointerException("Tag cannot be null");
        }

        if (tag.getTag().equals("")){
            throw new IllegalArgumentException("Tag cannot be empty");
        }

        return tagList.remove(tag);
    }
}
