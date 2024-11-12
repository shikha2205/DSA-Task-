package RecursionQuestions;

import java.util.ArrayList;
import java.util.List;

public class palindromePartitioning {
     public List<List<String>> partition(String s) {
         List<List<String>> ans=new ArrayList();
        List<String>ll=new ArrayList<>();
        part(s,ll,ans);
        return ans;
    }
    public static void part(String ques,List<String>ll,List<List<String>>ans){
        if(ques.length()==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=1;i<=ques.length();i++){
            String s=ques.substring(0,i);
            if(isPalindrome(s)){
            ll.add(s);
            part(ques.substring(i),ll,ans);
            ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
