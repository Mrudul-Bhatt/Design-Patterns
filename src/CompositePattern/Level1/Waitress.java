package CompositePattern.Level1;

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
}
