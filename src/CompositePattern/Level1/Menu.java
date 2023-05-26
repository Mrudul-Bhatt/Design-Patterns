package CompositePattern.Level1;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // The add, remove, and getChild methods are all implemented here in the Menu
    // class.
    // The add method takes a MenuComponent as an argument and adds it to the
    // ArrayList.
    // The remove method also takes a MenuComponent as an argument and removes it
    // from the ArrayList.
    // The getChild method takes an index and uses it to retrieve an item from the
    // ArrayList.
    // The MenuComponent class also implements these methods, but it throws an
    // UnsupportedOperationException.
    // The Menu class overrides these methods and implements them to work with the
    // ArrayList.
    // The Menu class is a composite, so it needs to implement these methods.
    // The MenuItem class is a leaf, so it doesn't need to implement these methods.
    // The MenuComponent class implements these methods so that the leaf classes
    // don't have to.
    // The MenuComponent class is a composite, so it needs to implement these
    // methods.
    // The MenuItem class is a leaf, so it doesn't need to implement these methods.
    // The Menu class is a composite, so it needs to implement these methods.

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int index) {
        return menuComponents.get(index);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        // The print method iterates through all the items in the ArrayList and prints
        // each one.
        Iterator<MenuComponent> iterator = menuComponents.iterator();

        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }

        // for (MenuComponent menuComponent : menuComponents) {
        // menuComponent.print();
        // }
    }

}
