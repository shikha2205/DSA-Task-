package StringQuestions;
import java.util.HashMap;
public class isomorphicString {
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        System.out.println(isomorphic(s,t));

    }
    public static boolean isomorphic(String s,String t){
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<n1;i++){
            char schar=s.charAt(i);
            char tchar=s.charAt(i);
            if(map.containsKey(schar)){
                if(map.get(schar)!=tchar){
                    return false;
                }

            }
            else{
                if(map.containsValue(tchar)){
                    return false;
                }
            }
            map.put(schar,tchar);
           

        }
        return true;

    }
    
}
