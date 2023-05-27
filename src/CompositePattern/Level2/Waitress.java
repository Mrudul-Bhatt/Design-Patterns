package CompositePattern.Level2;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    // The constructor takes the top-level menu component (the one that represents
    // all menus) as an argument.

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    // The printMenu method calls the print method on the top-level menu component,
    // which in turn calls the print method on each item in the composite.
    // The composite then calls the print method on each of its children, and so on,
    // until the whole menu is printed.

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
            }
        }
    }
}
