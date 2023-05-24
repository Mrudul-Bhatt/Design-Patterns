package IteratorAndCompositePattern.Level2;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public Object next() {
        return menuItems.get(position++);
    }

    @Override
    public void remove() {
        menuItems.remove(position);
    }

}
