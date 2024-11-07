package StringQuestions;

import java.util.HashMap;

public class validAnagram{
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));

        
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>smap=new HashMap<>();
        HashMap<Character,Integer>tmap=new HashMap<>();
       
        for (char element : s.toCharArray()) {
            smap.put(element, smap.getOrDefault(element, 0) + 1);
        }
         for (char element : t.toCharArray()) {
            tmap.put(element, tmap.getOrDefault(element, 0) + 1);
        }
        return smap.equals(tmap);
        
    }
}