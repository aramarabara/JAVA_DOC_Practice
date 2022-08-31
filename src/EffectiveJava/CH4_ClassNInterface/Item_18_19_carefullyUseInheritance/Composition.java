package EffectiveJava.CH4_ClassNInterface.Item_18_19_carefullyUseInheritance;

import java.util.List;

public class Composition {

    public static void main(String[] args) {

        //1. 상속은 내부구현 여부를 잘 파악해야 한다.

        // 상위클래스의 메서드를 Override 시 전혀 다른 작동방식이 나타날 수 있다.
        InstrumentedHashSet<String> instrumentedHashSet = new InstrumentedHashSet<String>();

        instrumentedHashSet.addAll(List.of("1", "2", "3"));
        System.out.println(instrumentedHashSet.getAddCount());




    }
}
