package StringQuestions;
public class removeParenthesis {
     public static  String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder(); 
        int openCount = 0;  

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (openCount > 0) {
                    result.append(c);
                }
                openCount++;  
            } 
            else {
                openCount--;  
                if (openCount > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();  
    }

    public static void main(String[] args) {
        
        System.out.println(removeOuterParentheses("(()())(())"));  
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));  
        System.out.println(removeOuterParentheses("()()")); 
    }
}
