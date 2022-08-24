package EffectiveJava.CH4_ClassNInterface.Item_15_minimizeAuth;

import EffectiveJava.ExampleCode.FileBean;

public class A_ExampleCode {
    public static void main(String[] args) {

        //1. VO 혹은 Bean의 Validation Code 강제 가능
        FileBean fileBean = new FileBean(null);
        fileBean.getID_PREFIX(); // NPE를 방지하는 간단한 로직 삽입가능

        //2. Package 접근권한을 막아 의존성 체크를 쉽게 함
        // 그룹웨어 코드, fbxService의 moveFileBoxToSpace, private으로 쓰임새를 제한하여 오로지 한 모듈의 의존성만을 체크하고,
        // 코드의 의도를 명확히 한다.


        //3. 내부코드 수정이 자유로움
        // 그룹웨어 코드, cmmI18NService 의 selectExisti18n메서드 예시.
        // 몇몇 경우는 서비스를 거치지 않고 cmmI18NDao에서 selectExisti18n 메서드를 직접 가져가서 사용한다.
        // 서비스로직을 수정한다 해도 직접 Dao를 가져간 곳에는 반영되지 않아 일일히 수정해주어야 한다.

        //4. 전혀 다른 환경에 이식 가능
        // cmmI18NDao,


        //5. 문서화된 API를 덜 작성 가능하다..
        

    }
}
