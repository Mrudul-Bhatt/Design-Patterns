package IteratorAndCompositePattern.Level2;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeMenu() {
        menuItems = new ArrayList<>();
        addItem("KB Pancake", "Pancake with scrambled eggs and toast", true, 2.99);
        addItem("Regular Pancake", "Pancakes with fried eggs & sausage", false, 2.99);
        addItem("BlueBerry Pancake", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    // Getters
    // public ArrayList<MenuItem> getMenuItems() {
    // return menuItems;
    // }

    @Override
    public Iterator createIterator() {
        return new PancakeMenuIterator(menuItems);
    }
}
