package EffectiveJava.CH1_ObjectMakeNDestroy.Item_1_useStaticFactoryMethod.DictionaryServiceExample;

public class DictionaryDemoExample {

    public class DictionaryDemo {
        public DictionaryDemo() {
        }

        public void main(String[] args) {
            DictionaryServiceExample dictionary = DictionaryServiceExample.getInstance();
            System.out.println(lookup(dictionary, "book"));
            System.out.println(lookup(dictionary, "editor"));
            System.out.println(lookup(dictionary, "xml"));
            System.out.println(lookup(dictionary, "REST"));
        }

        public String lookup(DictionaryServiceExample dictionary, String word) {
            String outputString = word + ": ";
            String definition = dictionary.getDefinition(word);
            return definition == null ? outputString + "Cannot find definition for this word." : outputString + definition;
        }
    }

}
