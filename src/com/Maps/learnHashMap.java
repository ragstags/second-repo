package com.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by nadimchouglay on 25/04/2018.
 */
public class learnHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,String> dictionary = new LinkedHashMap<>();
        // extends map interface
        dictionary.put("hello","greeting in english");
        dictionary.put("brave","be ready to face danger");
        dictionary.put("joy","happy");
        dictionary.put("confidence","being confident");
//        for (String word: dictionary.keySet()){
//            System.out.println(dictionary.get(word));
//        }
        for (Map.Entry<String,String > entry :dictionary.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
