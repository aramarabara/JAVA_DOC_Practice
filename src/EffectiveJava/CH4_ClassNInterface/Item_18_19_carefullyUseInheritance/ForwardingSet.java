package EffectiveJava.CH4_ClassNInterface.Item_18_19_carefullyUseInheritance;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

//  Wrapper Class로 Decorator Pattern을 구현한다 \
// Guava 같은 라이브러리를 활용하자
public class ForwardingSet implements Set {

    private final Set s;

    public ForwardingSet(Set s) {
        this.s = s;
    }

    @Override
    public int size() {
        return s.size();
    }

    @Override
    public boolean isEmpty() {
        return s.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return s.contains(o);
    }

    @Override
    public Iterator iterator() {
        return s.iterator();
    }

    @Override
    public Object[] toArray() {
        return s.toArray();
    }

    @Override
    public boolean add(Object o) {
        return s.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return s.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        return s.addAll(c);
    }

    @Override
    public void clear() {
        s.clear();
    }

    @Override
    public boolean removeAll(Collection c) {
        return s.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        return s.retainAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return s.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return s.toArray(a);
    }


}
