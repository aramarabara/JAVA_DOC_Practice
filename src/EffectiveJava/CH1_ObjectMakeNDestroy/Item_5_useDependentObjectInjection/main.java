package EffectiveJava.CH1_ObjectMakeNDestroy.Item_5_useDependentObjectInjection;

import EffectiveJava.CH1_ObjectMakeNDestroy.Item_5_useDependentObjectInjection.A_ExampleCode.*;
import EffectiveJava.ExampleCode.CmmFileBean;
import EffectiveJava.ExampleCode.Dictionary;

import java.util.List;

public class main {

    public static void main(String[] args) throws Exception {

        // 1. Static final 변수의 경우 변경이 불가능하며, 생성 당시에 값을 명시한 속성을 바꿀 수 없다.
        System.out.println(WordChecker.check());

        // 2. singleTon 메서드의 경우에도 생성된 인스턴스가 단 하나이며 확장되기 어렵다.
        System.out.println(WordCheckerSingleTon.getInstance().check("bad"));

        // 3. 의존 객체 주입 (DI, Dependent Injection)으로 확장성있는 클래스를 만들 수 있다.
        // 사용자에게 사전 객체를 받아 검증하면 되므로, 유연하다.
        WordCheckerDI wordCheckerDI = new WordCheckerDI(new Dictionary(List.of("bad", "good")));
        wordCheckerDI.check();

        // 4. DI(Dependent Injection)과 Factory Method를 합친 사용법, 다른 타입을 반환할 수도 있다.
        WCFactory wCFactory = new WCFactory(new Dictionary(List.of("bad", "good")), new Dictionary(List.of("bad", "good")));
        WordCheckerDIFactory wordCheckerDIFactory = new WordCheckerDIFactory(wCFactory);
        wordCheckerDIFactory.createWordCheckerDI().check();

        // Bad Example, static final 혹은 singleTon을 통해서 확장성이 떨어지는 코드를 구현한다.
        CmmFileBean cmmFileBean = new CmmFileBean("K");

        // Good Example, 객체를 주입받아 확장성을 고려한 코드를 구현한다.

    }

}
