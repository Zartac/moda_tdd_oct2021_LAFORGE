package moda_tdd_oct2021_LAFORGE;

import java.io.IOException;

public class DictionaryParser {
    public IDictionary loadTranslations(ILineReader reader) throws IOException {
        Dictionary dic = new Dictionary();
        String s = reader.readline();
        while(s !=null){
            String[] temp = s.split(" ");
            dic.addTranslation(temp[0], temp[1]);
            for(int i=1;i<temp.length;i++){
                dic.addTranslation(temp[0], temp[i]);
            }
        }
        return dic;
    }
}
