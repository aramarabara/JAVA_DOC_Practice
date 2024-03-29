package EffectiveJava.CH4_ClassNInterface.Item_15_minimizeAuth.MVC.VO;

import java.util.Objects;

public class JavaBeanPattern {

    public String var1;
    private String var2;
    private String var3;

    public String getVar1() {
        return Objects.requireNonNullElse(var1, "");
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return Objects.requireNonNullElse(var2, "");
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public String getVar3() {
        return Objects.requireNonNullElse(var3, "");
    }

    public void setVar3(String var3) {
        this.var3 = var3;
    }
}
