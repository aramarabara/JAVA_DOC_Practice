package EffectiveJava.CH1_ObjectMakeNDestroy.Item_5_useDependentObjectInjection.A_ExampleCode;

public class WCFactory<T> {

    private final T dictionary;

    public WCFactory(T t) {
        switch (t.getClass().getSimpleName()) {
            case "Dictionary":
                break;
            case "EnglishDictionary":

                break;
            case "KoreanDictionary":
                break;
            default:
                throw new IllegalArgumentException("지원하지 않는 타입입니다.");
        }
    }

}
