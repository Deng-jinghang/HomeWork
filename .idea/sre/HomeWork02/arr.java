package HomeWork02;

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入二维数组的行数和列数
        System.out.print("请输入二维数组的行数：");
        int rows = scanner.nextInt();
        System.out.print("请输入二维数组的列数：");
        int cols = scanner.nextInt();

        int arr[][] = new int[rows][cols];

        // 输入二维数组的元素
        System.out.println("请输入二维数组的元素：");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // 输出整个二维数组
        System.out.println("二维数组的内容：");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // 换行
        }

        // 计算每行元素的平均值并打印结果
        System.out.println("每行元素的平均值：");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            double average = (double) sum / cols;
            System.out.printf("第 %d 行的平均值为 %.2f%n", i + 1, average);
        }
    }


}
