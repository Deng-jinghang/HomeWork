package HomeWork01;

import java.util.Scanner;

public class SumUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1.while结构\n" +
                "2.do-while结构\n" +
                "3.for结构\n" +
                "请输入您要采用哪一种结构计算Sun:");
        int x = scanner.nextInt();
        if (x>0&&x<4){
            System.out.print("请输入Num:");
            int num = scanner.nextInt();
            int sum = 0;
            int i = 0;
            switch (x){
                case 1:
                    while (i<=num){
                        sum=sum+i;
                        i++;
                    }
                    System.out.println("while累加结果为:"+sum);
                    break;

                case 2:
                    do {
                        sum=sum+i;
                        i++;
                    }while (i<=num);
                    System.out.println("do-while累加结果为:"+sum);
                    break;

                case 3:
                    for (i = 0;i<=num;i++){
                        sum=sum+i;
                    }
                    System.out.println("for累加结果为:"+sum);
                    break;
                default:
                    break;
            }
        }else {
            System.out.println("输入错误");
        }
    }
}
