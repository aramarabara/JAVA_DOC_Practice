package EffectiveJava.CH4_ClassNInterface.Item_15_minimizeAuth;

import EffectiveJava.ExampleCode.ExampleOnlyUse;

public class AccessModifier {

    public boolean publicAuth;
    private boolean privateAuth;
    protected boolean protectedAuth;
    boolean packagePrivateAuth;
    boolean packageAuth;

    public static void main(String[] args) {


        // PUBLIC : 모든 곳에서 접근 가능
        // 구현이 쉽고 편하나, 예상치 못한 쓰임이 있으며 공개 API의 경우 영구적으로 지원해야 한다.

        System.out.println("--PUBLIC--");
       /* {

            // 예상치 못한 쓰임, Spring MVC에서 다른 패키지의 DAO에 접근
            // 개발자는 로그인 체크를 진행한 후에 다국어를 조회하도록 구현하였다.
            System.out.println("--개발자가 예상한 쓰임--");
            CmmI18NService cmmI18NService = new CmmI18NService();
            cmmI18NService.loginCheck("admin");
            cmmI18NService.loginCheck("user");


            // 그러나, 코드가 복잡해지고 Hard Coding이 반복되면 DAO단에서 바로 값을 가져갈 가능성이 있다.
            // 개발자의 의도와는 달리 NPE, 혹은 권한문제 등 오류가 발생할 수 있는 코드가 된다.
            System.out.println("--개발자가 예상 못한 쓰임--");
            CmmI18NDao cmmI18NDao = new CmmI18NDao();
            //cmmI18NDao.accessDB("user");


            // 공개 API 문제, finalize()

            // finalize, java 9 Version에서 @Deprecated 처리된 Object CLass의 protected Method
            // 객체가 언제 닫힐지 확정할 수 없으며, 불완전한 객체가 생성되어 보안취약점 or 데이터 정합성의 문제 발생, 메모리 누수로 인한 OutOfMemoryError 발생 등
            // 왠만해서는 사용하지 않아야 하는 메서드이다.
            // 그러나, PUBLIC 메서드이기 때문에 이미 사용하는 하위버전을 지원하기 위해서 @Deprecated 외의 삭제 등은 불가능하다.
            try {
                FinalizeClass finalizeClass = new FinalizeClass();
                finalizeClass.finalize();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }*/


        // PRIVATE : 클래스 내부에서만 접근 가능
        // 엄격한 접근성 관리로 의존성을 낮출 수 있다.
        System.out.println("--PRIVATE--");
        /*{
            System.out.println("--개발자가 예상한 쓰임--");
            JavaBeanPattern javaBeanPattern = new JavaBeanPattern();
            javaBeanPattern.setVar1(null);
            javaBeanPattern.setVar2(null);
            javaBeanPattern.setVar3(null);

            System.out.println("--개발자가 예상 못한 쓰임--");
            javaBeanPattern.var1 = null;
            javaBeanPattern.var1.equals("isString"); //NPE 발생


        }*/

        // PROTECTED : 클래스 내부에서만 접근 가능, 상속 관계에서만 접근 가능
        System.out.println("--PROTECTED--");
        /*{
            // finalize, clone() 등은 상속관계에서만 접근가능하며, 보통 상속을 통해 Override한 메서드가 필요한 경우가 있다.
            Object object = new Object();

            // Calendar의 Complete Method, 다른 캘린더를 상속할 때 보통 사용, Gregorian / Japanese 등 일부 캘린더에서 사용
            Calendar calendar = Calendar.getInstance();
            // Customizing Calendar라 하더라도 Calendar를 상속받으면 이 Protected Method로 시간값을 완성 가능
            // ( 시/분/초 에서 분/초 가 빠졌을 경우 값을 넣어주는 메서드 )

        }*/

        // PACKAGE-PRIVATE (DEFAULT) : 패키지 내부에서만 접근 가능
        // 패키지 단위로 기능 분리가 가능하다 ( 모듈화의 기본 )
        {
            CH4OnlyUse ch4OnlyUse = new CH4OnlyUse();
            System.out.println(ch4OnlyUse.CH4OnlyUseString);
            ch4OnlyUse.DescribeChapter4();

            // 타 패키지의 코드를 가져올 수는 없다.
            ExampleOnlyUse exampleOnlyUse = new ExampleOnlyUse();
            //exampleOnlyUse.DescribeExampleOnly(); // 오류, Package-private은 사용할 수 없다.
            // 그룹웨어 코드, cmmI18NService 의 selectExisti18n메서드 예시.
            // 타 모듈이 적합한 데이터 체크를 하지 않고 메서드를 사용할 수 있다. ( DAO에서 직접사용 )
            // 타 모듈이 사용하고 있으므로, 메서드를 수정할 때 타 모듈에 미치는 영향을 고려해야 한다.
            // ** 만일 삭제하지 않고 내버려둔다면 중복코드가 발생하여 유지보수에 어려움이 생긴다.
        }

    }

}
