package com.zef;

import java.util.Scanner;
import java.util.Stack;

public class StackFun {
    public static int a, b;

    static void stackPushPop() {
        System.out.println("enter value for a and b");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        int s[] = new int[0];
        Stack stack = new Stack();

        for (int i = 0; i <= 9; i++) {
            stack.push(a + b);
            a = a + 1;
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println("Stack pop = " + stack.pop());
        }
    }
}
