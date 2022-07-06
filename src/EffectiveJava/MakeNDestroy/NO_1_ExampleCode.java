package EffectiveJava.MakeNDestroy;

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

    }

}
