package com.atchat.restaurants.Tag;

public class TagNameComparator implements TagComparator {
    @Override
    public int compare(Tag o1, Tag o2) {
        return o1.getTag().compareTo(o2.getTag());
    }
}
