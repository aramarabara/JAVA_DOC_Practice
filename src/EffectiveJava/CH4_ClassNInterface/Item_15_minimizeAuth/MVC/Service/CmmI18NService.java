package EffectiveJava.CH4_ClassNInterface.Item_15_minimizeAuth.MVC.Service;

import EffectiveJava.CH4_ClassNInterface.Item_15_minimizeAuth.MVC.Dao.CmmI18NDao;

import java.util.Objects;

public class CmmI18NService {

    public CmmI18NDao cmmI18NDao = new CmmI18NDao();

    public void loginCheck(String loginId) {

        // 1. NullCheck 및 빈 값 체크
        if(Objects.requireNonNullElse(loginId, "").isEmpty()) {
            System.out.println("로그인 객체가 Null, 혹은 빈 값입니다");
        } else {
            System.out.println("로그인 객체가 정상적인 String 값입니다.");
        }

        // 관리자 권한에 대한 처리
        if(loginId.equals("admin")) {
            System.out.println("관리자님 반갑습니다.");
            //** 관리자 일 경우 DB 접근
            String result = cmmI18NDao.accessDB(loginId);
            System.out.println("조회 결과는 : " + result);
        } else {
            System.out.println("조회할 수 있는 권한이 없습니다");
        }

    }

}
