package StringQuestions;
import java.util.*;
public class sortCharacters {
    public static void main(String[] args) {
        String s = "tree";
        String s1 = "cccaaa";
        System.out.println(frequencySort(s));
        System.out.println(frequencySort(s1));
        
    }
    public static String frequencySort(String s) {
        int[] freq = new int[128];
          for (char ch : s.toCharArray()) {
              freq[ch]++;
          }
          List<Character> chars = new ArrayList<>();
          for (int i = 0; i < 128; i++) {
              if (freq[i] > 0) {
                  chars.add((char) i);
              }
          }
          Collections.sort(chars, (a, b) -> freq[b] - freq[a]);
          StringBuilder res = new StringBuilder();
          for (char ch : chars) {
              for (int i = 0; i < freq[ch]; i++) {
                  res.append(ch);
              }
          }
  
          return res.toString();
      }
}
