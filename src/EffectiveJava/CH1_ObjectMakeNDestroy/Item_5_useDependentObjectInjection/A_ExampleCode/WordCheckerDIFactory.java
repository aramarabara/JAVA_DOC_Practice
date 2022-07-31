package EffectiveJava.CH1_ObjectMakeNDestroy.Item_5_useDependentObjectInjection.A_ExampleCode;

import EffectiveJava.ExampleCode.Dictionary;

public class WordCheckerDIFactory {

    private final WCFactory<? extends Dictionary> factory;

    public WordCheckerDIFactory(WCFactory<? extends Dictionary> factory) {
        this.factory = factory;
    }

    public WordCheckerDI createWordCheckerDI() {
        return new WordCheckerDI(factory.createDictionary());
    }


}
