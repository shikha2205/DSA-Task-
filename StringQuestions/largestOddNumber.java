package StringQuestions;

public class largestOddNumber {
    public static void main(String[] args) {
        String num1="35427";
        String num2="52";
        String num3="4206";
        System.out.println(largestOddNumber(num1));
        System.out.println(largestOddNumber(num2));
        System.out.println(largestOddNumber(num3));

    }
    public static String largestOddNumber(String num){
        for(int i=num.length()-1;i>=0;i--){
            char ch=num.charAt(i);
            if ((ch - '0') % 2 != 0) {
               
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
    
}
