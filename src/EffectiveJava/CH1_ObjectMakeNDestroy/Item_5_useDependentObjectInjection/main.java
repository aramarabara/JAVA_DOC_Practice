package EffectiveJava.CH1_ObjectMakeNDestroy.Item_5_useDependentObjectInjection;

import EffectiveJava.CH1_ObjectMakeNDestroy.Item_5_useDependentObjectInjection.A_ExampleCode.*;
import EffectiveJava.ExampleCode.CmmFileBean;
import EffectiveJava.ExampleCode.CmmFileBeanCustom;
import EffectiveJava.ExampleCode.Dictionary;
import EffectiveJava.ExampleCode.FileType;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) throws Exception {

        // 1. Static final 변수의 경우 변경이 불가능하며, 생성 당시에 값을 명시한 속성을 바꿀 수 없다.
        System.out.println("1. STATIC 변수로 객체를 구현한 결과 : ");
        System.out.println(WordChecker.check());

        // 2. singleTon 메서드의 경우에도 생성된 인스턴스가 단 하나이며 확장되기 어렵다.
        System.out.println("2. singleTon 패턴으로 객체를 구현한 결과 : ");
        System.out.println(WordCheckerSingleTon.getInstance().check("bad"));

        // 3. 의존 객체 주입 (DI, Dependent Injection)으로 확장성있는 클래스를 만들 수 있다.
        // 사용자에게 사전 객체를 받아 검증하면 되므로, 유연하다.
        System.out.println("3. DI로 객체를 구현한 결과 : ");
        WordCheckerDI wordCheckerDI = new WordCheckerDI(new Dictionary(List.of("bad", "good")));
        System.out.println(wordCheckerDI.check());

        // 4. DI(Dependent Injection)과 Factory Method를 합친 사용법, 다른 타입을 반환할 수도 있다.
        System.out.println("4. DI + Factory 패턴으로 객체를 구현한 결과 : ");
        WCFactory wCFactory = new WCFactory(new Dictionary(List.of("bad", "good")));
        WordCheckerDIFactory wordCheckerDIFactory = new WordCheckerDIFactory(wCFactory);
        System.out.println(wordCheckerDIFactory.createWordCheckerDI().check());

        // Bad Example, static final 혹은 singleTon을 통해서 확장성이 떨어지는 코드를 구현한다.
        System.out.println();
        System.out.println("**나쁜 예시, static final 혹은 singleTon을 남발한다.");
        CmmFileBean cmmFileBean = new CmmFileBean("k");
        System.out.println("각각의 상수를 하나씩 꺼내 쓸 수 있지만 String이라는 객체에 묶여 있어 확장성이 떨어진다.");
        System.out.println("전체 타입 목록 : " + cmmFileBean.getConstants());

        // Good Example, 객체를 주입받아 확장성을 고려한 코드를 구현한다.
        // 기존의 CmmFileBean과 달리 유저가 커스텀한 타입을 넣을 수 있다.
        System.out.println();
        System.out.println("**좋은 예시, 유저가 커스텀한 타입을 넣을 수 있다. 확장성이 있다.");
        List<String> UserCustomFileTypeList = List.of("U", "J", "P");
        FileType UserfileType = new FileType(UserCustomFileTypeList);
        CmmFileBeanCustom cmmFileBeanCustom = new CmmFileBeanCustom("k", UserfileType);
        System.out.println("기본 타입 목록 : " + cmmFileBeanCustom.getFileType().getConstants()
                + ", 사용자 커스텀 타입 : " + cmmFileBeanCustom.getFileType().getUserCustomFileType().toString());

        // 결론, 메모리를 위해 static final이나 singleTon을 아무 곳에나 붙이면 확장성이 떨어질 수 있으므로
        // 확장성과 메모리관리 두 측면을 고려해서 설계해야 한다.

    }

}
