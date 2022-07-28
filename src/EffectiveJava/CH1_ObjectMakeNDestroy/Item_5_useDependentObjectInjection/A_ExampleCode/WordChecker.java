package EffectiveJava.CH1_ObjectMakeNDestroy.Item_5_useDependentObjectInjection.A_ExampleCode;

import EffectiveJava.ExampleCode.Dictionary;

import java.util.List;

public class WordChecker {

    private static List<String> words = List.of("bad", "good");

    private static final Dictionary dictionary = new Dictionary(words);

    private WordChecker() {}

    public static String check() throws Exception {

        WordChecker wordChecker = new WordChecker();

        if (!dictionary.contains("bad")) {
            throw new Exception("단어를 찾을 수 없습니다.");
        }
        return "단어가 있습니다.";
    }
}
