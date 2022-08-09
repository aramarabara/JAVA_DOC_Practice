package JAVA_ORIGIN.Functional;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionalProgramming {

    public static void main(String[] args) {
        // Stream을 사용하기 위한 Functional Programming 학습

        // 1. Java에서 functional Programming이란 java.util.function 패키지의 클래스들을 활용하는 것을 의미한다.

        // 1) functional method라는 인터페이스를 구현한다.

        Predicate<String> isStringEmpty = String::isEmpty;
        isStringEmpty.test(""); // true
        Predicate<String> isStringBlank = String::isBlank;
        isStringBlank.test("blank"); // false

        isStringEmpty.and(isStringBlank).test(""); // true

        isStringEmpty.negate().test(""); // false

        isStringEmpty.or(isStringBlank).test(""); // true



        Map<String, List<String>> map = Map.of( "a", List.of("1", "2"), "b", List.of("3", "4") );

        Stream<String> stream = map.keySet().stream();
        stream.filter(s -> s.length() > 0).forEach(System.out::println);

    }
}
