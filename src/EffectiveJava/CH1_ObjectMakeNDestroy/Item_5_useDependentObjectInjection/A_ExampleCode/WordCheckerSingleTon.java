package EffectiveJava.CH1_ObjectMakeNDestroy.Item_5_useDependentObjectInjection.A_ExampleCode;

public class WordCheckerSingleTon {

    private static WordCheckerSingleTon instance = new WordCheckerSingleTon();

    private WordCheckerSingleTon() {
    }

    public static WordCheckerSingleTon getInstance() {
        return instance;
    }

    public boolean check(String word) {
        return true;
    }


}
