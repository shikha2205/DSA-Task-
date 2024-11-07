package StringQuestions;
public class reverseWord{
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(reverseWords(s));

        
    }
    public static String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
}