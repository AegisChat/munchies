package com.atchat.restaurants.Menu;

import com.atchat.restaurants.Tag.Tag;

import java.util.List;
import java.util.UUID;

public interface MenuItem {
    public UUID getUUID();
    public String getName();
    public String getAwsS3BucketImageURL();
    public String getDescription();
    public int getLikes();
    public List<Tag> getTagList();
    public UUID getRestaurantUUID();
    public boolean addTag(Tag tag);
    public boolean removeTag(Tag tag);
}
