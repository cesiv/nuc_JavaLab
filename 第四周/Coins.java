import java.util.*;
 
public class Coins {
    public int countWays(int n) {
        // write code here
        /**/
          int[] coin = new int[]{1,5,10,25}; 
            int[] dp = new int[n+1]; 
            dp[0]=1; 
            for (int i = 0; i < coin.length; i++) { 
                for (int j = coin[i]; j <= n; j++) { 
                    dp[j] =(dp[j]+dp[j-coin[i]])%1000000007; 
                } 
            } 
            return dp[n];
         
    }
}