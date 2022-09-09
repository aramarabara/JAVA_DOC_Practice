package EffectiveJava.CH4_ClassNInterface.Item_18_19_carefullyUseInheritance;

import java.util.AbstractList;
import java.util.List;
import java.util.TreeSet;

public class Composition {

    public static void main(String[] args) {

        //상속은 내부구현 여부를 잘 파악해야 한다.

        // 상위클래스의 메서드를 Override 시 전혀 다른 작동방식이 나타날 수 있다.
/*        System.out.println("상속 사용 시 : ");
        InstrumentedHashSet<String> instrumentedHashSet = new InstrumentedHashSet<String>();

        instrumentedHashSet.addAll(List.of("1", "2", "3"));
        System.out.println(instrumentedHashSet.getAddCount());*/

        //컴포지션은 내부구현 여부에 자유롭다
        // 실제 클래스가 아닌 Wrapper Class이기 때문에 상위클래스의 내부구현에 영향을 받지 않는다.
        System.out.println("Wrapper Class 사용 시(컴포지션) : ");
        NewInstrumentedHashSet newSet = new NewInstrumentedHashSet(new TreeSet());
        newSet.addAll(List.of("1", "2", "3"));
        System.out.println(newSet.getAddCount());

        // 만약 상속을 사용한다면,
        // 1. 내부클래스의 작동 여부를 철저하게 문서화해야 한다.
        // ** addAll 메서드가 add 메서드를 사용하는 경우 ( 문서에 see Also 로 설명되어 있음 )

        // 2. 상속용 Protected 메서드를 만들어야 한다.
        // java.util.AbstractList :: removeRange
        // 사용하지 않아도 기능에 문제는 없으나, 영향을 줄 수 있는 클래스들을 일부 공개할 수 있다

        // 3. 상속용 클래스의 생성자는 재정의 가능 메서드를 호출해서는 안된다 > 상위 클래스 생성자가 실행할 때 오버라이드한 메서드를 실행시킨다.
        // ** Clone(), readObject 역시 같은 문제점 가진다



    }
}
