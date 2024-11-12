package RecursionQuestions;

import java.util.ArrayList;
import java.util.List;

public class generateParentheses {
     public List<String> generateParenthesis(int n) {
        List<String>arraylist=new ArrayList<>();
        String ans="";
        generate(n,0,0,ans,arraylist);
        return arraylist;
        
    }
    public static void generate(int n,int open,int close,String ans,List<String>arraylist){
        if(open==n&&close==n){
            arraylist.add(ans);
            return;
        }
         if(open<n){
            generate(n,open+1,close,ans+"(",arraylist);
        }
         if(close<open){
        generate(n,open,close+1,ans+")",arraylist);
        }

    }
    
}
