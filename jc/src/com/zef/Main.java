package com.zef;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        StackFun stackFun = new StackFun();
        InstanceFun instanceFun = new InstanceFun();
        DataTypes datatypes = new DataTypes();

        stackFun.stackPushPop();
        System.out.println("..................................................................");

        instanceFun.instanceM();
        System.out.println("..................................................................");

        datatypes.studentsInfo();
        System.out.println("..................................................................");
        try {
            return;
        } catch (Exception e) {

        } finally {
            System.out.println("Finally");
        }
    }
}
