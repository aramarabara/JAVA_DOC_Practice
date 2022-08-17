package EffectiveJava.ExampleCode;

import EffectiveJava.CH4_ClassNInterface.Item_15_minimizeAuth.AccessModifier;
import EffectiveJava.CH4_ClassNInterface.Item_15_minimizeAuth.CH4OnlyUse;

public class OutPackageClass {

    public static void main(String[] args) {

        // 패키지 안쪽에서는 Defualt 접근제한자로 접근 가능하다.
        AccessModifier accessModifier = new AccessModifier();
        //accessModifier.packageAuth = true; // package-private, 접근 불가능하다.
        //accessModifier.privateAuth = true; private은 접근 불가능하다.
        accessModifier.publicAuth = true; // public은 접근 가능하다.

        // 의존성 체크의 범위가 모든 패키지 대상으로 넓어지며, API일 경우에는 공개된다.
        // 만일 open-API 등으로 지원하고 있다면 상위 버전으로 올라간다 하더라도 함부로 public 필드 및 함수를 교체할 수 없다. 
        // *지속적으로 지원해야 한다

        // package-private인 CH4OnlyUse 접근불가, 컴파일 에러 발생한다.
        /* CH4OnlyUse ch4OnlyUse = new CH4OnlyUse();
        ch4OnlyUse.CH4OnlyUseString = "CH4OnlyUseString";
        ch4OnlyUse.DescClass = "DescClass";
        ch4OnlyUse.DescInterface = "DescInterface";
        ch4OnlyUse.ClassExample = null;
        ch4OnlyUse.InterfaceExample = null;
        ch4OnlyUse.DescribeChapter4();*/

    }
}
