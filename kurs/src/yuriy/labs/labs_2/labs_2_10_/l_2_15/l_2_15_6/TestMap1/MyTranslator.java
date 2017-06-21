package yuriy.labs.labs_2.labs_2_10_.l_2_15.l_2_15_6.TestMap1;

import java.util.HashMap;

/**
 * Created by Ruble on 20.06.2017.
 */
public class MyTranslator
{
    private HashMap<String,String> dictionary = new HashMap<String, String>();

    void  addNewWord(String en, String ru)
    {
        dictionary.put(en,ru);
    }

    String translate(String en)
    {
        String ruDictionary = dictionary.get(en);
        return ruDictionary;
    }
}
