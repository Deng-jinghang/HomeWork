package HomeWork01;

import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        System.out.print("输入-1结束，请输入年份:");
        Scanner scanner =new Scanner(System.in);
        int year = scanner.nextInt();
        while (year != -1){
            if ((year%4==0&&year%100!=0)||(year%400==0)){
                System.out.println(year+"是闰年");
            }else {
                System.out.println(year+"是平年");
            }
            System.out.print("输入-1结束，请输入年份:");
            year = scanner.nextInt();
        }
    }
}
