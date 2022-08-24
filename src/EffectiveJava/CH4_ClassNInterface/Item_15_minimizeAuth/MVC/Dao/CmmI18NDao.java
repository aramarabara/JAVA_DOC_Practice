package EffectiveJava.CH4_ClassNInterface.Item_15_minimizeAuth.MVC.Dao;

public class CmmI18NDao {

    public String accessDB(String loginId) {

        if(loginId.isEmpty() || !loginId.equals("admin")) {
            throw new IllegalArgumentException();
        }

        return "HI, I am DB RESULT WITH I18N";
    }
}
