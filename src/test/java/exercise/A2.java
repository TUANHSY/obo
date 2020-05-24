package exercise;

import java.util.HashMap;
import java.util.Scanner;

import static sun.swing.MenuItemLayoutHelper.max;

/**
 * @author: DuanXu
 * @date: 2019/9/9 17:42
 */
public class A2 {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            HashMap<Integer, Integer> map= new HashMap<>();
            System.out.println(coinDivision(n,map));
        }
    }

    /**
     * 递归计算 耗时太久
     * @param n,map
     * @return
     */

    private static int coinDivision(int n,HashMap<Integer, Integer> map) {
        if (n==0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (n==2){
            return 2;
        }

        if (n>=3&&n<=9){
            return n-1;
        }
        if (n==10){
            return 11;
        }
        if (map.containsKey(n)){
            return map.get(n);
        }else {
            int result= max(coinDivision(n-1,map)+1,coinDivision(n-2,map)+2,coinDivision(n-5,map)+4,coinDivision(n-10,map)+11);
           map.put(n,result);
            return result;
        }
    }




}
