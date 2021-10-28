package moda_tdd_oct2021_LAFORGE;

import java.util.HashMap;
import java.util.*;

public class Dictionary {
    private Map<String, List<String>> translations;
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
        for(int i=0; i<translations.values().size();i++){
            if(translations.keySet().contains(name)) {
                return this.translations.get(name).get(i) ;
            }
        }
        return name;
    }

    public void addTranslation(String name, String translated) {
        if(this.translations.containsKey(name)){
            this.translations.get(name).add(translated);
        }
        else{
            ArrayList<String> l = new ArrayList<>();
            l.add(translated);
            this.translations.put(name, l);
        }
    }

    public List<String> getMultipleTranslation(){

    }
}
