package EffectiveJava.MakeNDestroy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

public class NO_1_ExampleCode {

    public static void main(String[] args) {

        // 현재 FbxFolderFileInfoVO를 만들기 위해서는 반드시
        // 이러한 값들이 들어가야 한다.
        FolderInfoVO v = new FolderInfoVO();
        v.setFolderId("FLD_123456789");
        v.setCmpId("123456789");
        v.setEmpId("123456789");
        v.setFolderName("임시폴더");
        v.setParentFolderId("FLD_123456790");

        // 어떤 로직에서 값을 이렇게 잘못 넣었다고 해보자.
        // 그러면 부모폴더를 찾아야 하는데, 핵심이 되는 값이 없다.
        // 컴파일 오류도 나지 않으므로, 런타임 시 전혀 예상치 못한 곳에서 (EX, Mapper에서)
        // 오류가 발생하여 추적에 많은 시간이 소요된다.
        FolderInfoVO v1 = new FolderInfoVO();
        v1.setFolderId("FLD_123456789");
        v1.setCmpId("123456789");
        v1.setEmpId("123456789");
        v1.setFolderName("임시폴더");

        // constructor를 사용하면 필수값을 강제할 수 있다.
        // 그러나 v2가 대체 무슨 목적으로 사용되는지 알 수 없다.
        FolderInfoVO v2 =
                new FolderInfoVO("FLD_123456789", "123456789", "123456789",
                        "임시폴더", "임시폴더", "FLD_123456790");

        // 이제 이 VO가 부모폴더를 찾기 위하여 생성되었다는 것을 알 수 있다.
        // 또, Static 이므로 캐싱처리되어 빠른 속도를 자랑한다.
        // ( 비용이 크다면 static 고려 )
        FolderInfoVO v3 = FolderInfoVO.createVOFORSearchParentFolder("FLD_123456789", "123456789", "123456789",
                                                                "임시폴더", "임시폴더", "FLD_123456790");


        // 반환 타입의 하위 타입 객체를 자유롭게 선택할 수 있다.
        // Java의 Collection Framework가 예시

        // : 인터페이스에 사용할 수 잇는 여러가지 Util Class로, Collections에서 얻도록 함.
        Collections.addAll(null);
        Collections.asLifoQueue(null);

        // 이런 방식으로 45개의 Util을 사용할 수 있음.
        // 동반 클래스(Companion Class) 방식을 사용하여 인스턴스화 불가인 클래스에게 클래스를 만들어 호출함.

        // interface를 통해서 이 Util들을 공개하지 않고서도, 사용할 수 있다.
        Collection collection = new ArrayList<>();
        // 굳이 저 Util들의 기능을 이해할 필요 없이, CollectionFramework가 제공하는 ArrayList등의 구현체만을
        // 사용할 줄 알면 된다.

        // 입력 매개변수에 따라 각기 다른 클래스의 객체를 반환할 수 있다.
        // 예시, Enum, 원소가 64개 이상이면 JumboEnumSet 제공한다.
        // 즉 버전이 바뀐다 해도 EnumSet을 상속하는 객체를 던져주기만 하면 된다.
        // ( 어차피 EnumSet의 기능을 할 것이므로 )
        //EnumSet<int>.of(1,2,3)
    }

}
