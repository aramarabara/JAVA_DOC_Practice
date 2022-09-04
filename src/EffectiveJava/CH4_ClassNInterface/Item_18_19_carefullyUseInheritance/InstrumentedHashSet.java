package EffectiveJava.CH4_ClassNInterface.Item_18_19_carefullyUseInheritance;

import java.util.Collection;
import java.util.HashSet;

public class InstrumentedHashSet<E> extends HashSet<E> {

    private int addCount = 0;

    public InstrumentedHashSet() {
    }

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    // 각 원소를 순회할 때 상위클래스의 add를 호출하도록 수정
    // 1. 상위클래스의 로직을 완전히 파악해야 재구성 가능
    // 2. private 메서드 혹은 필드라면 하위에서 접근 자체가 불가능
    /*@Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        boolean modified = false;
        for (E e : c)
            // add 메서드를 내부에서 다시 호출한다
            if (super.add(e))
                modified = true;
        return modified;
    }*/



    public int getAddCount() {
        return addCount;
    }
}

