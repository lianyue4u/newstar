package com.huawei.itcloiud.count;

public class MoneyCount {

    public static void main(String[] args) {
        int a, b;
        a = 11;
        b = 22;
        count(a, b);
    }


    public static void count(int a, int b) {
        int c = a + b;
        int d = a - b;
        int e = a / b;
        int f = a * b;
        System.out.println(c + "\n" + d + "\n" + e + "\n" + f);
    }


}
