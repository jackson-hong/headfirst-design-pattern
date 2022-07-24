package com.jackson.headfirst.iterator;

import java.util.List;

public class PancakeMenuIterator implements Iterator{

    List<MenuItem> items;
    int position = 0;

    public PancakeMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.size() || items.get(position) == null) return true;
        return false;
    }

    @Override
    public MenuItem next() {
        MenuItem nextItem = items.get(position);
        position += 1;
        return nextItem;
    }
}
