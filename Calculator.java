-//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class MyOwnProject {
    public MyOwnProject() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------calculator----------------------");

        for(int i = 0; i <= 5; ++i) {
            System.out.println(" ");
            System.out.println("चुनें कि आप कौन सी विधि चुन सकते हैं \n+ , - , * , / \n");
            String myName = sc.next();
            System.out.print("पहला नंबर दर्ज करें a=");
            double a = sc.nextDouble();
            System.out.print("दूसरा नंबर दर्ज करें b=");
            double b = sc.nextDouble();
            byte var11 = -1;
            switch(myName.hashCode()) {
            case 42:
                if (myName.equals("*")) {
                    var11 = 2;
                }
                break;
            case 43:
                if (myName.equals("+")) {
                    var11 = 0;
                }
            case 44:
            case 46:
            default:
                break;
            case 45:
                if (myName.equals("-")) {
                    var11 = 1;
                }
                break;
            case 47:
                if (myName.equals("/")) {
                    var11 = 3;
                }
            }

            double ans;
            switch(var11) {
            case 0:
                ans = a + b;
                System.out.println("addition of two number is " + ans);
                break;
            case 1:
                ans = a - b;
                System.out.println("Substraction of two number is " + ans);
                break;
            case 2:
                ans = a * b;
                System.out.println("Multiplication of two number is " + ans);
                break;
            case 3:
                ans = a / b;
                System.out.println("Dividation of two number is " + ans);
                break;
            default:
                System.out.println("Error occur please select proper method");
            }
        }

    }
}
