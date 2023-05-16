package FactoryPattern.Level1;

public class Pizza {
    String description = "A pizza";

    public void prepare() {
        System.out.println("Prepare" + description);
    }

    public void bake() {
        System.out.println("Bake" + description);
    }

    public void cut() {
        System.out.println("Cut" + description);
    }

    public void box() {
        System.out.println("Box" + description);
    }
}
