package com.qa.SamplePrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {
    //Hey Java is Java best Language is Java
    //Java 3
    //is 2

    public static void findDuplicateWords(String str){
        String words[]=str.split(" ");
        Map<String,Integer> wordCount=new HashMap<String, Integer>();
        for(String word:words){
            if(wordCount.containsKey(word)) {
                wordCount.put(word.toLowerCase(), wordCount.get(word) + 1);
            }
                else{
                wordCount.put(word,1);
            }
            }

        Set<String> wordsInString=wordCount.keySet();
        for(String word:wordsInString){
            if(wordCount.get(word)>1)
                System.out.println(word+":"+wordCount.get(word));
        }

    }


    public static void main(String args[])
    {
        findDuplicateWords("Hey java is java best Language is Hey java");
    }
}
