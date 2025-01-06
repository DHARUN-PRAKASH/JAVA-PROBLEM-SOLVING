import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OptimalSeatInEfficiency {
        public static int findOptimalInefficiency(int[] salaries, int tableCost) { 
            int n = salaries.length; 
            int[] dp = new int[n + 1]; 
            Arrays.fill(dp, Integer.MAX_VALUE); 
            dp[0] = 0; 
            for (int i = 1; i <= n; i++) { 
                Map<Integer, Integer> salaryCount = new HashMap<>(); 
                int arguments = 0; 
                for (int j = i; j >= 1; j--) { 
                    int salary = salaries[j - 1]; 
                    salaryCount.put(salary, salaryCount.getOrDefault(salary, 0) + 1); 
                    if (salaryCount.get(salary) > 1) { 
                        arguments += salaryCount.get(salary) - 1; 
                    } 
                    dp[i] = Math.min(dp[i], dp[j - 1] + tableCost + arguments); 
                } 
            } 
            return dp[n];
        }
        // // DP array to store the minimum inefficiency for the first `i` employees
        // int[] dp = new int[N + 1];
        // Arrays.fill(dp, Integer.MAX_VALUE); // Initialize DP array with maximum value
        // dp[0] = 0; // No inefficiency when there are no employees

        // for (int i = 1; i <= N; i++) {
        //     Map<Integer, Integer> frequency = new HashMap<>();
        //     int arguments = 0;

        //     // Iterate backward to calculate the cost of the current table
        //     for (int j = i; j >= 1; j--) {
        //         int salary = salaries[j - 1];
        //         frequency.put(salary, frequency.getOrDefault(salary, 0) + 1);

        //         // Update arguments due to duplicate salaries
        //         if (frequency.get(salary) > 1) {
        //             arguments++;
        //         }

        //         // Update DP[i] considering the current group (from j to i)
        //         dp[i] = Math.min(dp[i], dp[j - 1] + K + arguments);
        //     }
        // }

        // return dp[N];

    public static void main(String[] args) {
        // // Sample Test Cases
        int[] salaries1 = {5, 4, 3, 2, 1};
        System.out.println(findOptimalInefficiency(salaries1, 2)); 

        int[] salaries2 = {3, 3, 3, 3, 3};
        System.out.println(findOptimalInefficiency(salaries2, 3)); 

        int[] salaries3 = {1, 2, 2, 3, 4};
        System.out.println(findOptimalInefficiency(salaries3, 5)); 

        // int[] salaries4 = {1};
        // System.out.println(findOptimalInefficiency(salaries4.length, 10, salaries4)); // Expected: 10

        // int[] salaries5 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        // System.out.println(findOptimalInefficiency(salaries5.length, 10, salaries5)); // Expected: 100
    }

}