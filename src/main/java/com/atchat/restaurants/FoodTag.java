package com.atchat.restaurants;

public final class FoodTag implements Tag, Comparable<Tag> {

    private String tag;

    public FoodTag(String tag){
        this.tag = tag;
    }

    @Override
    public int compareTo(Tag o) {
        return 0;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
