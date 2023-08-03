package com.dao;

import java.util.Scanner;

public class 前n项质数和 {
    public static boolean isZhishu(int n){
        boolean sa=true;
        if (n==1){
            sa=false;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                sa=false;
                break;
            }else {
                sa=true;
                break;
            }
        }
        return sa;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int all=0;
        for (int j=0;j<x;j++){
            if (isZhishu(j)){
                all+=j;
            }
        }
        System.out.println(all);
    }
}
