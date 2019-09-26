package exercise;

import java.util.Scanner;

/**
 * @author: DuanXu
 * @date: 2019/9/9 10:43
 */
public class A1 {




//
//import java.util.Scanner;
//    public class Main {
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            while (in.hasNextInt()) {//注意while处理多个case              int a = in.nextInt();
//                int b = in.nextInt();
//                System.out.println(a + b);
//            }
//        }
//    }

    private static void invertFrontAndRear(String str) {
       String[] strings = str.split(" ");

       for(int i=0;i<(strings.length)/2;i++){
               String temp = strings[i];
               strings[i]=strings[strings.length-i-1];
               strings[strings.length-i-1]=temp;
       }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str=in.nextLine();
        }

        System.out.println("输入字符串 str.");
        String str = "你 们 好 再 见!";
        invertFrontAndRear(str);
    }
}
