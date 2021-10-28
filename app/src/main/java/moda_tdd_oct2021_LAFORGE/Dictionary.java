package moda_tdd_oct2021_LAFORGE;

public class Dictionary {
    private String name;
    public Dictionary(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    public boolean isEmpty(){
        if(this!=null) return false;
        return true;
    }
}
