package EffectiveJava.CH1_ObjectMakeNDestroy.Item_5_useDependentObjectInjection.A_ExampleCode;

public class WCFactory<T> {

    private T dictionary;

    public WCFactory(T t) {
        this.dictionary = dictionary;
        switch (t.getClass().getSimpleName()) {
            case "Dictionary":
                this.dictionary = t;
                break;
            case "EnglishDictionary":
                this.dictionary = t;
                break;
            case "KoreanDictionary":
                this.dictionary = t;
                break;
            default:
                throw new IllegalArgumentException("지원하지 않는 타입입니다.");
        }
    }

    public T createDictionary() {
        return this.dictionary;
    }
}
