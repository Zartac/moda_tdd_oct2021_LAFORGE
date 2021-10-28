package moda_tdd_oct2021_LAFORGE;

import java.util.HashMap;
import java.util.*;

public class Dictionary implements IDictionary {
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

    public List<String> getTranslation(String name){
        ArrayList<String> l = new ArrayList<>();
        for(int i=0;i<this.translations.get(name).size();i++){
            l.add(this.translations.get(name).get(i));
        }
        return l;
    }

    public String translationInverse(String name) {
        String rtr = "a retourner";
            for (Map.Entry<String, List<String>> map : this.translations.entrySet()) {
                if(map.getValue() != null && map.getValue().contains(name)) rtr = map.getKey();
        }
        return rtr;
    }
}
