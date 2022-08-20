package EffectiveJava.CH4_ClassNInterface.Item_15_minimizeAuth;

import EffectiveJava.ExampleCode.FileBean;

public class A_ExampleCode {

    public static void main(String[] args) {

        //1. VO 혹은 Bean의 Validation Code 강제 가능
        FileBean fileBean = new FileBean(null);
        fileBean.getID_PREFIX(); // NPE를 방지하는 간단한 로직

        //2. Package 접근권한을 막아 의존성 체크를 쉽게 함
        // CmmService 쪽의 public method 들을 아무곳에서나 가져가서 사용하는 것 지적 필요

        //3. 내부코드 수정이 자유로움
        // Interface로 빼낸다면, 개별 메서드의 매개변수, return Type 자유롭게 조절 가능하고, 마지막 반환만 같게 해주면 된다.

        // 그런데, 만약 개별메서드를 public으로 죄다 가져가서 쓰면, 심각한 문제가 생긴다,, > 매개변수 하나 넣을때마다 외부의
        // 타 모듈도 바꿔주어야 하기 때문..
        // 그러면 그 모듈에서는 쓰지도 않는 변수를 단 하나의 어떤 기능을 위해서 억지로 넣어야 하고, 가독성은 최악이 된다..

        //4. 전혀 다른 환경에 이식 가능
        // 대표적으로 Library 그 자체 >> 어떤 프로젝트건 간에 몇가지 간단한 매개변수를 넘겨주기만 하면 가동이 가능하다..

        //5. 문서화된 API를 덜 작성 가능하다..
        

    }
}
