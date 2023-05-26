package CompositePattern.Level2.Iterators;

import java.util.Iterator;

import CompositePattern.Level2.MenuComponent;

public class NullIterator implements Iterator<MenuComponent> {

    @Override
    public MenuComponent next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
