package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.B_BusinessCode;

import EffectiveJava.ExampleCode.MockService;

import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BadCode {
    public static void main(String[] args) {


        Map<String, String> map = Map.of("trgtId", "YOOSONGLEE", "useYn", "Y", "authYn", "Y", "lwPrtYn", "N", "itemSe", "K", "folderId", "FLD1209410294");
        FbxAuthMappingVO authDetail = new FbxAuthMappingVO();
        MockService service = new MockService();

        // 현재 getFolderId 및 getTrgtId가 바뀌어 있으나, 개발과정에서는 눈치채기 힘들다.
        // 컴파일 오류가 나지 않기 때문에 잘못 세팅된 값이 물리적으로 먼 거리에서 오류를 발생시킨다.
        // 멀티쓰레드를 활용하는 환경이라면 값이 세팅되기 전에 객체를 사용할 수도 있다.
        authDetail.setTrgtId(map.get("folderId"));
        authDetail.setFoIderId(map.get("trgtId"));
        authDetail.setUseYn(map.get("useYn"));
        authDetail.setAuthYn(map.get("authYn"));
        authDetail.setLwPrtYn(map.get("lwPrtYn"));
        authDetail.setItemSe(map.get("itemSe"));

        // 메인 서비스 로직
        service.doBuisness(authDetail);

    }

}
