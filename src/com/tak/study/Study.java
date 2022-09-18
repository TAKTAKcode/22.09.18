package com.tak.study;

import java.util.Scanner;

public class Study {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("1부터 num까지의 합을 구합니다.");

        int num;

        do {
            System.out.print("num의 값 : ");
            num = sc.nextInt();
        } while (num <= 0);

        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum += i;           //sum에 i를 더한다.
        }
        System.out.print("1부터 " + num + "까지의 합은 [" + sum + "] 입니다.");
    }
}
