package HomeWork01;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入数字判断星期，输入-1结束。");
        System.out.print("请输入数字：");
        int num = scanner.nextInt();
        while (num!=-1) {
            switch (num) {
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期二");
                    break;
                case 3:
                    System.out.println("星期三");
                    break;
                case 4:
                    System.out.println("星期四");
                    break;
                case 5:
                    System.out.println("星期五");
                    break;
                case 6:
                    System.out.println("星期六");
                    break;
                case 7:
                    System.out.println("星期天");
                    break;
                default:
                    System.out.println("输入错误，请重新输入或输入-1结束");
                    System.out.print("请输入数字：");
                    break;
            }
            System.out.print("请输入数字：");
            num = scanner.nextInt();
        }
    }
}
