package com.zef;


//class Hi extends Thread{
//    public void run(){
//        for(int i=1;i<=5;i++){
//            System.out.println("Hi");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//class Hello extends Thread{
//    public void run(){
//        for(int i=1;i<=5;i++){
//            System.out.println("Hello");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//public class MultiThreading {
//    public static void main(String args[]) {
//        Hi hi = new Hi();
//        Hello hello = new Hello();
//        hi.start();
//        try{Thread.sleep(10);}catch (Exception e){}
//        hello.start();
////        hi.show();
////        hello.show();
//    }
//}
//
//class Hi implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Hi");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class Hello implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//public class MultiThreading {
//    public static void main(String args[]) {
//        Runnable hi = new Hi();
//        Runnable hello = new Hello();
//
//        Thread T1 = new Thread(hi);
//        Thread T2 = new Thread(hello);
//
//        T1.start();
//        try {
//            Thread.sleep(10);
//        } catch (Exception e) {
//        }
//        T2.start();
//      /*  hi.run();
//        try {
//            Thread.sleep(10);
//        } catch (Exception e) {
//        }
//        hello.run();*/
//    }
//}

public class MultiThreading {
    public static void main(String args[]) throws Exception{
        Runnable hi = () ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable hello = () ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread T1 = new Thread(hi);
        Thread T2 = new Thread(hello);

        T1.start();
        try {
            Thread.sleep(10);
        } catch (
                Exception e) {
        }
        T2.start();

        T1.setPriority(1);
        T2.setPriority(10);

//        System.out.println(T1.getPriority());
//        System.out.println(T2.getPriority());


//        System.out.println(T1.isAlive());
        T1.join();
        T2.join();
//        System.out.println(T1.isAlive());
        System.out.println("Bye");
      /*  hi.run();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        hello.run();*/
    }
}