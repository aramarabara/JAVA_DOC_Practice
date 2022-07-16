package EffectiveJava.MakeNDestroy.DictionaryServiceExample;

import EffectiveJava.MakeNDestroy.DictionaryServiceDemo.DictionaryServiceProvider.src.dictionary.DictionaryService;

public class DictionaryDemoExample {

    public class DictionaryDemo {
        public DictionaryDemo() {
        }

        public void main(String[] args) {
            DictionaryService dictionary = DictionaryService.getInstance();
            System.out.println(lookup(dictionary, "book"));
            System.out.println(lookup(dictionary, "editor"));
            System.out.println(lookup(dictionary, "xml"));
            System.out.println(lookup(dictionary, "REST"));
        }

        public String lookup(DictionaryService dictionary, String word) {
            String outputString = word + ": ";
            String definition = dictionary.getDefinition(word);
            return definition == null ? outputString + "Cannot find definition for this word." : outputString + definition;
        }
    }

}
