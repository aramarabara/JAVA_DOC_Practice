package EffectiveJava.CH4_ClassNInterface.Item_15_minimizeAuth;

public class InPackageClass {

    public static void main(String[] args) {

        // 패키지 안쪽에서는 Defualt 접근제한자로 접근 가능하다.
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.packageAuth = true; // package-private, 패키지 안에서는 접근 가능하다.
        //accessModifier.privateAuth = true; private은 접근 불가능하다.

        // 의존성 체크의 범위가 public의 전체 패키지에서 package-private의 해당 패키지로 줄어든다.
        // * 유지보수 용이
        // * 쓰레드 관리 용이 (패키지만 신경쓰면 된다.)
        // * 호환성 높음, 독자적으로 구성된 패키지일수록 다른 환경에 더 적은 비용으로 빠르게 적용할 수 있다.
        CH4OnlyUse ch4OnlyUse = new CH4OnlyUse();
        ch4OnlyUse.CH4OnlyUseString = "CH4OnlyUseString";
        ch4OnlyUse.DescClass = "DescClass";
        ch4OnlyUse.DescInterface = "DescInterface";
        ch4OnlyUse.ClassExample = null;
        ch4OnlyUse.InterfaceExample = null;
        ch4OnlyUse.DescribeChapter4();

    }


}
