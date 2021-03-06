package EffectiveJava.CH1_ObjectMakeNDestroy.Item_1_useStaticFactoryMethod.DictionaryServiceExample;

import java.util.SortedMap;
import java.util.TreeMap;
public class GeneralDictionaryExample implements DictionaryExample {

        private SortedMap<String, String> map;

        public GeneralDictionaryExample() {
            map = new TreeMap<String, String>();
            map.put(
                    "book",
                    "a set of written or printed pages, usually bound with " +
                            "a protective cover");
            map.put(
                    "editor",
                    "a person who edits");
        }

        @Override
        public String getDefinition(String word) {
            return map.get(word);
        }

}
