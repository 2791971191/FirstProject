package com.dao;

import java.util.Scanner;

public  class f {
    public static boolean Zhishu(int x) {
        boolean a=true;
        boolean isPrime = true;
        if ( x == 1)
        {
            isPrime = false;
        }
        for( int i = 2; i< x; i++)
        {
            if(x % i ==0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int all=0;
        for (int j=0;j<x;j++){
            if(Zhishu(j))
            {
                all+=j;

            }
        }
        System.out.println(all);
    }
}
