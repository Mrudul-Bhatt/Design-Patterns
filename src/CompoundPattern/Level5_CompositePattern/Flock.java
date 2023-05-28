package CompoundPattern.Level5_CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

import CompoundPattern.Level1_Strategy.IQuackable;

public class Flock implements IQuackable {
    ArrayList<IQuackable> quackers = new ArrayList<IQuackable>();

    public void add(IQuackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<IQuackable> iterator = quackers.iterator();

        while (iterator.hasNext()) {
            IQuackable quacker = iterator.next();
            quacker.quack();
        }

        // for (IQuackable quacker : quackers) {
        // quacker.quack();
        // }
    }
}
