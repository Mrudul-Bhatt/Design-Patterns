package AdapterPattern;

public class TurkeyAdapter implements IDuck {
    ITurkey turkey;

    public TurkeyAdapter(ITurkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        // Turkey's gobble is equivalent to Duck's quack
        turkey.gobble();
    }

    @Override
    public void fly() {
        // Turkey's fly is equivalent to Duck's fly
        for (int i = 0; i < 5; i++)
            turkey.fly();
    }
}
