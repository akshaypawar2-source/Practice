package Strings;

import java.util.HashMap;
import java.util.Map;

public class WordsCounts {
    public static void main(String[] args) {
        String s = "I am an !# automation Engineer";

        String [] words = s.split("[^A-Za-z0-9]");
        Map<String, Integer> map = new HashMap<>();

        for(String word : words){

            if (!word.isEmpty()){
                map.put(word,map.getOrDefault(word,0)+1);
            }

        }
        System.out.println(map);

    }




}

