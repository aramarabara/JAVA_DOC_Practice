package EffectiveJava.ExampleCode;

import EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.B_BusinessCode.FbxAuthMappingVO;
import EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.B_BusinessCode.FbxAuthMappingVOUseBuilder;

public class MockService {
    public void doBuisness(FbxAuthMappingVO authDetail) {
        System.out.println("서비스 비즈니스 로직을 실행합니다.");
        System.out.println("안녕하세요, " + authDetail.getTrgtId() + "님");
        System.out.println(authDetail.getItemSe() + "아이템 정보를 확인하시겠습니까? : " + authDetail.getAuthYn());
        System.out.println("아이템 정보를 출력하시겠습니까? : " + authDetail.getLwPrtYn());
        System.out.println(authDetail.getFoIderId() + " 폴더의" + " 아이템 정보를 출력합니다.");
    }

    public void doBuisness(FbxAuthMappingVOUseBuilder authDetail) {
        System.out.println("서비스 비즈니스 로직을 실행합니다.");
        System.out.println("안녕하세요, " + authDetail.getTrgtId() + "님");
        System.out.println(authDetail.getItemSe() + "아이템 정보를 확인하시겠습니까? : " + authDetail.getAuthYn());
        System.out.println("아이템 정보를 출력하시겠습니까? : " + authDetail.getLwPrtYn());
        System.out.println(authDetail.getFoIderId() + " 폴더의" + " 아이템 정보를 출력합니다.");
    }
}
