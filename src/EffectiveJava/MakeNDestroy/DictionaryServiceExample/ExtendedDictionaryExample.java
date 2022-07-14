package EffectiveJava.MakeNDestroy.DictionaryServiceExample;

import EffectiveJava.MakeNDestroy.DictionaryServiceDemo.DictionaryServiceProvider.src.dictionary.spi.Dictionary;

import java.util.SortedMap;
import java.util.TreeMap;

public class ExtendedDictionaryExample implements Dictionary {

        private SortedMap<String, String> map;

    // 사용자가 만드는 확장 Dictionary를 생성한다. ( 전혀 다른 클래스이지만 interface로 Dictionary Type을 공유 )
    // ServiceProvider를 만들기 전에 필요한 과정
    public ExtendedDictionaryExample() {
        map = new TreeMap<String, String>();
        map.put(
            "xml",
            "a document standard often used in web services, among other " +
                "things");
        map.put(
            "REST",
            "an architecture style for creating, reading, updating, " +
                "and deleting data that attempts to use the common " +
                "vocabulary of the HTTP protocol; Representational State " +
                "Transfer");
    }

    @Override
    public String getDefinition(String word) {
        return map.get(word);
    }

}
