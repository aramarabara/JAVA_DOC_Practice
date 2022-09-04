package EffectiveJava.CH4_ClassNInterface.Item_18_19_carefullyUseInheritance;

import java.util.Collection;
import java.util.Set;

public class NewInstrumentedHashSet extends ForwardingSet {

    private int addCount = 0;

    public NewInstrumentedHashSet(Set s) {
        super(s);
    }

    @Override
    public boolean add(Object o) {
        addCount++;
        return super.add(o);
    }

    @Override
    public boolean addAll(Collection c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
