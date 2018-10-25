package com.atchat.restaurants;

import java.util.List;

public interface Restaurant {
    public abstract List<Tag> getTagList();
    public abstract void setTagList(List<Tag> tagList);
    public abstract boolean addTag(Tag tag);
    public abstract boolean removeTag(Tag tag);
    public abstract String getName();
    public abstract void setName(String name);
    public abstract String getPostalCode();
    public abstract void setPostalCode();
}
