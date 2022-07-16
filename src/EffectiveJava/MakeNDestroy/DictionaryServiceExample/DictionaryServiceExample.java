package EffectiveJava.MakeNDestroy.DictionaryServiceExample;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

public class DictionaryServiceExample {

    // https://docs.oracle.com/javase/tutorial/ext/basics/spi.html#introduction

    // Service Provider에 대해 알아본다.

    // Service Provider (Java) 이란, 외부 파일 (Jar)을 자유롭게 삽입하여
    // 그걸 읽어내어 활용할 수 있는 패턴을 말한다.

    // 코드는 수정하지 않으면서, 새로운 기능을 추가하고자 할 때, 이 기능을 사용한다. (외부사용자가 추가)

    // DictionaryService class, 서비스 로직을 정의한다.
    private static DictionaryServiceExample example;
    private ServiceLoader<Dictionary> loader = ServiceLoader.load(Dictionary.class);

    private DictionaryServiceExample() {
    }

    // 싱글톤으로 만들어 캐싱처리한다.
    public static synchronized DictionaryServiceExample getInstance() {
        if (example == null) {
            example = new DictionaryServiceExample();
        }

        return example;
    }

    // 모든 사전을 경유하며 단어를 찾는 서비스를 가동시킨다.
    public String getDefinition(String word) {
        String definition = null;

        Dictionary d;
        try {
            for(Iterator<Dictionary> dictionaries = this.loader.iterator(); definition == null && dictionaries.hasNext(); definition = d.getDefinition(word)) {
                d = (Dictionary)dictionaries.next();
            }
        } catch (ServiceConfigurationError var5) {
            definition = null;
            var5.printStackTrace();
        }

        return definition;
    }


}
