package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.B_BusinessCode;

import EffectiveJava.ExampleCode.MockService;

import java.util.Map;

public class GoodCode {

    public static void main(String[] args) {


        Map<String, String> map = Map.of("trgtId", "YOOSONGLEE", "useYn", "Y", "authYn", "Y", "lwPrtYn", "N", "itemSe", "K", "folderId", "FLD1209410294");
        MockService service = new MockService();
        // 현재 getFolderId 및 getTrgtId가 바뀌어 있으나, 개발과정에서는 눈치채기 힘들다.
        // 컴파일 오류가 나지 않기 때문에 잘못 세팅된 값이 물리적으로 먼 거리에서 오류를 발생시킨다.
        // 멀티쓰레드를 활용하는 환경이라면 값이 세팅되기 전에 객체를 사용할 수도 있다.

        FbxAuthMappingVOUseBuilder authDetail = new FbxAuthMappingVOUseBuilder
                .builder()
                .trgtId(map.get("trgtId"))
                .authYn(map.get("authYn"))
                .useYn(map.get("useYn"))
                .authYn(map.get("authYn"))
                .lwPrtYn(map.get("lwPrtYn"))
                .itemSe(map.get("itemSe"))
                .foIderId(map.get("folderId"))
                .build();

        // 메인 서비스 로직
        service.doBuisness(authDetail);

    }
}
