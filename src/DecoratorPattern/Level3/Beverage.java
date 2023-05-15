package DecoratorPattern.Level3;

public abstract class Beverage {
    String description = "Unknown Beverage";
    Boolean milk = false;
    Boolean mocha = false;

    public Boolean hasMilk() {
        return milk;
    }

    public void setMilk(Boolean milk) {
        this.milk = milk;
    }

    public Boolean hasMocha() {
        return mocha;
    }

    public void setMocha(Boolean mocha) {
        this.mocha = mocha;
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        if (mocha) return 0.5;
        else if (milk) return 1;
        else return 0;
    }
}
