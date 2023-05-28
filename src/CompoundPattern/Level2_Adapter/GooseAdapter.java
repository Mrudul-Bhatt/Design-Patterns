package CompoundPattern.Level2_Adapter;

import CompoundPattern.Level1_Strategy.IQuackable;

public class GooseAdapter implements IQuackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

}
