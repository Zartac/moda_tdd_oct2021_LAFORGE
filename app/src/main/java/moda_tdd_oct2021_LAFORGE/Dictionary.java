package moda_tdd_oct2021_LAFORGE;

import java.util.HashMap;
import java.util.*;

public class Dictionary {
    private Map<String, String> translations;
    private  String name;
    public Dictionary(String name){
        this.name=name;
        translations = new HashMap<>();
        translations.put(name, null);
    }
    public Dictionary(){
        translations = new HashMap<>();
    }
    public String getName(){
        return this.name;
    }
    public boolean isEmpty(){
        return this.name.isEmpty();
    }

    public String getTranslation(String name) {
        for(String s : translations.keySet()) if(s.equals(name)) return this.translations.get(s) ;
        return name;
    }

    public void addTranslation(String name, String translated) {
        this.translations.put(name, translated);
    }
}
