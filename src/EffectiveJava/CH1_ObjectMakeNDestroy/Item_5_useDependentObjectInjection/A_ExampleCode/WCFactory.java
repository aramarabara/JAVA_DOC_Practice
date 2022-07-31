package EffectiveJava.CH1_ObjectMakeNDestroy.Item_5_useDependentObjectInjection.A_ExampleCode;

public class WCFactory<T> {

    private T dictionary;

    public WCFactory(T t, T dictionary) {
        this.dictionary = dictionary;
        switch (t.getClass().getSimpleName()) {
            case "Dictionary":
                this.dictionary = dictionary;
                break;
            case "EnglishDictionary":
                this.dictionary = dictionary;
                break;
            case "KoreanDictionary":
                this.dictionary = dictionary;
                break;
            default:
                throw new IllegalArgumentException("지원하지 않는 타입입니다.");
        }
    }

    public T createDictionary() {
        return this.dictionary;
    }
}
