package EffectiveJava.CH4_ClassNInterface.Item_15_minimizeAuth;

import java.util.List;

public class CH4OnlyUse {

    String CH4OnlyUseString;
    String DescInterface;
    String DescClass;
    List<Object> InterfaceExample;
    List<Object> ClassExample;

    void DescribeChapter4(){ // package-private인 Default 생략되어 있음
        System.out.println("Chapter 4 - Class and Interface");
        System.out.println("Item 15 - minimize Auth");
        System.out.println("접근 권한을 최소화하는 원칙을 적용한다.");
        System.out.println("CH4OnlyUseString : " + CH4OnlyUseString);
        System.out.println("DescInterface : " + DescInterface);
        System.out.println("DescClass : " + DescClass);
        System.out.println("InterfaceExample : " + InterfaceExample);
        System.out.println("ClassExample : " + ClassExample);
    }
}


