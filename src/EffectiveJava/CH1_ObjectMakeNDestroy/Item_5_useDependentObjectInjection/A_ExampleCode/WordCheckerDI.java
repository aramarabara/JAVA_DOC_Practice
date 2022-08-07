package EffectiveJava.CH1_ObjectMakeNDestroy.Item_5_useDependentObjectInjection.A_ExampleCode;

import EffectiveJava.ExampleCode.Dictionary;

public class WordCheckerDI {

    private final Dictionary dictionary;

    public WordCheckerDI(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String check() throws Exception {
        if (!this.dictionary.contains("bad")) {
            throw new Exception("단어를 찾을 수 없습니다.");
        }
        return "단어가 있습니다.";
    }

}
