package EffectiveJava.ExampleCode;

import java.util.List;

public class ExampleOnlyUse {

    String ExampleOnlyUseString;
    String ExampleInterface;
    String ExampleClass;
    List<Object> ExampleOnlyList;
    List<Object> ExampleOnlyList2;

    void DescribeExampleOnly(){ // package-private인 Default 생략되어 있음
        System.out.println("Example - Class and Interface");
        System.out.println("Item 15 - minimize Auth");
        System.out.println("접근 권한을 최소화하는 원칙을 적용한다.");
        System.out.println("CH4OnlyUseString : " + ExampleOnlyUseString);
        System.out.println("DescInterface : " + ExampleInterface);
        System.out.println("DescClass : " + ExampleClass);
        System.out.println("InterfaceExample : " + ExampleOnlyList);
        System.out.println("ClassExample : " + ExampleOnlyList2);
    }

}
