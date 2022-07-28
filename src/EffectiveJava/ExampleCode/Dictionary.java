package EffectiveJava.ExampleCode;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    List<String> words = new ArrayList<String>();

    public Dictionary(List<String> words) {
        this.words = words;
    }

    public boolean contains(String bad) {
        if(words.contains(bad)) {
            return true;
        }
        return false;
    }
}
