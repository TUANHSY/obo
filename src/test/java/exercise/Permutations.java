package exercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author DX
 * @description 用来排列组合
 * @date: 2019/8/27 12:45
 */
public class Permutations {
    /**
     * 计算阶乘数，即n! = n * (n-1) * ... * 2 * 1
     * @param n
     * @return
     */
    private static long factorial(int n) {
        return (n > 1) ? n * factorial(n - 1) : 1;
    }

    /**
     * 计算排列数，即A(n, m) = n!/(n-m)!
     * @param n
     * @param m
     * @return
     */
    public static long arrangement(int n, int m) {
        return (n >= m) ? factorial(n) / factorial(n - m) : 0;
    }

    /**
     * 计算组合数，即C(n, m) = n!/((n-m)! * m!)
     * @param n
     * @param m
     * @return
     */
    public static long combination(int n, int m) {
        return (n >= m) ? factorial(n) / factorial(n - m) / factorial(m) : 0;
    }

    //打印文件
    public static void outputToFile(String[] strings){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("E:\\IdeaProjects\\learn\\obo\\src\\main\\resources\\outPut.txt",true);
            fileOutputStream.write((Arrays.asList(strings).toString()+""+System.getProperty("line.separator")).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 排列选择（从列表中选择n个排列）
     * @param dataList 待选列表
     * @param n 选择个数
     */
    public static void arrangementSelect(String[] dataList, int n) {

        arrangementSelect(dataList, new String[n], 0);

        System.out.println(String.format("A(%d, %d) = %d", dataList.length, n, arrangement(dataList.length, n)));

    }

    /**
     * 排列选择
     * @param dataList 待选列表
     * @param resultList 前面（resultIndex-1）个的排列结果
     * @param resultIndex 选择索引，从0开始
     */
    private static void arrangementSelect(String[] dataList, String[] resultList, int resultIndex) {
        int resultLen = resultList.length;

        // 全部选择完时，输出排列结果
        if (resultIndex >= resultLen) {
            System.out.println(Arrays.asList(resultList));
            outputToFile(resultList);

            return;
        }

        // 递归选择下一个
        for (String s : dataList) {
            // 判断待选项是否存在于排列结果中
            boolean exists = false;
            for (int j = 0; j < resultIndex; j++) {
                if (s.equals(resultList[j])) {
                    exists = true;
                    break;
                }
            }
            // 排列结果不存在该项，才可选择
            if (!exists) {
                resultList[resultIndex] = s;
                arrangementSelect(dataList, resultList, resultIndex + 1);
            }
        }
    }

    /**
     * 组合选择（从列表中选择n个组合）
     * @param dataList 待选列表
     * @param n 选择个数
     */
    public static void combinationSelect(String[] dataList, int n) {

        combinationSelect(dataList, 0, new String[n], 0);

        System.out.println(String.format("C(%d, %d) = %d", dataList.length, n, combination(dataList.length, n)));

    }

    /**
     * 组合选择
     * @param dataList 待选列表
     * @param dataIndex 待选开始索引
     * @param resultList 前面（resultIndex-1）个的组合结果
     * @param resultIndex 选择索引，从0开始
     */
    private static void combinationSelect(String[] dataList, int dataIndex, String[] resultList, int resultIndex) {
        int resultLen = resultList.length;
        int resultCount = resultIndex + 1;
        // 全部选择完时，输出组合结果
        if (resultCount > resultLen) {
            System.out.println(Arrays.asList(resultList));

            outputToFile(resultList);
            return;
        }

        // 递归选择下一个
        for (int i = dataIndex; i < dataList.length + resultCount - resultLen; i++) {
            resultList[resultIndex] = dataList[i];
            combinationSelect(dataList, i + 1, resultList, resultIndex + 1);
        }
    }

    public static void main(String[] args) {
        arrangementSelect(new String[] {
               "你", "妈妈", "知道", "我", "帮","她","做家务"
        }, 7);

//        combinationSelect(new String[] {
//                "你", "妈妈", "知道", "我", "帮","她","做家务"
//        }, 7);
    }
}
