package CompoundPattern.Level1_Strategy;

public class DuckCall implements IQuackable {

    @Override
    public void quack() {
        System.out.println("Kwak");
    }

}
