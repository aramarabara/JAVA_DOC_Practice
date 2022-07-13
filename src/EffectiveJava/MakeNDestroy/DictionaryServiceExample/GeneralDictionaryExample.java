package EffectiveJava.MakeNDestroy.DictionaryServiceExample;

import EffectiveJava.MakeNDestroy.DictionaryServiceDemo.DictionaryServiceProvider.src.dictionary.spi.Dictionary;

import java.util.SortedMap;
import java.util.TreeMap;
public class GeneralDictionaryExample implements Dictionary {

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
