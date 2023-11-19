package com.templete.project;

import java.util.*;

public class AcmMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt(); // 读取测试用例数量
            int[] testCaseData = new int[t]; // 创建数组存储测试用例数据
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt(); // 读取一个测试用例的数据
                testCaseData[i] = n; // 将数据存入数组
            }
            // 处理测试用例数据
            for (int i = 0; i < t; i++) {
                System.out.println("Test Case " + (i + 1) + ": " + testCaseData[i]);
                // 在这里可以对 testCaseData[i] 进行处理
            }
        }
        sc.close();
    }
}
