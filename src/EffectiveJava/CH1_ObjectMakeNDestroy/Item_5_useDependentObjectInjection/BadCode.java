package EffectiveJava.CH1_ObjectMakeNDestroy.Item_5_useDependentObjectInjection;

import EffectiveJava.ExampleCode.CmmFileBean;

public class BadCode {

    private static final CmmFileBean cmmFileBean = new CmmFileBean("K");

    public CmmFileBean getCmmFileBean() {
        return cmmFileBean;
    }

}
