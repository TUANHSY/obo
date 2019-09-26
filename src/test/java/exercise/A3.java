package exercise;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            int n = sc.nextInt();
            int coin[] = { 1,2, 5, 10 };

            // dp[i][j]表示用前i种硬币凑成j元的组合数
            long[][] dp = new long[5][n + 1];

            for (int i = 1; i <= n; i++) {
                dp[0][i] = 0; // 用0种硬币凑成i元的组合数为0
            }

            for (int i = 0; i <= 4; i++) {
                dp[i][0] = 1; // 用i种硬币凑成0元的组合数为1,所有硬币均为0个即可
            }

            for (int i = 1; i <= 4; i++) {

                for (int j = 1; j <= n; j++) {

                    dp[i][j] = 0;
                    for (int k = 0; k <= j / coin[i - 1]; k++) {

                        dp[i][j] += dp[i - 1][j - k * coin[i - 1]];
                    }
                }
            }

            System.out.println(dp[4][n]);
        }
        sc.close();
    }

}