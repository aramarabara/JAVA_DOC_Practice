package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.B_BusinessCode;

import EffectiveJava.ExampleCode.MockService;

import java.util.Map;

public class GoodCode {

    public static void main(String[] args) {


        Map<String, String> map = Map.of("trgtId", "YOOSONGLEE", "useYn", "Y", "authYn", "Y", "lwPrtYn", "N", "itemSe", "K", "folderId", "FLD1209410294");
        MockService service = new MockService();

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
