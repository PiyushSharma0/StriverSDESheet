import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int n) {
      List<List<Integer>> lst= new ArrayList<>();
      for(int i=1;i<=n;i++)
      {
        int ans =1;
        List<Integer> lsti= new ArrayList<>();
        lsti.add(1);
        for(int j=1;j<i;j++)
        {
            ans= ans*(i-j)/j;
            lsti.add(ans);
        }
        lst.add(lsti);
      } 
      return lst; 
    }
}