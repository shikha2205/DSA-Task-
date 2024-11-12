package RecursionQuestions;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       ArrayList<Integer> li=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        coinchange(candidates,target,0,li,0,ans);
        return ans;
    }
    public static void coinchange(int candidates[],int target,int sum,ArrayList<Integer>li,int idx,List<List<Integer>> ans){
        if(sum==target){
            ans.add(new ArrayList<>(li));
           
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            li.add(candidates[i]);
            coinchange(candidates,target,sum+candidates[i],li,i,ans);
            li.remove(li.size()-1);//backtracking
        }
    }
}
