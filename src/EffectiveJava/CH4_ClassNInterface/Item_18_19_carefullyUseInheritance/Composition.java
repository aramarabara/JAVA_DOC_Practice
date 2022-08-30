package EffectiveJava.CH4_ClassNInterface.Item_18_19_carefullyUseInheritance;

import java.util.List;

public class Composition {

    public static void main(String[] args) {

        //1. 상속은 캡슐화(Encapuslation)를 깨뜨린다.

        // * 하위 클래스 확장성을 고려하지 않은 경우 지속적으로 변경이 발생한다.

        // * 문서화가 제대로 되어있지 않은 경우 변경에 어려움을 겪는다.

        // List.of
        // >> 정적 팩터리 메서드, 불변객체를 생성하며 이름을 붙일 수 있어 가독성이 좋고, static이므로 성능개선에 도움이 된다 (비싼 객체)
        List<?> listOf = List.of("1","2","3");
        System.out.println(listOf.toString());

    }
}
