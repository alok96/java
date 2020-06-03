package com.zef;

public class InstanceFun {

    static void instanceM(){
        InstanceFun instanceFun = new InstanceFun();
        System.out.println(instanceFun instanceof InstanceFun);
    }
}
