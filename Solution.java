import java.util.*;
public class Solution {
    public List<String> permutations(String input) {
      // Write your solution here
      List<String> res = new ArrayList<>();
      if(input.equals("")){
        res.add("");
        return res;
      }
      dfs(new StringBuilder(input),new StringBuilder(),res);
      return res;
    }
    private void dfs(StringBuilder input, StringBuilder curr,List<String> res){
        
      if(input.length()==0){
        res.add(curr.toString());
        return;
      }
      for(int i=0;i<input.length();i++){
        System.out.println(input);
         curr.append(input.charAt(i));
         input.deleteCharAt(i);
         dfs(input,curr,res);
         input.insert(i,curr.charAt(curr.length()-1));
         curr.deleteCharAt(curr.length()-1);
         System.out.println(input);
        //  System.out.println(curr);
      }
      System.out.println();
     
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.permutations("ab"));
    }
  }